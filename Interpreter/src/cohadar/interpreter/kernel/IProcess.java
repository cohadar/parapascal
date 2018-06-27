package cohadar.interpreter.kernel;

import cohadar.interpreter.program.AsmFunction;
import cohadar.interpreter.program.AsmInstruction;
import cohadar.interpreter.program.AsmLabel;
import cohadar.interpreter.system.SystemFunction;

public interface IProcess {
	int getId();

	IProcess getParent();

	DebugStack getDebugStack();

	AsmInstruction runOneInstruction();

	boolean acquireSharedLock();

	// ==========================
	void push(int nextInt);

	int pop();

	void pushf(float run);

	float popf();

	// ==========================
	int load(int address);

	void store(int address, int value);

	int aload(int address, int index);

	void astore(int address, int index, int value);

	// ==========================
	Object getConstant(int pop);

	int addConstant(Object x);

	// ==========================
	int getNewSemaphoreId();

	void block(CCSemaphore semaphore);

	void unblock(CCSemaphore semaphore);

	void fork(AsmLabel label);

	void join();

	void sleep(int milis);

	void exit(int exitCode, String msg);

	// ==========================
	void br(AsmLabel label);

	void call(AsmFunction label);

	void ret();

	void syscall(SystemFunction sysfunc);

	void print(String string);

	void breakPoint(int sourceLine);

	void nop();
}
