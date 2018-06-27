package cohadar.interpreter.instructions;

import junit.framework.Assert;

import org.junit.Test;

import cohadar.interpreter.BaseTest;
import cohadar.interpreter.kernel.ExitCode;
import cohadar.interpreter.program.CCProgram;

// tests ALOAD and ASTORE bounds checking
// ALOADX and ASTOREX cannot check bounds because they have no explicit variable
public class TestInstructionsBoundExceptions extends BaseTest {

	public void testBOUND(int low, int high, int index, boolean shouldFail) {
		CCProgram program = new CCProgram();

		program._const(index);
		program._const(low);
		program._const(high);
		program._range();
		program._debug();
		program._exit0();

		if (shouldFail) {
			run(program, false);
			assertExitCode(0, ExitCode.RANGE_ERROR);
		} else {
			run(program, false);
			Assert.assertEquals(index, p.pop());
			assertEmptyStack();
		}
	}

	public void testABOUND(int low, int high, int index, boolean shouldFail) {
		CCProgram program = new CCProgram();

		program._const(index);
		program._const(low);
		program._const(high);
		program._index();
		program._debug();
		program._exit0();

		if (shouldFail) {
			run(program, false);
			assertExitCode(0, ExitCode.INDEX_ERROR);
		} else {
			run(program, false);
			Assert.assertEquals(index - low, p.pop()); // <---- index-low
			assertEmptyStack();
		}
	}

	@Test
	public void testBadBOUND() {
		testBOUND(3, 10, 2, true);
		testBOUND(3, 10, 11, true);
	}

	@Test
	public void testGoodBOUND() {
		testBOUND(3, 10, 3, false);
		testBOUND(3, 10, 4, false);
		testBOUND(3, 10, 7, false);
		testBOUND(3, 10, 9, false);
		testBOUND(3, 10, 10, false);
	}

	@Test
	public void testBadABOUND() {
		testABOUND(3, 10, 2, true);
		testABOUND(3, 10, 11, true);
	}

	@Test
	public void testGoodABOUND() {
		testABOUND(3, 10, 3, false);
		testABOUND(3, 10, 4, false);
		testABOUND(3, 10, 7, false);
		testABOUND(3, 10, 9, false);
		testABOUND(3, 10, 10, false);
	}

}
