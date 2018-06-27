package cohadar.pascal.programs.constants;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cohadar.pascal.programs.TestPasProgram;

public class TestConstants extends TestPasProgram {
	@Override
	public String getPath() {
		return "test/cohadar/pascal/programs/constants/";
	}

	@Test
	public void test00() {
		debugProcess("test00.pas", false);

		assertEquals(FALSE, p.pop());
		assertEquals(TRUE, p.pop());
		assertEquals("hello", program.getConstant(p.pop()));
		assertEquals(f333, p.popf(), 0.01);
		assertEquals(d111, p.pop());
		assertEmptyStack();
	}

	@Test
	public void test01() {
		debugProcess("test01.pas", false);

		assertEquals(d111, p.pop());
		assertEquals(d111, p.pop());
		assertEmptyStack();
	}

	@Test
	public void test02() {
		debugProcess("test02.pas", false);

		assertEquals(FALSE, p.pop());
		assertEquals(TRUE, p.pop());
		assertEquals(-f333, p.popf(), 0.0);
		assertEquals(-d222, p.pop());
		assertEmptyStack();
	}

	@Test
	public void test03() {
		debugProcess("test03.pas", false);

		assertEquals(f333, p.popf(), 0.1);
		assertEquals(d333, p.pop());
		assertEmptyStack();
	}

	@Test
	public void test04() {
		debugProcess("test04.pas", false);

		assertEquals(f333, p.popf(), 0.1);
		assertEquals(d444, p.pop());
		assertEmptyStack();
	}

	@Test
	public void test05() {
		debugProcess("test05.pas", false);

		assertEquals(f444, p.popf(), 0.1);
		assertEquals(d333, p.pop());
		assertEmptyStack();
	}

	@Test
	public void test06() {
		debugProcess("test06.pas", false);

		assertEquals(d222, p.pop());
		assertEquals(d111, p.pop());
		assertEmptyStack();
	}

	@Test
	public void test07() {
		debugProcess("test07.pas", false);

		assertEquals(TRUE, p.pop());
		assertEquals(FALSE, p.pop());
		assertEquals(TRUE, p.pop());
		assertEquals(TRUE, p.pop());
		assertEmptyStack();
	}

	@Test
	public void test08() {
		debugProcess("test08.pas", false);

		assertEquals(TRUE, p.pop());
		assertEquals(FALSE, p.pop());
		assertEquals(FALSE, p.pop());
		assertEquals(TRUE, p.pop());
		assertEmptyStack();
	}

	@Test
	public void test09() {
		debugProcess("test09.pas", false);

		assertEquals(FALSE, p.pop());
		assertEquals(TRUE, p.pop());
		assertEquals(FALSE, p.pop());
		assertEquals(TRUE, p.pop());
		assertEquals(FALSE, p.pop());
		assertEquals(TRUE, p.pop());
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
