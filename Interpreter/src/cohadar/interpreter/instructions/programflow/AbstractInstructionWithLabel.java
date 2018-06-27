package cohadar.interpreter.instructions.programflow;

import cohadar.interpreter.instructions.AbstractInstruction1;
import cohadar.interpreter.program.AsmLabel;

abstract class AbstractInstructionWithLabel extends AbstractInstruction1 {
	protected final AsmLabel label;

	public AsmLabel getLabel() {
		return label;
	}

	public AbstractInstructionWithLabel(AsmLabel label) {
		this.label = label;
	}

	@Override
	public String param() {
		return label.getName();
	}

}
