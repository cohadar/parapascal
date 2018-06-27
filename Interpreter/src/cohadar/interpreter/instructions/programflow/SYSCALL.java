package cohadar.interpreter.instructions.programflow;

import cohadar.interpreter.instructions.AbstractInstruction1;
import cohadar.interpreter.kernel.IProcess;
import cohadar.interpreter.system.SystemFunction;

public class SYSCALL extends AbstractInstruction1 {
	private final boolean shared;

	private final SystemFunction sysfunc;

	public SYSCALL(SystemFunction sysfunc) {
		this.sysfunc = sysfunc;
		shared = sysfunc.needsSharedLock();
	}

	@Override
	public boolean run(IProcess proc) {
		if (shared) {
			if (proc.acquireSharedLock()) {
				proc.syscall(sysfunc);
				return false;
			} else {
				return true;
			}
		} else {
			proc.syscall(sysfunc);
			return false;
		}
	}

	@Override
	protected String param() {
		return sysfunc.getName();
	}
}
