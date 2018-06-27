package cohadar.interpreter.instructions.arithmeticf;

import cohadar.interpreter.instructions.AbstractInstruction0;
import cohadar.interpreter.kernel.IProcess;

abstract class AbstractUnaryInstruction extends AbstractInstruction0 {

	@Override
	public final boolean run(IProcess proc) {
		float b = proc.popf();
		proc.pushf(run(b));
		return false;
	}

	protected abstract float run(float b);

}
