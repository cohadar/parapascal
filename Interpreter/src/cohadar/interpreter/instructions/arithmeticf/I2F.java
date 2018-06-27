package cohadar.interpreter.instructions.arithmeticf;

import cohadar.interpreter.instructions.AbstractInstruction0;
import cohadar.interpreter.kernel.IProcess;

/**
 * Converts integer from stack top into real number. 
 * One integer is removed from stack top and one real is pushed back on the stack.
 * 
 * <table class="stackTop">
 *     <tr><th>Before</th><th>After</th></tr>
 *     <tr><td>A</td><td>F</td></tr>
 * </table>
 * */
public class I2F extends AbstractInstruction0 {

	@Override
	public boolean run(IProcess proc) {
		float f = proc.pop();
		proc.pushf(f);
		return false;
	}

}
