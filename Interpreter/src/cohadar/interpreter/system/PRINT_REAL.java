package cohadar.interpreter.system;

import cohadar.interpreter.kernel.IProcess;

class PRINT_REAL extends SystemFunction {

	@Override
	public void run(IProcess proc) {
		float op = proc.popf();
		proc.print("" + op);
	}

	@Override
	public boolean needsSharedLock() {
		return false;
	}
}
