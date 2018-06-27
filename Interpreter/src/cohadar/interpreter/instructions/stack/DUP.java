package cohadar.interpreter.instructions.stack;

import cohadar.interpreter.instructions.AbstractInstruction0;
import cohadar.interpreter.kernel.IProcess;

public class DUP extends AbstractInstruction0 {

	@Override
	public boolean run(IProcess proc) {
		int x = proc.pop();
		proc.push(x);
		proc.push(x);
		return false;
	}

}
