package cohadar.interpreter.system;

import cohadar.interpreter.kernel.IProcess;

// returns random real in range [0.0 - 1.0)
class MATH_RRAND extends SystemFunction {

	@Override
	public void run(IProcess proc) {
		proc.pushf(((float) Math.random()));
	}

	@Override
	public boolean needsSharedLock() {
		return false;
	}
}
