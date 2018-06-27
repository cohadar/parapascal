package cohadar.interpreter.instructions.programflow;

import cohadar.interpreter.instructions.AbstractInstruction1;
import cohadar.interpreter.kernel.IProcess;

// virtual instruction, cannot be created by user, only by debugger
public class BREAK extends AbstractInstruction1 {

	private final int sourceLine;

	public BREAK(int sourceLine) {
		this.sourceLine = sourceLine;
	}

	@Override
	public boolean run(IProcess proc) {
		proc.breakPoint(sourceLine);
		return false;
	}

	public int getSourceLine() {
		return sourceLine;
	}

	@Override
	protected String param() {
		return "" + sourceLine + " ; --------";
	}

}
