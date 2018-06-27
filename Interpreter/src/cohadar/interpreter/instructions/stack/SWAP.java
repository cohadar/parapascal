package cohadar.interpreter.instructions.stack;

import cohadar.interpreter.instructions.AbstractInstruction0;
import cohadar.interpreter.kernel.IProcess;

public class SWAP extends AbstractInstruction0 {

	@Override
	public boolean run(IProcess proc) {
		int b = proc.pop();
		int a = proc.pop();
		proc.push(b);
		proc.push(a);
		return false;
	}

}
