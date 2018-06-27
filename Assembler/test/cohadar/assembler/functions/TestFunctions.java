package cohadar.assembler.functions;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cohadar.assembler.Assembler;
import cohadar.assembler.TestProgram;
import cohadar.interpreter.kernel.ExitCode;
import cohadar.interpreter.program.CCProgram;

public class TestFunctions extends TestProgram {
	@Override
	public String getPath() {
		return "test/cohadar/assembler/functions/";
	}

	@Test
	public void test00() {
		String text = slurpTest("func00.asm");
		CCProgram prog = Assembler.assemble(text);
		run(prog, false);

		assertEquals(d111, p.pop());
		assertEquals(d222, p.pop());
		assertEmptyStack();
	}

	@Test
	public void test01() {
		String text = slurpTest("func01.asm");
		CCProgram prog = Assembler.assemble(text);
		run(prog, false);
		;

		assertEquals(d111, p.pop());
		assertEquals(d333, p.pop());
		assertEquals(d222, p.pop());

		assertEmptyStack();
	}

	@Test
	public void test02() {
		String text = slurpTest("func02.asm");
		CCProgram prog = Assembler.assemble(text);
		run(prog, false);

		assertEquals(d111, p.pop());
		assertEquals(d333, p.pop());
		assertEquals(d444, p.pop());
		assertEquals(d222, p.pop());

		assertEmptyStack();
	}

	@Test
	public void test04() {
		String text = slurpTest("func04.asm");
		CCProgram prog = Assembler.assemble(text);
		run(prog, false);
		assertExitCode(0, ExitCode.RETURN_ERROR);
	}

	@Test
	public void test05() {
		String text = slurpTest("func05.asm");
		CCProgram prog = Assembler.assemble(text);
		run(prog, false);
		assertExitCode(0, ExitCode.CALL_ERROR);
	}

	@Test
	public void test06() {
		String text = slurpTest("func06.asm");
		CCProgram prog = Assembler.assemble(text);
		run(prog, false);

		assertEquals(d111, p.pop());
		assertEquals(d222, p.pop());
		assertEquals(d333, p.pop());
		assertEquals(d444, p.pop());

		assertEmptyStack();
	}

	@Test
	public void test07() {
		String text = slurpTest("func07.asm");
		CCProgram prog = Assembler.assemble(text);
		run(prog, false);
		;

		for (int i = 0; i < 4; i++) {
			assertEquals(0, p.pop());
		}

		assertEmptyStack();
	}

	@Test
	public void test08() {
		String text = slurpTest("func08.asm");
		CCProgram prog = Assembler.assemble(text);
		run(prog, false);

		assertEquals(222, p.pop());
		assertEquals(111, p.pop());

		assertEmptyStack();
	}

	private static final int fact10 = 3628800;

	@Test
	public void test09() {
		String text = slurpTest("func09.asm");
		CCProgram prog = Assembler.assemble(text);
		run(prog, false);

		assertEquals(fact10, p.pop());
		assertEmptyStack();
	}

}
