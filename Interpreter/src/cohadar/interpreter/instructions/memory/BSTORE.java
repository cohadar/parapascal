package cohadar.interpreter.instructions.memory;

import cohadar.interpreter.instructions.AbstractInstruction0;
import cohadar.interpreter.kernel.IProcess;

// pop "size" elements from stack and store them into "address"
// stores elements from behind to negate stack inversion from BLOADX
public class BSTORE extends AbstractInstruction0 {

	@Override
	public boolean run(IProcess proc) {
		int size = proc.pop();
		int address = proc.pop();
		if (!canAccessAddress(proc, address)) {
			proc.push(address);
			proc.push(size);
			return true;
		}
		for (int i = size - 1; i >= 0; i--) {
			proc.astore(address, i, proc.pop());
		}
		return false;
	}

}
