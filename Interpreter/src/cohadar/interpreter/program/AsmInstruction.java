package cohadar.interpreter.program;

import cohadar.interpreter.kernel.IProcess;

public interface AsmInstruction {

	String getName();

	/**
	 * Returns true if instruction needs to be repeated because
	 * it could not acquire shared memory lock
	 * */
	boolean run(IProcess proc);
}
