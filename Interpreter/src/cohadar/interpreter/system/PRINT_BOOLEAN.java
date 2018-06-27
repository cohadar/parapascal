package cohadar.interpreter.system;

import cohadar.interpreter.kernel.IProcess;

class PRINT_BOOLEAN extends SystemFunction {

	@Override
	public void run(IProcess proc) {
		int op = proc.pop();
		proc.print((op == 0) ? "false" : "true");
	}

	@Override
	public boolean needsSharedLock() {
		return false;
	}
}
