package cohadar.interpreter.exceptions;

import cohadar.interpreter.program.AsmInstruction;

public class InstructionException extends RuntimeException {

	public InstructionException(int id, AsmInstruction line, Exception e) {
		super(String.format("[%02X] %s\n", id, line.toString()) + e.getMessage(), e);
	}

}
