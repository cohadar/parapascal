package cohadar.interpreter.system;

import cohadar.interpreter.kernel.IProcess;

// put process to sleep a number of milliseconds
class PROC_SLEEP extends SystemFunction {

	@Override
	public void run(IProcess proc) {
		proc.sleep(proc.pop());
	}

	@Override
	public boolean needsSharedLock() {
		return true;
	}
}
