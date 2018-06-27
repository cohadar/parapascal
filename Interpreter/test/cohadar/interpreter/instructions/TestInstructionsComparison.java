package cohadar.interpreter.instructions;

import org.junit.Test;

import cohadar.interpreter.BaseTest;
import cohadar.interpreter.instructions.comparison.EQ;
import cohadar.interpreter.instructions.comparison.GT;
import cohadar.interpreter.instructions.comparison.GTE;
import cohadar.interpreter.instructions.comparison.LT;
import cohadar.interpreter.instructions.comparison.LTE;
import cohadar.interpreter.instructions.comparison.NEQ;

public class TestInstructionsComparison extends BaseTest {
	private static final int a = -7;
	private static final int b = 33;

	@Test
	public void testEQ() {
		testInstruction(a, b, new EQ(), a == b);
		testInstruction(b, a, new EQ(), b == a);
		testInstruction(b, b, new EQ(), true);
	}

	@Test
	public void testNEQ() {
		testInstruction(a, b, new NEQ(), a != b);
		testInstruction(b, a, new NEQ(), b != a);
		testInstruction(b, b, new NEQ(), false);
	}

	@Test
	public void testLT() {
		testInstruction(a, b, new LT(), a < b);
		testInstruction(b, a, new LT(), b < a);
		testInstruction(b, b, new LT(), b < b);
	}

	@Test
	public void testLTE() {
		testInstruction(a, b, new LTE(), a <= b);
		testInstruction(b, a, new LTE(), b <= a);
		testInstruction(b, b, new LTE(), b <= b);
	}

	@Test
	public void testGT() {
		testInstruction(a, b, new GT(), a > b);
		testInstruction(b, a, new GT(), b > a);
		testInstruction(b, b, new GT(), b > b);
	}

	@Test
	public void testGTE() {
		testInstruction(a, b, new GTE(), a >= b);
		testInstruction(b, a, new GTE(), b >= a);
		testInstruction(b, b, new GTE(), b >= b);
	}

}
