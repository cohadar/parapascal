package cohadar.interpreter.system;

import cohadar.interpreter.kernel.IProcess;

public abstract class SystemFunction {

	public abstract void run(IProcess proc);

	public abstract boolean needsSharedLock();

	public final String getName() {
		return "%" + getClass().getSimpleName();
	}

	@Override
	public String toString() {
		return getName();
	}
}
