package cohadar.pascal.programs.functions;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cohadar.pascal.programs.TestPasProgram;

public class TestFunctions extends TestPasProgram {
	@Override
	public String getPath() {
		return "test/cohadar/pascal/programs/functions/";
	}

	@Test
	public void test00() {
		debugProcess("test00.pas", false);

		assertEquals(d333, p.pop());
		assertEquals(d222, p.pop());
		assertEquals(d111, p.pop());
		assertEmptyStack();
	}

	@Test
	public void test01() {
		debugProcess("test01.pas", false);

		assertEquals(d333, p.pop());
		assertEquals(d222, p.pop());
		assertEquals(d111, p.pop());
		assertEmptyStack();
	}

	@Test
	public void test02() {
		debugProcess("test02.pas", false);

		assertEquals(f333, p.popf(), 0.01);
		assertEquals(d222, p.pop());
		assertEquals(d111, p.pop());
		assertEmptyStack();
	}

	@Test
	public void test03() {
		debugProcess("test03.pas", false);

		assertEquals(d444, p.pop());
		assertEquals(d333, p.pop());
		assertEquals(d222, p.pop());
		assertEquals(d111, p.pop());
		assertEmptyStack();
	}

	@Test
	public void test04() {
		debugProcess("test04.pas", false);

		assertEquals(f333, p.popf(), 0.01);
		assertEquals(d222, p.pop());
		assertEquals(d111, p.pop());
		assertEmptyStack();
	}

	@Test
	public void test05() {
		debugProcess("test05.pas", false);

		assertEquals(d222, p.pop());
		assertEmptyStack();
	}

	@Test
	public void test06() {
		debugProcess("test06.pas", false);

		for (int i = 9; i >= 0; i--) {
			assertEquals(i, p.pop());
		}
		assertEmptyStack();
	}

}
