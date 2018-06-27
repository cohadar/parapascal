package cohadar.interpreter.system;

import cohadar.interpreter.exceptions.NotASemaphore;
import cohadar.interpreter.exceptions.UninitializedSemaphore;
import cohadar.interpreter.kernel.CCSemaphore;
import cohadar.interpreter.kernel.IProcess;

class SEM_SIGNAL extends SystemFunction {

	@Override
	public void run(IProcess proc) {
		int c = proc.pop();
		Object x = proc.getConstant(c);
		if (x == null) {
			throw new UninitializedSemaphore();
		} else if (x instanceof CCSemaphore) {
			CCSemaphore sem = (CCSemaphore) x;
			sem.doSignal(proc);
		} else {
			throw new NotASemaphore("SEM_SIGNAL");
		}
	}

	@Override
	public boolean needsSharedLock() {
		return true;
	}
}
