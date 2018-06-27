package cohadar.interpreter.system;

import cohadar.interpreter.kernel.IProcess;

// print new line
class PRINT_NL extends SystemFunction {

	@Override
	public void run(IProcess proc) {
		proc.print("\n");
	}

	@Override
	public boolean needsSharedLock() {
		return false;
	}
}
