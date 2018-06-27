package cohadar.assembler.code;

import cohadar.assembler.AsmErrs;
import cohadar.interpreter.instructions.InstructionFactory;
import cohadar.interpreter.program.AsmInstruction;
import cohadar.interpreter.program.CCProgram;

class TextInstructionConstant extends TextInstruction {
	final Object constant;

	public TextInstructionConstant(int line, String mnemonic, Object constant) {
		super(line, mnemonic);
		this.constant = constant;
	}

	@Override
	public void compile(AsmSource src, CCProgram prog) {
		AsmInstruction c = InstructionFactory.create(mnemonic, prog.addConstant(constant));
		if (c == null) {
			src.erlog.append(AsmErrs.BAD_OPERAND, sourceLine, "bad operand %s %s", mnemonic.toUpperCase(), constant);
			return;
		}
		prog.addInstruction(c);
	}
}
