package cohadar.interpreter.system;

import cohadar.interpreter.kernel.IProcess;

class PRINT_INTEGER extends SystemFunction {

	@Override
	public void run(IProcess proc) {
		int op = proc.pop();
		proc.print("" + op);
	}

	@Override
	public boolean needsSharedLock() {
		return false;
	}
}
