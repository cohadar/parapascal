package cohadar.interpreter.other.programs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cohadar.interpreter.BaseTest;
import cohadar.interpreter.instructions.memory.ADDR;
import cohadar.interpreter.instructions.memory.LOAD;
import cohadar.interpreter.instructions.memory.STORE;
import cohadar.interpreter.instructions.programflow.EXIT;
import cohadar.interpreter.instructions.programflow.FORK;
import cohadar.interpreter.instructions.stack.CONST;
import cohadar.interpreter.instructions.stack.NOP;
import cohadar.interpreter.kernel.MemorySpace;
import cohadar.interpreter.program.AsmLabel;
import cohadar.interpreter.program.AsmVariable;
import cohadar.interpreter.program.CCProgram;

//test to see if instance variables are independent between processes
public class TestPrvi extends BaseTest {
	private final int address = 0x33;
	private final int value = 0x777;

	@Test
	public void testPrvi() {
		CCProgram program = new CCProgram();
		program.addSharedVariable(0x1000);
		program.addInstanceVariable(0x1000);
		AsmVariable x = new AsmVariable(MemorySpace.INSTANCE, "x", address, 1);
		AsmLabel njak = new AsmLabel("njak");

		program.addInstruction(new FORK(njak));
		program.addInstruction(new NOP());
		program.addInstruction(new NOP());
		program.addInstruction(new NOP());
		program.addInstruction(new NOP());
		program.addInstruction(new NOP());
		program.addInstruction(new NOP());
		program.addInstruction(new NOP());
		program.addInstruction(new NOP());
		program.addInstruction(new ADDR(x));
		program.addInstruction(new LOAD());
		program._debug();
		program.addInstruction(new EXIT(0));

		program._label(njak);
		program.addInstruction(new CONST(value));
		program.addInstruction(new ADDR(x));
		program.addInstruction(new STORE());

		program.addInstruction(new EXIT(0));

		run(program, false);
		assertEquals(p.pop(), 0);
	}
}
