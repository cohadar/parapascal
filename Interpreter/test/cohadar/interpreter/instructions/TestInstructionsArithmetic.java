package cohadar.interpreter.instructions;

import org.junit.Test;

import cohadar.interpreter.BaseTest;
import cohadar.interpreter.instructions.arithmetic.ADD;
import cohadar.interpreter.instructions.arithmetic.DEC;
import cohadar.interpreter.instructions.arithmetic.DIV;
import cohadar.interpreter.instructions.arithmetic.INC;
import cohadar.interpreter.instructions.arithmetic.MOD;
import cohadar.interpreter.instructions.arithmetic.MUL;
import cohadar.interpreter.instructions.arithmetic.NEG;
import cohadar.interpreter.instructions.arithmetic.SUB;

public class TestInstructionsArithmetic extends BaseTest {
	private static final int a = 8;
	private static final int b = 3;

	@Test
	public void testArithmetic() {
		testInstruction(a, b, new ADD(), a + b);
		testInstruction(a, b, new SUB(), a - b);
		testInstruction(a, b, new MUL(), a * b);
		testInstruction(a, b, new DIV(), a / b);
		testInstruction(a, b, new MOD(), a % b);
		testInstruction(a, b, new INC(), b + 1);
		testInstruction(a, b, new DEC(), b - 1);
		testInstruction(a, b, new NEG(), 0 - b);
	}
}
