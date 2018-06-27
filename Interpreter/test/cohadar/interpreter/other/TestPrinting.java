package cohadar.interpreter.other;

import org.junit.Test;

import cohadar.interpreter.BaseTest;
import cohadar.interpreter.instructions.programflow.SYSCALL;
import cohadar.interpreter.instructions.stack.CONST;
import cohadar.interpreter.program.CCProgram;
import cohadar.interpreter.system.CCSystem;

// THIS IS NOT AUTOMATED TEST
// MAKE SURE CONSTANTS ARE PRINTED IN CONSOLE PROPERLY
public class TestPrinting extends BaseTest {
	private static final int _int = 823;
	private static final Float _float = 3.14f;
	private static final Boolean _false = false;
	private static final Boolean _true = true;
	private static final Object _null = null;
	private static final String _string = "hello";

	@Test
	public void testPrinting() {
		CCProgram program = new CCProgram();

		program.addInstruction(new CONST(program.addConstant(_string)));
		program.addInstruction(new CONST(program.addConstant(_null)));

		program.addInstruction(new CONST(program.addConstant(_true)));
		program.addInstruction(new CONST(program.addConstant(_false)));

		program.addInstruction(new CONST(program.addConstant(_float)));
		program.addInstruction(new CONST(program.addConstant(_int)));

		program.addInstruction(new SYSCALL(CCSystem.getSystemFunction("%PRINT_INTEGER")));
		program.addInstruction(new SYSCALL(CCSystem.getSystemFunction("%PRINT_NL")));
		program.addInstruction(new SYSCALL(CCSystem.getSystemFunction("%PRINT_REAL")));
		program.addInstruction(new SYSCALL(CCSystem.getSystemFunction("%PRINT_NL")));

		program.addInstruction(new SYSCALL(CCSystem.getSystemFunction("%PRINT_BOOLEAN")));
		program.addInstruction(new SYSCALL(CCSystem.getSystemFunction("%PRINT_NL")));
		program.addInstruction(new SYSCALL(CCSystem.getSystemFunction("%PRINT_BOOLEAN")));
		program.addInstruction(new SYSCALL(CCSystem.getSystemFunction("%PRINT_NL")));

		program.addInstruction(new SYSCALL(CCSystem.getSystemFunction("%PRINT_CREF")));
		program.addInstruction(new SYSCALL(CCSystem.getSystemFunction("%PRINT_NL")));
		program.addInstruction(new SYSCALL(CCSystem.getSystemFunction("%PRINT_CREF")));
		program.addInstruction(new SYSCALL(CCSystem.getSystemFunction("%PRINT_NL")));

		program._exit0();
		run(program, false);
	}

}
