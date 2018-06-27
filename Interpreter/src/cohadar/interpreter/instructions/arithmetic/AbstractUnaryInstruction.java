package cohadar.interpreter.instructions.arithmetic;

import cohadar.interpreter.instructions.AbstractInstruction0;
import cohadar.interpreter.kernel.IProcess;

abstract class AbstractUnaryInstruction extends AbstractInstruction0 {

	@Override
	public final boolean run(IProcess proc) {
		int b = proc.pop();
		proc.push(run(b));
		return false;
	}

	protected abstract int run(int b);

}
