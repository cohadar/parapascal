package cohadar.interpreter.instructions.stack;

import cohadar.interpreter.instructions.AbstractInstruction1;
import cohadar.interpreter.kernel.IProcess;

// push integer constant on stack top
public class CONST extends AbstractInstruction1 {
	private final int c;

	public CONST(int c) {
		this.c = c;
	}

	public CONST(float f) {
		this.c = Float.floatToIntBits(f);
	}

	@Override
	public boolean run(IProcess proc) {
		proc.push(c);
		return false;
	}

	@Override
	protected String param() {
		return "" + c;
	}
}
