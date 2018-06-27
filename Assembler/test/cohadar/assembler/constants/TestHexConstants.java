package cohadar.assembler.constants;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cohadar.assembler.Assembler;
import cohadar.assembler.TestProgram;
import cohadar.interpreter.program.CCProgram;

public class TestHexConstants extends TestProgram {

	@Override
	public String getPath() {
		return "test/cohadar/assembler/constants/";
	}

	@Test
	public void test00() {
		String text = slurpTest("hex00.asm");
		CCProgram prog = Assembler.assemble(text);
		run(prog, false);
		;

		assertEquals(0xFEDCBA98, p.pop());
		assertEquals(0x12345678, p.pop());
		assertEmptyStack();
	}

}
