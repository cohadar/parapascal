package cohadar.interpreter.instructions.programflow;

import cohadar.interpreter.kernel.IProcess;
import cohadar.interpreter.program.AsmLabel;

public class FORK extends AbstractInstructionWithLabel {

	public FORK(AsmLabel label) {
		super(label);
	}

	@Override
	public boolean run(IProcess proc) {
		if (proc.acquireSharedLock()) {
			proc.fork(label);
			return false;
		} else {
			return true;
		}
	}
}
