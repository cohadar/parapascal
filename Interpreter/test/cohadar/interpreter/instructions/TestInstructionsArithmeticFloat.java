package cohadar.interpreter.instructions;

import junit.framework.Assert;

import org.junit.Test;

import cohadar.interpreter.BaseTest;
import cohadar.interpreter.instructions.arithmeticf.FADD;
import cohadar.interpreter.instructions.arithmeticf.FDEC;
import cohadar.interpreter.instructions.arithmeticf.FDIV;
import cohadar.interpreter.instructions.arithmeticf.FINC;
import cohadar.interpreter.instructions.arithmeticf.FMOD;
import cohadar.interpreter.instructions.arithmeticf.FMUL;
import cohadar.interpreter.instructions.arithmeticf.FNEG;
import cohadar.interpreter.instructions.arithmeticf.FSUB;
import cohadar.interpreter.instructions.arithmeticf.I2F;
import cohadar.interpreter.instructions.stack.CONST;
import cohadar.interpreter.program.CCProgram;

public class TestInstructionsArithmeticFloat extends BaseTest {

	private static final float a = 8.2f;
	private static final float b = 3.7f;
	private static final int ci = 333;
	private static final float cf = 333.0f;

	@Test
	public void testArithmetic() {
		testInstruction(a, b, new FADD(), a + b);
		testInstruction(a, b, new FSUB(), a - b);
		testInstruction(a, b, new FMUL(), a * b);
		testInstruction(a, b, new FDIV(), a / b);
		testInstruction(a, b, new FMOD(), a % b);
		testInstruction(a, b, new FINC(), b + 1);
		testInstruction(a, b, new FDEC(), b - 1);
		testInstruction(a, b, new FNEG(), 0 - b);
	}

	@Test
	public void testI2F() {
		CCProgram program = new CCProgram();
		program.addInstruction(new CONST(ci));
		program.addInstruction(new I2F());
		program._debug();
		program._exit0();
		run(program, false);
		Assert.assertEquals(p.popf(), cf, 0.01);
	}

}
