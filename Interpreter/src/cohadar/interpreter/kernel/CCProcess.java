package cohadar.interpreter.kernel;

import java.util.Arrays;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.Stack;

import cohadar.interpreter.exceptions.InstructionException;
import cohadar.interpreter.program.AsmFunction;
import cohadar.interpreter.program.AsmInstruction;
import cohadar.interpreter.program.AsmLabel;
import cohadar.interpreter.program.PointerIndex;
import cohadar.interpreter.system.SystemFunction;

public class CCProcess implements IProcess {
	private final Kernel kernel;
	private final IProcess parent;

	// shared stuff - start
	private final PointerIndex constantPool;
	private final AsmInstruction[] lines;
	private final SharedMemory shared;
	public final DebugStack debug;
	// shared stuff - end

	private final int[] instance_memory;

	private final Stack<Integer> operandStack;
	private final Stack<CallFrame> callStack;

	protected int instructionPointer = 0;
	protected int framePointer = 0;
	private final int id;

	@Override
	public IProcess getParent() {
		return parent;
	}

	public CCProcess(int id, Kernel kernel, int startLocation, AsmInstruction[] lines, int nShared, int nInstance,
			PointerIndex constantPool) {
		this.id = id;
		this.kernel = kernel;
		this.parent = null;
		this.constantPool = constantPool;
		this.lines = lines;
		this.shared = new SharedMemory(nShared);
		this.debug = new DebugStack();
		this.instance_memory = new int[nInstance];
		this.operandStack = new Stack<Integer>();
		this.callStack = new Stack<CallFrame>();
		this.instructionPointer = startLocation;
		this.framePointer = 0;
	}

	// forking constructor does deep copy of all Mutable objects
	public CCProcess(int id, CCProcess parent) {
		this.id = id;
		this.kernel = parent.kernel;
		this.parent = parent;
		this.constantPool = parent.constantPool;
		this.lines = parent.lines;
		this.shared = parent.shared;
		this.debug = parent.debug;
		this.instance_memory = Arrays.copyOf(parent.instance_memory, parent.instance_memory.length);

		this.operandStack = new Stack<Integer>();
		this.operandStack.setSize(parent.operandStack.size());
		Collections.copy(this.operandStack, parent.operandStack);

		this.callStack = new Stack<CallFrame>();
		this.callStack.setSize(parent.callStack.size());
		Collections.copy(this.callStack, parent.callStack);

		this.framePointer = parent.framePointer;
	}

	public int getPosition() {
		return instructionPointer;
	}

	@Override
	public boolean acquireSharedLock() {
		return kernel.acquireSharedLock();
	}

	@Override
	public AsmInstruction runOneInstruction() {
		if (instructionPointer >= lines.length) {
			exit(ExitCode.PREMATURE_END_ERROR, "no exit instruction at end of program");
			return null;
		}

		// AsmLabel label = getProgram().getLabelOnPos(instructionPointer);
		AsmInstruction line = lines[instructionPointer];
		instructionPointer++;
		try {
			if (line.run(this)) {
				instructionPointer--;
			}
		} catch (Exception e) {
			throw new InstructionException(getId(), line, e);
		}
		return line;
	}

	@Override
	public int getId() {
		return id;
	}

	// jump to label
	@Override
	public void br(AsmLabel label) {
		if (label.getAddress() == null) {
			throw new RuntimeException(String.format("label %s has null address", label.getName()));
		} else {
			instructionPointer = label.getAddress();
		}
	}

	@Override
	public void push(int x) {
		operandStack.push(x);
	}

	@Override
	public void pushf(float f) {
		operandStack.push(Float.floatToIntBits(f));
	}

	@Override
	public int pop() {
		return operandStack.pop();
	}

	@Override
	public float popf() {
		return Float.intBitsToFloat(operandStack.pop());
	}

	@Override
	public void syscall(SystemFunction func) {
		try {
			func.run(this);
		} catch (EmptyStackException e) {
			throw new RuntimeException("not enough arguments for system function " + func.getName());
		}
	}

	@Override
	public void call(AsmFunction func) {
		if (operandStack.size() < func.getArgCount()) {
			exit(ExitCode.CALL_ERROR,
					String.format("function %s expects %d arguments but only %d found", func.getName(),
							func.getArgCount(), operandStack.size()));
			return;
		}

		callStack.push(new CallFrame(func, instructionPointer, framePointer));

		instructionPointer = func.getAddress();
		framePointer = operandStack.size() - func.getArgCount();

		// initialize local variables with zeros
		for (int a = func.getLocalCount(); a > 0; a--) {
			operandStack.push(0);
		}

		// initialize return values with zeros
		for (int a = func.getRetSize(); a > 0; a--) {
			operandStack.push(0);
		}
	}

	@Override
	public void ret() {
		if (callStack.isEmpty()) {
			exit(ExitCode.RETURN_ERROR, "unpaired RET instruction");
			return;
		}

		CallFrame frame = callStack.pop();
		AsmFunction func = frame.func;

		int returnFrame = framePointer + func.getRetSize();
		int returnTop = framePointer + func.getArgCount() + func.getLocalCount() + func.getRetSize();

		instructionPointer = frame.returnAddress;
		framePointer = frame.framePointer;

		// cut out arguments and locals leaving return values on
		// top of the stack
		for (int i = func.getRetSize(); i > 0; i--) {
			int element = operandStack.get(returnTop - i);
			operandStack.set(returnFrame - i, element);
		}
		operandStack.setSize(returnFrame);
	}

	@Override
	public void nop() {
		// do really nothing?
	}

	@Override
	public int addConstant(Object c) {
		if (c == null) {
			return 0;
		}
		if (c instanceof Integer) {
			return (Integer) c;
		}
		if (c instanceof Float) {
			return Float.floatToIntBits((Float) c);
		}
		if (c instanceof Boolean) {
			return ((Boolean) c) ? -1 : 0; // -1 == 0xFFFFFFFF
		}
		constantPool.add(c);
		return constantPool.size() - 1;
	}

	@Override
	public Object getConstant(int index) {
		return constantPool.get(index);
	}

	@Override
	public void breakPoint(int sourceLine) {
		// TODO Auto-generated method stub

	}

	@Override
	public void print(String string) {
		System.out.print(string);
	}

	@Override
	public int load(int absolute_address) {
		return aload(absolute_address, 0);
	}

	// TODO: catch index out of bounds and re-throw more verbose error
	@Override
	public int aload(int absolute_address, int index) {
		int space = (absolute_address >> 30) & 3;
		int relative_address = (absolute_address & 0x3FFFFFFF);
		int ret;
		switch (space) {
		case 0: {
			throw new RuntimeException("cannot load from invalid address space");
		}
		case 1: {
			ret = operandStack.get(framePointer + relative_address + index);
			break;
		}
		case 2: {
			ret = instance_memory[relative_address + index];
			break;
		}
		case 3: {
			ret = shared.get(relative_address + index);
			break;
		}
		default:
			throw new RuntimeException("unknown memory space - should not happen");
		}
		return ret;
	}

	@Override
	public void store(int absolute_address, int value) {
		astore(absolute_address, 0, value);
	}

	@Override
	public void astore(int absolute_address, int index, int value) {
		int space = (absolute_address >> 30) & 3;
		int relative_address = (absolute_address & 0x3FFFFFFF);
		switch (space) {
		case 0: {
			throw new RuntimeException("cannot store into invalid address space");
		}
		case 1: {
			operandStack.set(framePointer + relative_address + index, value);
			break;
		}
		case 2: {
			instance_memory[relative_address + index] = value;
			break;
		}
		case 3: {
			shared.set(relative_address + index, value);
			break;
		}
		default:
			throw new RuntimeException("unknown memory space - should not happen");
		}
	}

	// for debugging
	public void printStack() {
		for (int i = 0; i < operandStack.size(); i++) {
			System.out.printf("0x%08X ", operandStack.get(i));
		}
		System.out.println();
	}

	@Override
	public DebugStack getDebugStack() {
		return debug;
	}

	// ==========================================================
	// KERNEL
	// ==========================================================
	@Override
	public void fork(AsmLabel label) {
		kernel.fork(this, label);
	}

	@Override
	public void join() {
		kernel.join(this);
	}

	@Override
	public void sleep(int milis) {
		kernel.sleep(this, milis);
	}

	@Override
	public void exit(int exitCode, String msg) {
		kernel.exit(this, exitCode, msg);
	}

	@Override
	public int getNewSemaphoreId() {
		return kernel.getNewSemaphoreId();
	}

	@Override
	public void block(CCSemaphore semaphore) {
		kernel.block(this);
	}

	@Override
	public void unblock(CCSemaphore semaphore) {
		kernel.unblock(this);
	}

}
