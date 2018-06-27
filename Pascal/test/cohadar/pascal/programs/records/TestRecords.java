package cohadar.pascal.programs.records;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cohadar.pascal.programs.TestPasProgram;

public class TestRecords extends TestPasProgram {
	@Override
	public String getPath() {
		return "test/cohadar/pascal/programs/records/";
	}

	@Test
	public void test23() {
		debugProcess("test23.pas", false);

		assertEquals(f333, p.popf(), 0.01);
		assertEquals(d222, p.pop());
		assertEquals(d111, p.pop());
		assertEmptyStack();
	}

	@Test
	public void test24() {
		debugProcess("test24.pas", false);

		for (int i = 7; i >= 3; i--) {
			assertEquals(d[i] * d[i], p.pop());
			assertEquals(d[i], p.pop());
		}
	}

	@Test
	public void test25() {
		debugProcess("test25.pas", false);

		assertEquals(-1, p.pop()); // -1 == true
		assertEquals(f333, p.popf(), 0.01);
		assertEquals(d222, p.pop());
		assertEquals(d111, p.pop());
		assertEmptyStack();
	}

}
