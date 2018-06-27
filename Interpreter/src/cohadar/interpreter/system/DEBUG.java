package cohadar.interpreter.system;

import cohadar.interpreter.kernel.IProcess;

// transfers one integer from operand stack to debug stack
class DEBUG extends SystemFunction {

	@Override
	public void run(IProcess proc) {
		int x = proc.pop();
		proc.getDebugStack().push(x);
	}

	@Override
	public boolean needsSharedLock() {
		return false;
	}
}
