package cohadar.pascal.programs.expressions;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cohadar.pascal.programs.TestPasProgram;

public class TestExpressions extends TestPasProgram {
	@Override
	public String getPath() {
		return "test/cohadar/pascal/programs/expressions/";
	}

	@Test
	public void test00() {
		debugProcess("test00.pas", false);

		assertEquals(d111, p.pop());
		assertEmptyStack();
	}

	@Test
	public void test01() {
		debugProcess("test01.pas", false);

		assertEquals(d111, p.pop());
		assertEmptyStack();
	}

	@Test
	public void test06() {
		debugProcess("test06.pas", false);

		assertEquals(4.5, p.popf(), 0.01);
		assertEmptyStack();
	}

	@Test
	public void test07() {
		debugProcess("test07.pas", false);

		assertEquals(d333, p.popf(), 0.01);
		assertEmptyStack();
	}

	@Test
	public void test10() {
		debugProcess("test10.pas", false);
		assertEquals(0x00FFFFFF ^ 0xFFFFFF00, p.pop());
		assertEquals(0x00FFFFFF | 0xFFFFFF00, p.pop());
		assertEquals(0x00FFFFFF & 0xFFFFFF00, p.pop());
		assertEmptyStack();
	}
}
