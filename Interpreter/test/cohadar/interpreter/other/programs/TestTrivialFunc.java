package cohadar.interpreter.other.programs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cohadar.interpreter.BaseTest;
import cohadar.interpreter.instructions.programflow.CALL;
import cohadar.interpreter.instructions.programflow.EXIT;
import cohadar.interpreter.instructions.programflow.RET;
import cohadar.interpreter.instructions.stack.CONST;
import cohadar.interpreter.program.AsmFunction;
import cohadar.interpreter.program.CCProgram;

// test function with zero parameters and zero return values;
public class TestTrivialFunc extends BaseTest {

	@Test
	public void testIt() {
		CCProgram program = new CCProgram();

		AsmFunction trivial = new AsmFunction("@trivial");
		trivial.setParams(0, 0, 0);
		AsmFunction main = new AsmFunction("@main");

		program._function(trivial);
		program.addInstruction(new RET());

		program._function(main);
		program.addInstruction(new CONST(1));
		program.addInstruction(new CONST(2));
		program.addInstruction(new CALL(trivial));
		program._debug();
		program._debug();
		program.addInstruction(new EXIT(0));

		run(program, false);

		assertEquals(1, p.pop());
		assertEquals(2, p.pop());

		assertEmptyStack();
	}
}
