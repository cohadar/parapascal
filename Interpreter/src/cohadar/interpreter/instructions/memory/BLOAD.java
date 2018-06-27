package cohadar.interpreter.instructions.memory;

import cohadar.interpreter.instructions.AbstractInstruction0;
import cohadar.interpreter.kernel.IProcess;

// load "size" elements from "address" and push them onto stack 
public class BLOAD extends AbstractInstruction0 {

	@Override
	public boolean run(IProcess proc) {
		int size = proc.pop();
		int address = proc.pop();
		if (!canAccessAddress(proc, address)) {
			proc.push(address);
			proc.push(size);
			return true;
		}
		for (int i = 0; i < size; i++) {
			proc.push(proc.aload(address, i));
		}
		return false;
	}

}
