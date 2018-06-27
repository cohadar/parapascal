package cohadar.interpreter.instructions.arithmeticf;

import cohadar.interpreter.instructions.AbstractInstruction0;
import cohadar.interpreter.kernel.IProcess;

abstract class AbstractBinaryInstruction extends AbstractInstruction0 {

	@Override
	public final boolean run(IProcess proc) {
		float b = proc.popf();
		float a = proc.popf();
		proc.pushf(run(a, b));
		return false;
	}

	protected abstract float run(float a, float b);
}
