package cohadar.interpreter.instructions;

import java.util.EmptyStackException;

import junit.framework.Assert;

import org.junit.Test;

import cohadar.interpreter.BaseTest;
import cohadar.interpreter.instructions.stack.DIS;
import cohadar.interpreter.instructions.stack.DUP;
import cohadar.interpreter.instructions.stack.NOP;
import cohadar.interpreter.instructions.stack.SWAP;
import cohadar.interpreter.program.CCProgram;

/* PUSH should be the first instruction to look for errors 
 * because it is used in all other instruction tests 
 * */
public class TestInstructionsStack extends BaseTest {
	private static final int _int = 823;
	private static final Float _float = 3.14f;
	private static final Boolean _false = false;
	private static final Boolean _true = true;
	private static final Object _null = null;
	private static final String _string = "hello";

	@Test
	public void testPUSHconstant() {
		CCProgram program = new CCProgram();
		program._const(_int);
		program._debug();
		program._const(_float);
		program._debug();

		program._const(_false);
		program._debug();
		program._const(_true);
		program._debug();

		program._const(_null);
		program._debug();
		program._const(_string);
		program._debug();

		program._exit0();

		run(program, false);

		Assert.assertEquals(program.getConstant(p.pop()), _string);
		Assert.assertNull(program.getConstant(p.pop()));

		Assert.assertTrue(p.pop() == -1);
		Assert.assertTrue(p.pop() == 0);

		Assert.assertEquals(p.popf(), _float, 0.01);
		Assert.assertEquals(p.pop(), _int);
	}

	@Test
	public void testPOPconstant() {
		CCProgram program = new CCProgram();
		program._const(111);
		program._debug();
		program._const(222);
		program._debug();
		program._const(333);
		program.addInstruction(new DIS(1));
		program._exit0();

		run(program, false);

		Assert.assertEquals(p.pop(), 222);
		Assert.assertEquals(p.pop(), 111);
		try {
			p.pop();
			Assert.fail();
		} catch (EmptyStackException e) {
		}
	}

	@Test
	public void testNOP() {
		testInstruction2(111, 222, new NOP(), 111, 222);
	}

	@Test
	public void testDUP() {
		testInstruction2(111, 222, new DUP(), 222, 222);
	}

	@Test
	public void testSWAP() {
		testInstruction2(111, 222, new SWAP(), 222, 111);
	}

}
