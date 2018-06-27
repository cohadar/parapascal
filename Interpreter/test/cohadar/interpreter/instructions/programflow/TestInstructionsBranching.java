package cohadar.interpreter.instructions.programflow;

import junit.framework.Assert;

import org.junit.Test;

import cohadar.interpreter.BaseTest;
import cohadar.interpreter.instructions.programflow.BR;
import cohadar.interpreter.instructions.programflow.BRNZ;
import cohadar.interpreter.instructions.programflow.BRZ;
import cohadar.interpreter.program.AsmLabel;
import cohadar.interpreter.program.CCProgram;

public class TestInstructionsBranching extends BaseTest {
	AsmLabel a1 = new AsmLabel("a1");
	AsmLabel a2 = new AsmLabel("a2");

	public void testBranching(int cond, AbstractInstructionWithLabel br, boolean hasBranched) {
		CCProgram program = new CCProgram();
		program._const(cond);
		program.addInstruction(br);
		program._const(0); // did not branch
		program._debug();
		program._exit0();
		program._label(br.getLabel());
		program._const(-1); // branched
		program._debug();
		program._exit0();

		run(program, false);

		Assert.assertEquals(p.pop(), (hasBranched) ? -1 : 0);
		Assert.assertTrue(p.isEmpty());
	}

	@Test
	public void testBR() {
		// BR instructions does not read or change operand stack
		testBranching(0, new BR(a1), true);
		testBranching(123, new BR(a2), true);
	}

	@Test
	public void testBRZ() {
		testBranching(0, new BRZ(a1), true);
		testBranching(456, new BRZ(a2), false);
	}

	@Test
	public void testBRNZ() {
		testBranching(0, new BRNZ(a1), false);
		testBranching(789, new BRNZ(a2), true);
	}

}
