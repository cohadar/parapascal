package cohadar.interpreter.instructions.programflow;

import cohadar.interpreter.instructions.AbstractInstruction0;
import cohadar.interpreter.kernel.IProcess;

public class RET extends AbstractInstruction0 {

	@Override
	public boolean run(IProcess proc) {
		proc.ret();
		return false;
	}

}
