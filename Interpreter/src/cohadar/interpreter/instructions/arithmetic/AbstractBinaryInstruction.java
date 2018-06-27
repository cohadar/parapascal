package cohadar.interpreter.instructions.arithmetic;

import cohadar.interpreter.instructions.AbstractInstruction0;
import cohadar.interpreter.kernel.IProcess;

abstract class AbstractBinaryInstruction extends AbstractInstruction0 {

	@Override
	public final boolean run(IProcess proc) {
		int b = proc.pop();
		int a = proc.pop();
		proc.push(op(a, b));
		return false;
	}

	protected abstract int op(int a, int b);
}
