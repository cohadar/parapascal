package cohadar.interpreter.instructions;

import org.junit.Test;

import cohadar.interpreter.BaseTest;
import cohadar.interpreter.instructions.logic.AND;
import cohadar.interpreter.instructions.logic.NOT;
import cohadar.interpreter.instructions.logic.OR;
import cohadar.interpreter.instructions.logic.XOR;

public class TestInstructionsLogic extends BaseTest {
	private static final Integer a = 0xFF00;
	private static final Integer b = 0xF0F0;
	private static int c;
	private static int d;

	@Test
	public void testAND() {
		testInstruction(a, b, new AND(), a & b);

		c = -1;
		d = -1;
		testInstruction(c, d, new AND(), c & d);
		c = -1;
		d = 0;
		testInstruction(c, d, new AND(), c & d);
		c = 0;
		d = -1;
		testInstruction(c, d, new AND(), c & d);
		c = 0;
		d = 0;
		testInstruction(c, d, new AND(), c & d);
	}

	@Test
	public void testOR() {
		testInstruction(a, b, new OR(), a | b);

		c = -1;
		d = -1;
		testInstruction(c, d, new OR(), c | d);
		c = -1;
		d = 0;
		testInstruction(c, d, new OR(), c | d);
		c = 0;
		d = -1;
		testInstruction(c, d, new OR(), c | d);
		c = 0;
		d = 0;
		testInstruction(c, d, new OR(), c | d);
	}

	@Test
	public void testXOR() {
		testInstruction(a, b, new XOR(), a ^ b);

		c = -1;
		d = -1;
		testInstruction(c, d, new XOR(), c != d);
		c = -1;
		d = 0;
		testInstruction(c, d, new XOR(), c != d);
		c = 0;
		d = -1;
		testInstruction(c, d, new XOR(), c != d);
		c = 0;
		d = 0;
		testInstruction(c, d, new XOR(), c != d);
	}

	@Test
	public void testNOT() {
		testInstruction(a, b, new NOT(), ~b);
		testInstruction(123, -1, new NOT(), 0);
		testInstruction(123, 0, new NOT(), -1);
	}

}
