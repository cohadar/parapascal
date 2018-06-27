package cohadar.pascal.programs;

import junit.framework.Assert;
import cohadar.assembler.Assembler;
import cohadar.assembler.TestProgram;
import cohadar.interpreter.kernel.DebugStack;
import cohadar.interpreter.program.CCProgram;
import cohadar.pascal.PCompiler;

public abstract class TestPasProgram extends TestProgram {
	protected CCProgram program;

	protected void debugProcess(String fileName, boolean print) {
		String asm = PCompiler.getListing(slurpTest(fileName));
		if (PCompiler.erlog.hasErrs()) {
			throw new RuntimeException("Compiler\n" + PCompiler.erlog.getAllErrText());
		}
		program = Assembler.assemble(asm);
		if (Assembler.erlog.hasErrs()) {
			throw new RuntimeException("Assembler\n" + Assembler.erlog.getAllErrText());
		}
		run(program, print);
	}

	public void assertEmptyStack(DebugStack p) {
		Assert.assertTrue(p.isEmpty());
	}

}
