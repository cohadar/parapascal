package cohadar.interpreter.instructions.logic;

import cohadar.interpreter.instructions.AbstractInstruction0;
import cohadar.interpreter.kernel.IProcess;

public class NOT extends AbstractInstruction0 {

	@Override
	public final boolean run(IProcess proc) {
		int x = proc.pop();
		proc.push(~x);
		return false;
	}

}
