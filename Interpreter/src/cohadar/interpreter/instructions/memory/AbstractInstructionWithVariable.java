package cohadar.interpreter.instructions.memory;

import cohadar.interpreter.instructions.AbstractInstruction1;
import cohadar.interpreter.program.AsmVariable;

abstract class AbstractInstructionWithVariable extends AbstractInstruction1 {
	protected final AsmVariable var;

	public AsmVariable getVariable() {
		return var;
	}

	public AbstractInstructionWithVariable(AsmVariable var) {
		this.var = var;
	}

	@Override
	public String param() {
		return String.format("%s ; %s", var.getName(), var.getMemorySpace());
	}

}
