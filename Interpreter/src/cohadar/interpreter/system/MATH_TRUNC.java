package cohadar.interpreter.system;

import cohadar.interpreter.kernel.IProcess;

// returns integer part of real number
class MATH_TRUNC extends SystemFunction {

	@Override
	public void run(IProcess proc) {
		float arg = proc.popf();
		proc.push((int) arg);
	}

	@Override
	public boolean needsSharedLock() {
		return false;
	}
}
