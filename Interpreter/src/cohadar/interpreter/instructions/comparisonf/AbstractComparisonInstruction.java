package cohadar.interpreter.instructions.comparisonf;

import cohadar.interpreter.instructions.AbstractInstruction0;
import cohadar.interpreter.kernel.IProcess;

abstract class AbstractComparisonInstruction extends AbstractInstruction0 {

	@Override
	public final boolean run(IProcess proc) {
		float b = proc.popf();
		float a = proc.popf();
		proc.push(run(a, b));
		return false;
	}

	public abstract int run(float a, float b);

}
