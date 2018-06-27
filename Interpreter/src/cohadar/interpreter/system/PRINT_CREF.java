package cohadar.interpreter.system;

import cohadar.interpreter.kernel.IProcess;

// print constant reference
class PRINT_CREF extends SystemFunction {

	@Override
	public void run(IProcess proc) {
		Object op = proc.getConstant(proc.pop());
		if (op instanceof String) {
			String s = (String) op;
			proc.print(s.replace("\\n", "\n"));
		} else {
			proc.print((op == null) ? "null" : op.toString());
		}

	}

	@Override
	public boolean needsSharedLock() {
		return false;
	}
}
