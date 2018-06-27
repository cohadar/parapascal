package cohadar.interpreter.instructions.memory;

import cohadar.interpreter.kernel.IProcess;
import cohadar.interpreter.program.AsmVariable;

// loads address of variable onto stack 
// this is basically 3 instructions: SADDR, IADDR, LADDR
// one for each memory space
public class ADDR extends AbstractInstructionWithVariable {

	public ADDR(AsmVariable var) {
		super(var);
	}

	@Override
	public boolean run(IProcess proc) {
		proc.push(var.getAbsoluteAddress());
		return false;
	}

}
