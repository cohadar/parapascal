package cohadar.interpreter.system;

import cohadar.interpreter.kernel.IProcess;

// returns closes integer of a real number
class MATH_ROUND extends SystemFunction {

	@Override
	public void run(IProcess proc) {
		float arg = proc.popf();
		proc.push(Math.round(arg));
	}

	@Override
	public boolean needsSharedLock() {
		return false;
	}
}
