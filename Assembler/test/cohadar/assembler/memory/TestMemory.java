package cohadar.assembler.memory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cohadar.assembler.Assembler;
import cohadar.assembler.TestProgram;
import cohadar.interpreter.program.CCProgram;

public class TestMemory extends TestProgram {

	@Override
	public String getPath() {
		return "test/cohadar/assembler/memory/";
	}

	@Test
	public void test00() {
		String text = slurpTest("mem00.asm");
		CCProgram prog = Assembler.assemble(text);
		run(prog, true);

		assertEquals(5, p.pop());
		assertEquals(4, p.pop());
		assertEmptyStack();
	}

	@Test
	public void testMem01() {
		String text = slurpTest("mem01.asm");
		CCProgram prog = Assembler.assemble(text);
		run(prog, false);
		;

		assertEquals(d444, p.pop());
		assertEquals(d333, p.pop());
		assertEmptyStack();
	}

	@Test
	public void testMem02() {
		String text = slurpTest("mem02.asm");
		CCProgram prog = Assembler.assemble(text);
		run(prog, false);
		;

		assertEquals(d444, p.pop());
		assertEquals(d333, p.pop());
		assertEmptyStack();
	}

	@Test
	public void testMem03() {
		String text = slurpTest("mem03.asm");
		CCProgram prog = Assembler.assemble(text);
		run(prog, false);
		;

		assertEquals(d111, p.pop());
		assertEquals(d444, p.pop());
		assertEquals(d333, p.pop());

		assertEmptyStack();
	}

	@Test
	public void testMem04() {
		String text = slurpTest("mem04.asm");
		CCProgram prog = Assembler.assemble(text);
		run(prog, false);
		;

		assertEquals(d333, p.pop());
		assertEquals(d222, p.pop());
		assertEquals(d111, p.pop());

		assertEmptyStack();
	}

}
