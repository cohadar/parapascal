package cohadar.interpreter.instructions.programflow;

import cohadar.interpreter.kernel.IProcess;
import cohadar.interpreter.program.AsmFunction;

public class CALL extends AbstractInstructionWithLabel {

	public CALL(AsmFunction label) {
		super(label);
	}

	@Override
	public boolean run(IProcess proc) {
		proc.call((AsmFunction) label);
		return false;
	}
}
