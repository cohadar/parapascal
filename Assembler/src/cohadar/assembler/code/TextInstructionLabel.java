package cohadar.assembler.code;

import cohadar.assembler.AsmErrs;
import cohadar.interpreter.instructions.InstructionFactory;
import cohadar.interpreter.program.AsmInstruction;
import cohadar.interpreter.program.AsmLabel;
import cohadar.interpreter.program.CCProgram;

class TextInstructionLabel extends TextInstruction {
	final String labelName;

	public TextInstructionLabel(int line, String mnemonic, String labelName) {
		super(line, mnemonic);
		this.labelName = labelName;
	}

	@Override
	public void compile(AsmSource src, CCProgram prog) {
		AsmInstruction c = null;

		AsmLabel label = src.resolveLabel(labelName);
		if (label == null) {
			src.erlog.append(AsmErrs.UNDEFINED_LABEL, sourceLine, "undefined label: %s", labelName);
			return;
		} else {
			c = InstructionFactory.create(mnemonic, label);
		}

		if (c == null) {
			src.erlog.append(AsmErrs.BAD_OPERAND, sourceLine, "bad instruction %s %s", mnemonic.toUpperCase(),
					labelName);
			return;
		}
		prog.addInstruction(c);
	}
}
