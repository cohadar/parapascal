package cohadar.interpreter.instructions.memory;

import cohadar.interpreter.instructions.AbstractInstruction0;
import cohadar.interpreter.kernel.IProcess;

public class STORE extends AbstractInstruction0 {

	@Override
	public boolean run(IProcess proc) {
		int address = proc.pop();
		if (!canAccessAddress(proc, address)) {
			proc.push(address);
			return true;
		}
		int value = proc.pop();
		proc.store(address, value);
		return false;
	}

}
