package cohadar.interpreter.other;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.EmptyStackException;

import org.junit.Test;

import cohadar.interpreter.kernel.IProcess;
import cohadar.interpreter.kernel.Kernel;
import cohadar.interpreter.kernel.MemorySpace;
import cohadar.interpreter.program.AsmVariable;
import cohadar.interpreter.program.CCProgram;

public class TestCProcess {
	// x,y,z variables have same address but not in same space
	AsmVariable x = new AsmVariable(MemorySpace.SHARED, "x", 0x77, 100);
	AsmVariable y = new AsmVariable(MemorySpace.INSTANCE, "y", 0x77, 100);
	AsmVariable z = new AsmVariable(MemorySpace.LOCAL, "z", 0x77, 100);

	protected Kernel kernel = new Kernel();

	@Test
	public void testPushPop() {
		CCProgram prog = new CCProgram();

		IProcess c = kernel.loadProgram(prog);

		for (int i = 0; i < 1000; i++) {
			c.push(i * i);
		}

		for (int i = 1000 - 1; i >= 0; i--) {
			assertEquals(i * i, c.pop());
		}

		try {
			c.pop();
			fail();
		} catch (EmptyStackException e) {
		}
	}

	@Test
	public void testLoadStore() {
		CCProgram prog = new CCProgram();
		prog.addSharedVariable(0x1000);
		prog.addInstanceVariable(0x1000);
		IProcess c = kernel.loadProgram(prog);
		for (int i = 0; i < 1000; i++) {
			c.push(0);
		}

		c.store(x.getAbsoluteAddress(), 0x123);
		assertEquals(0x123, c.load(x.getAbsoluteAddress()));

		c.store(y.getAbsoluteAddress(), 0x123);
		assertEquals(0x123, c.load(y.getAbsoluteAddress()));

		c.store(z.getAbsoluteAddress(), 0x123);
		assertEquals(0x123, c.load(z.getAbsoluteAddress()));
	}

	@Test
	public void testArrayLoadStore() {
		CCProgram prog = new CCProgram();
		prog.addSharedVariable(0x1000);
		prog.addInstanceVariable(0x1000);
		IProcess c = kernel.loadProgram(prog);
		for (int i = 0; i < 1000; i++) {
			c.push(0);
		}

		for (int i = 0; i < 100; i++) {
			c.astore(x.getAbsoluteAddress(), i, i + 3);
			c.astore(y.getAbsoluteAddress(), i, i + 7);
			c.astore(z.getAbsoluteAddress(), i, i + 12);
		}

		for (int i = 0; i < 100; i++) {
			assertEquals(i + 3, c.aload(x.getAbsoluteAddress(), i));
			assertEquals(i + 7, c.aload(y.getAbsoluteAddress(), i));
			assertEquals(i + 12, c.aload(z.getAbsoluteAddress(), i));
		}
	}
}
