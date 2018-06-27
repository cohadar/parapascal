package cohadar.interpreter.instructions.programflow;

import cohadar.interpreter.instructions.AbstractInstruction0;
import cohadar.interpreter.kernel.IProcess;

public class JOIN extends AbstractInstruction0 {

	@Override
	public boolean run(IProcess proc) {
		if (proc.acquireSharedLock()) {
			proc.join();
			return false;
		} else {
			return true;
		}
	}
}
