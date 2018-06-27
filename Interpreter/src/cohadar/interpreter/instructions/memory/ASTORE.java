package cohadar.interpreter.instructions.memory;

import cohadar.interpreter.instructions.AbstractInstruction0;
import cohadar.interpreter.kernel.IProcess;

public class ASTORE extends AbstractInstruction0 {

	@Override
	public boolean run(IProcess proc) {
		int address = proc.pop();
		if (!canAccessAddress(proc, address)) {
			proc.push(address);
			return true;
		}
		int index = proc.pop();
		int value = proc.pop();
		proc.astore(address, index, value);
		return false;
	}

}
