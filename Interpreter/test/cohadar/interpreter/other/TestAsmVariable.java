package cohadar.interpreter.other;

import org.junit.Assert;
import org.junit.Test;

import cohadar.interpreter.kernel.MemorySpace;
import cohadar.interpreter.program.AsmVariable;

public class TestAsmVariable {
	public static final int address_invalid = 0xFF00FF00;
	public static final int address1 = 0x00001234;
	public static final int address2 = 0x33330000;
	public static final int address3 = 0x34567890;

	// memory space codes
	public static final int INVALID = 0 << 30;
	public static final int LOCAL = 1 << 30;
	public static final int INSTANCE = 2 << 30;
	public static final int SHARED = 3 << 30;

	@Test
	public void testAAddress() {

		AsmVariable x = new AsmVariable(MemorySpace.LOCAL, "x", address1, 1);
		Assert.assertTrue(x.getAbsoluteAddress() == (LOCAL | (address1)));

		AsmVariable y = new AsmVariable(MemorySpace.INSTANCE, "y", address2, 1);
		Assert.assertTrue(y.getAbsoluteAddress() == (INSTANCE | address2));

		AsmVariable z = new AsmVariable(MemorySpace.SHARED, "z", address3, 1);
		Assert.assertTrue(z.getAbsoluteAddress() == (SHARED | address3));

		try {
			new AsmVariable(MemorySpace.INVALID, "w", 0, 1);
			Assert.fail();
		} catch (RuntimeException e) {
		}

		try {
			new AsmVariable(MemorySpace.SHARED, "t", address_invalid, 1);
			Assert.fail();
		} catch (RuntimeException e) {
		}
	}
}
