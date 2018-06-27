package cohadar.interpreter.system;

import cohadar.interpreter.exceptions.DoubleInitOfSemaphore;
import cohadar.interpreter.exceptions.NotASemaphore;
import cohadar.interpreter.kernel.CCSemaphore;
import cohadar.interpreter.kernel.IProcess;

// system call for semaphore initialization
class SEM_INIT extends SystemFunction {

	@Override
	public void run(IProcess proc) {
		int val = proc.pop();
		int address = proc.pop();
		int c = proc.load(address);
		Object x = proc.getConstant(c);
		if (x == null) {
			CCSemaphore sem = new CCSemaphore(proc.getNewSemaphoreId());
			sem.doInit(val);
			c = proc.addConstant(sem);
			proc.store(address, c);
		} else if (x instanceof CCSemaphore) {
			throw new DoubleInitOfSemaphore(((CCSemaphore) x).getId());
		} else {
			throw new NotASemaphore("SEM_INIT");
		}
	}

	@Override
	public boolean needsSharedLock() {
		return true;
	}
}
