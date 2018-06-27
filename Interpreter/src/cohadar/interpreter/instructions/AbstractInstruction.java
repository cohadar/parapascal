package cohadar.interpreter.instructions;

import cohadar.interpreter.kernel.IProcess;
import cohadar.interpreter.program.AsmInstruction;

public abstract class AbstractInstruction implements AsmInstruction {
	@Override
	public final String getName() {
		return getClass().getSimpleName().toLowerCase();
	}

	public static boolean canAccessAddress(IProcess proc, int address) {
		// shared memory code?
		if ((address & 0xC0000000) == (0xC0000000)) {
			if (proc.acquireSharedLock()) {
				return true;
			} else {
				return false;
			}
		} else {
			return true;
		}
	}
}
