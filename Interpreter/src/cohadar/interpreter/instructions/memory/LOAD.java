package cohadar.interpreter.instructions.memory;

import cohadar.interpreter.instructions.AbstractInstruction0;
import cohadar.interpreter.kernel.IProcess;

public class LOAD extends AbstractInstruction0 {

	@Override
	public boolean run(IProcess proc) {
		int address = proc.pop();
		if (!canAccessAddress(proc, address)) {
			proc.push(address);
			return true;
		}
		proc.push(proc.load(address));
		return false;
	}

}
