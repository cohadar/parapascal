package cohadar.interpreter.instructions.stack;

import cohadar.interpreter.instructions.AbstractInstruction1;
import cohadar.interpreter.kernel.IProcess;

// discards constant number of operands from stack top
public class DIS extends AbstractInstruction1 {

	private final int c;

	public DIS(int c) {
		this.c = c;
	}

	@Override
	public boolean run(IProcess proc) {
		for (int i = 0; i < c; i++) {
			proc.pop();
		}
		return false;
	}

	@Override
	protected String param() {
		return "" + c;
	}
}
