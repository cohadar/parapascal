package cohadar.interpreter.instructions.stack;

import cohadar.interpreter.instructions.AbstractInstruction0;
import cohadar.interpreter.kernel.IProcess;

public class NOP extends AbstractInstruction0 {

	@Override
	public boolean run(IProcess proc) {
		proc.nop();
		return false;
	}

}
