package cohadar.assembler.code;

import cohadar.assembler.AsmErrs;
import cohadar.interpreter.instructions.InstructionFactory;
import cohadar.interpreter.program.AsmInstruction;
import cohadar.interpreter.program.AsmVariable;
import cohadar.interpreter.program.CCProgram;

class TextInstructionVariable extends TextInstruction {
	final String variableName;

	public TextInstructionVariable(int line, String mnemonic, String variableName) {
		super(line, mnemonic);
		this.variableName = variableName;
	}

	@Override
	public void compile(AsmSource src, CCProgram prog) {

		AsmInstruction c = null;
		AsmVariable var = src.resolveVariable(variableName);
		if (var == null) {
			src.erlog.append(AsmErrs.UNDEFINED_VARIABLE, sourceLine, "undefined variable %s", variableName);
			return;
		} else {
			c = InstructionFactory.create(mnemonic, var);
		}
		if (c == null) {
			src.erlog
					.append(AsmErrs.BAD_OPERAND, sourceLine, "bad operand %s %s", mnemonic.toUpperCase(), variableName);
			return;
		}
		prog.addInstruction(c);
	}
}
