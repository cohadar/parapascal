package cohadar.interpreter.instructions.comparison;

import cohadar.interpreter.instructions.AbstractInstruction0;
import cohadar.interpreter.kernel.IProcess;

abstract class AbstractComparisonInstruction extends AbstractInstruction0 {

	@Override
	public final boolean run(IProcess proc) {
		int b = proc.pop();
		int a = proc.pop();
		proc.push(run(a, b));
		return false;
	}

	public abstract int run(int a, int b);

}
