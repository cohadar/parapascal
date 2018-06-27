package cohadar.pascal.programs.statements;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cohadar.pascal.programs.TestPasProgram;

public class TestStatements extends TestPasProgram {
	@Override
	public String getPath() {
		return "test/cohadar/pascal/programs/statements/";
	}

	@Test
	public void test00() {
		debugProcess("test00.pas", false);
		for (int i = 1; i <= 10; i++) {
			assertEquals(i, p.pop());
		}
		assertEmptyStack();
	}

	@Test
	public void test01() {
		debugProcess("test01.pas", false);
		for (int i = 1; i <= 10; i++) {
			assertEquals(i, p.pop());
		}
		assertEmptyStack();
	}

	@Test
	public void test02() {
		debugProcess("test02.pas", false);
		for (int i = 1; i <= 10; i++) {
			assertEquals(i, p.pop());
		}
		assertEmptyStack();
	}

	@Test
	public void test03() {
		debugProcess("test03.pas", false);
		for (int i = 1; i <= 10; i++) {
			assertEquals(i, p.pop());
		}
		assertEmptyStack();
	}

	@Test
	public void test04() {
		debugProcess("test04.pas", false);
		for (int i = 10; i > 0; i--) {
			assertEquals(i, p.pop());
		}
		assertEmptyStack();
	}

	@Test
	public void test05() {
		debugProcess("test05.pas", false);
		for (int i = 1; i <= 10; i++) {
			assertEquals(i, p.pop());
		}
		assertEmptyStack();
	}

	@Test
	public void test06() {
		debugProcess("test06.pas", false);
		assertEquals(d111, p.pop());
		assertEmptyStack();
	}

	@Test
	public void test07() {
		debugProcess("test07.pas", false);
		assertEquals(d444, p.pop());
		assertEquals(d111, p.pop());
		assertEmptyStack();
	}

	@Test
	public void test08() {
		debugProcess("test08.pas", false);
		assertEquals(d444, p.pop());
		assertEquals(d333, p.pop());
		assertEquals(d222, p.pop());
		assertEquals(d111, p.pop());
		assertEmptyStack();
	}

	@Test
	public void test09() {
		debugProcess("test09.pas", false);
		int i = 0;
		for (i = 5; i >= 1; i--) {
			assertEquals(i, p.pop());
		}
		for (i = 1; i <= 5; i++) {
			assertEquals(i, p.pop());
		}

		for (i = 5; i >= 1; i--) {
			assertEquals(i, p.pop());
		}

		assertEmptyStack();

	}

}
