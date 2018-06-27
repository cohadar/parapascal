package cohadar.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import cohadar.util.Util;

public class TestParseHex {

	@Test
	public void testPositive() {
		assertEquals(0x0, Util.parseHex("0"));
		assertEquals(0x123, Util.parseHex("123"));
		assertEquals(0x1234ABCD, Util.parseHex("1234ABCD"));
		assertEquals(0x7FFFFFFF, Util.parseHex("7FFFFFFF"));
	}

	@Test
	public void testNegative() {
		assertEquals(0x80000000, Util.parseHex("80000000"));
		assertEquals(0x8FFFFFFF, Util.parseHex("8FFFFFFF"));
		assertEquals(0xFF00FF00, Util.parseHex("FF00FF00"));
		assertEquals(0xFFFFFFFF, Util.parseHex("FFFFFFFF"));
	}

	private void testException(String hex) {
		try {
			Util.parseHex(hex);
			fail();
		} catch (NumberFormatException e) {
		}
	}

	@Test
	public void testExceptions() {
		testException("-1"); // no explicit negative
		testException("123456789"); // too big
		testException("12#3"); // invalid character
	}
}
