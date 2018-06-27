package cohadar.interpreter.system;

import cohadar.interpreter.kernel.IProcess;

// function that takes one real and returns one real
abstract class AbstractRealFunc extends SystemFunction {

	@Override
	public void run(IProcess proc) {
		float arg = proc.popf();
		proc.pushf(run(arg));
	}

	@Override
	public boolean needsSharedLock() {
		return false;
	}

	protected abstract float run(float arg);
}
