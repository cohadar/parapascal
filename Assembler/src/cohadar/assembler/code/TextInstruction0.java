package cohadar.assembler.code;

import cohadar.interpreter.instructions.InstructionFactory;
import cohadar.interpreter.program.AsmInstruction;
import cohadar.interpreter.program.CCProgram;

class TextInstruction0 extends TextInstruction {

	public TextInstruction0(int line, String mnemonic) {
		super(line, mnemonic);
	}

	@Override
	public void compile(AsmSource src, CCProgram prog) {
		AsmInstruction c = InstructionFactory.create(mnemonic);
		if (c == null) {
			throw new RuntimeException(String.format("line %d: Unknown instruction %s", sourceLine, mnemonic));
		}
		prog.addInstruction(c);
	}
}
