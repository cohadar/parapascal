package cohadar.assembler.code;

import cohadar.interpreter.program.AsmLabel;
import cohadar.interpreter.program.CCProgram;

class TextLabel implements TextLine {
	final String labelName;
	public final int sourceLine;

	public TextLabel(int line, String labelName) {
		this.labelName = labelName;
		this.sourceLine = line;
	}

	@Override
	public void compile(AsmSource src, CCProgram prog) {
		AsmLabel label = src.resolveLabel(labelName);
		prog._label(label);
	}

}
