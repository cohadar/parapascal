package cohadar.assembler.code;

import cohadar.assembler.AsmErrs;
import cohadar.interpreter.instructions.InstructionFactory;
import cohadar.interpreter.program.AsmInstruction;
import cohadar.interpreter.program.CCProgram;
import cohadar.interpreter.system.CCSystem;
import cohadar.interpreter.system.SystemFunction;

class TextInstructionSyscall extends TextInstruction {
	final String funcName;

	public TextInstructionSyscall(int line, String mnemonic, String funcName) {
		super(line, mnemonic);
		this.funcName = funcName;
	}

	@Override
	public void compile(AsmSource src, CCProgram prog) {
		AsmInstruction c = null;

		SystemFunction slabel = CCSystem.getSystemFunction(funcName);
		if (slabel == null) {
			src.erlog.append(AsmErrs.UNKNOWN_SYSTEM_FUNCTION, sourceLine, "unknown system function: %s", funcName);
			return;
		} else {
			c = InstructionFactory.create(mnemonic, slabel);
		}

		if (c == null) {
			src.erlog
					.append(AsmErrs.BAD_OPERAND, sourceLine, "bad instruction %s %s", mnemonic.toUpperCase(), funcName);
			return;
		}
		prog.addInstruction(c);
	}
}
