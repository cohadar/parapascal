package cohadar.assembler.code;

import cohadar.interpreter.instructions.InstructionFactory;
import cohadar.interpreter.program.CCProgram;

public class TextBreakpoint implements TextLine {

	private final int sourceLine;

	TextBreakpoint(int sourceLine) {
		this.sourceLine = sourceLine;
	}

	@Override
	public void compile(AsmSource src, CCProgram prog) {
		prog.addInstruction(InstructionFactory.createBreakpoint(sourceLine));
	}

}
