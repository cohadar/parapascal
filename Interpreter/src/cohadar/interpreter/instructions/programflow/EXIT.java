package cohadar.interpreter.instructions.programflow;

import cohadar.interpreter.instructions.AbstractInstruction1;
import cohadar.interpreter.kernel.IProcess;

public class EXIT extends AbstractInstruction1 {

	private final int exitCode;

	public EXIT(int exitCode) {
		this.exitCode = exitCode;
	}

	@Override
	public boolean run(IProcess proc) {
		proc.exit(exitCode, "exit " + exitCode);
		return false;
	}

	@Override
	protected String param() {
		return "" + exitCode;
	}
}
