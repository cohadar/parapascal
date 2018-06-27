package cohadar.interpreter.instructions.programflow;

import cohadar.interpreter.kernel.IProcess;
import cohadar.interpreter.program.AsmLabel;

/**
 * Branch unconditionally to specified label. 
 * Does not change stack.
 * 
 * <table class="stackTop">
 *     <tr><th>Before</th><th>After</th></tr>
 *     <tr><td>...</td><td>...</td></tr>
 * </table>
 * */
public class BR extends AbstractInstructionWithLabel {

	public BR(AsmLabel label) {
		super(label);
	}

	@Override
	public boolean run(IProcess proc) {
		proc.br(label);
		return false;
	}
}
