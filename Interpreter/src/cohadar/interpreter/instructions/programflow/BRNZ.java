package cohadar.interpreter.instructions.programflow;

import cohadar.interpreter.kernel.IProcess;
import cohadar.interpreter.program.AsmLabel;

/**
 * Branch to label if integer on stack top is not zero.
 * Proceed to next instruction if integer is zero. 
 * This integer is removed from stack in either case.
 * 
 * <table class="stackTop">
 *     <tr><th>Before</th><th>After</th></tr>
 *     <tr><td>C</td><td>...</td></tr>
 *     <tr><td>...</td><td></td></tr>
 * </table>
 * */
public class BRNZ extends AbstractInstructionWithLabel {

	public BRNZ(AsmLabel label) {
		super(label);
	}

	@Override
	public boolean run(IProcess proc) {
		if (proc.pop() != 0) {
			proc.br(label);
		}
		return false;
	}
}
