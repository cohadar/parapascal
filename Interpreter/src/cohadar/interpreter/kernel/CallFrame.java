package cohadar.interpreter.kernel;

import cohadar.interpreter.program.AsmFunction;


public class CallFrame {
	public final AsmFunction func; // associated with which function?
	public final int returnAddress; // the instruction following the call
	public final int framePointer;

	public CallFrame(AsmFunction func, int returnAddress, int framePointer) {
		this.func = func;
		this.returnAddress = returnAddress;
		this.framePointer = framePointer;
	}
}
