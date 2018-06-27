package cohadar.assembler.errors;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cohadar.assembler.AsmErrs;
import cohadar.assembler.Assembler;
import cohadar.assembler.TestProgram;
import cohadar.interpreter.program.CCProgram;
import cohadar.util.Err;

public class TestErrors extends TestProgram {
	@Override
	public String getPath() {
		return "test/cohadar/assembler/errors/";
	}

	Err err1 = null;
	Err err2 = null;
	Err err3 = null;

	private void testError(String fileName, boolean print) {
		CCProgram asm = Assembler.assemble(slurpTest(fileName));
		err1 = Assembler.erlog.getErr(0);
		if (Assembler.erlog.getErrCount() > 1) {
			err2 = Assembler.erlog.getErr(1);
		}
		if (Assembler.erlog.getErrCount() > 2) {
			err3 = Assembler.erlog.getErr(2);
		}
		if (print) {
			System.out.println(asm);
		}
	}

	@Test
	public void testNonIntegerToken() {
		testError("variable_location.asm", false);

		assertEquals(4, err1.getLine());
		assertEquals(AsmErrs.VARIABLE_LOCATION, err1.getType());
	}

}
