package cohadar.interpreter;

import junit.framework.Assert;
import cohadar.interpreter.instructions.stack.CONST;
import cohadar.interpreter.kernel.DebugStack;
import cohadar.interpreter.kernel.Kernel;
import cohadar.interpreter.program.AsmInstruction;
import cohadar.interpreter.program.CCProgram;

public class BaseTest {
	protected Kernel kernel = new Kernel();
	protected DebugStack p = null;

	private long end_time = 0x7FFFFFFFFFFFFFFFL;

	public void setTimeLimit(long milis) {
		end_time = System.currentTimeMillis() + milis;
	}

	protected void run(CCProgram program, boolean print) {
		kernel.reset();
		setTimeLimit(2000); // 2 seconds
		p = kernel.loadProgram(program).getDebugStack();
		while (kernel.runOneCycle(print) >= 0) {
			if (System.currentTimeMillis() > end_time) {
				throw new RuntimeException(String.format("Forced stop - time expired"));
			}
		}
	}

	public void assertEmptyStack() {
		Assert.assertTrue("DebugStack not empty", p.isEmpty());
	}

	public void assertExitCode(int id, int code) {
		Assert.assertEquals(code, kernel.getProcessExitCode(id));
	}

	protected void testInstruction(int op1, int op2, AsmInstruction ins, boolean result) {
		testInstruction(op1, op2, ins, (result) ? -1 : 0);
	}

	protected void testInstruction(int op1, int op2, AsmInstruction ins, int result) {
		CCProgram program = new CCProgram();
		program.addInstruction(new CONST(op1));
		program.addInstruction(new CONST(op2));
		program.addInstruction(ins);
		program._debug();
		program._exit0();
		run(program, false);
		Assert.assertEquals(p.pop(), result);
	}

	protected void testInstruction(float op1, float op2, AsmInstruction ins, float result) {
		CCProgram program = new CCProgram();
		program.addInstruction(new CONST(op1));
		program.addInstruction(new CONST(op2));
		program.addInstruction(ins);
		program._debug();
		program._exit0();
		run(program, false);
		Assert.assertEquals(p.popf(), result, 0.01);
	}

	protected void testInstruction2(int op1, int op2, AsmInstruction ins, int topm1, int top) {
		CCProgram program = new CCProgram();
		program.addInstruction(new CONST(op1));
		program.addInstruction(new CONST(op2));
		program.addInstruction(ins);
		program._debug();
		program._debug();
		program._exit0();
		run(program, false);
		Assert.assertEquals(p.pop(), topm1);
		Assert.assertEquals(p.pop(), top);
	}

}
