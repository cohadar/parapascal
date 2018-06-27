package cohadar.pascal.programs.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cohadar.interpreter.kernel.ExitCode;
import cohadar.pascal.programs.TestPasProgram;

public class TestArrays extends TestPasProgram {
	@Override
	public String getPath() {
		return "test/cohadar/pascal/programs/arrays/";
	}

	@Test
	public void test08() {
		debugProcess("test08.pas", false);

		assertEquals(d111, p.pop());
		assertEmptyStack();
	}

	@Test
	public void test09() {
		debugProcess("test09.pas", false);

		assertEquals(d111, p.pop());
		assertEmptyStack();
	}

	@Test
	public void test10() {
		debugProcess("test10.pas", false);

		for (int i = 10; i >= 3; i--) {
			assertEquals(i, p.pop());
		}
		assertEmptyStack();
	}

	@Test
	public void test11() {
		debugProcess("test11.pas", false);

		for (int i = 10; i >= 1; i--) {
			for (int j = 3; j >= -3; j--) {
				assertEquals(i + j, p.pop());
			}
		}
		assertEmptyStack();
	}

	@Test
	public void test12() {
		debugProcess("test12.pas", false);
		assertExitCode(0, ExitCode.INDEX_ERROR);
	}

	@Test
	public void test13() {
		debugProcess("test13.pas", false);
		assertExitCode(0, ExitCode.RANGE_ERROR);
	}

	@Test
	public void test14() {
		debugProcess("test14.pas", false);
		assertExitCode(0, ExitCode.RANGE_ERROR);
	}

	@Test
	public void test15() {
		debugProcess("test15.pas", false);

		assertEquals(d333, p.pop());
		assertEquals(d222, p.pop());
		assertEquals(d111, p.pop());
		assertEmptyStack();
	}

	@Test
	public void test16() {
		debugProcess("test16.pas", false);

		assertEquals(d333, p.pop());
		assertEmptyStack();
	}

	@Test
	public void test17() {
		debugProcess("test17.pas", false);

		assertEquals(d333, p.pop());
		assertEmptyStack();
	}

	@Test
	public void test18() {
		debugProcess("test18.pas", false);

		assertEquals(d333, p.pop());
		assertEmptyStack();
	}

	@Test
	public void test19() {
		debugProcess("test19.pas", false);

		assertEquals(d111, p.pop());
		assertEquals(0, p.pop());
		assertEmptyStack();
	}

	@Test
	public void test20() {
		debugProcess("test20.pas", false);

		assertEquals(0, p.pop());
		assertEquals(d111, p.pop());
		assertEquals(0, p.pop());
		assertEmptyStack();
	}

	@Test
	public void test21() {
		debugProcess("test21.pas", false);

		assertEquals(d111, p.pop());
		assertEquals(0, p.pop());
		assertEmptyStack();
	}

	@Test
	public void test22() {
		debugProcess("test22.pas", false);

		assertEquals(0, p.pop());
		assertEquals(d111, p.pop());
		assertEquals(0, p.pop());
		assertEmptyStack();
	}

	@Test
	public void test23() {
		debugProcess("test23.pas", false);

		for (int i = 9; i >= 0; i--) {
			assertEquals(i, p.pop());
		}
	}
}
