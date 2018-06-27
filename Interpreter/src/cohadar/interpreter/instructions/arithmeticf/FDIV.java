package cohadar.interpreter.instructions.arithmeticf;

import cohadar.interpreter.instructions.AbstractInstruction0;
import cohadar.interpreter.kernel.ExitCode;
import cohadar.interpreter.kernel.IProcess;

/**
 * Divides two real numbers from stack top. 
 * Two reals are removed from stack top and result is pushed back on the stack.
 * 
 * <table class="stackTop">
 *     <tr><th>Before</th><th>After</th></tr>
 *     <tr><td>G</td><td>F / G</td></tr>
 *     <tr><td>F</td><td>...</td></tr>
 * </table>
 * */
public class FDIV extends AbstractInstruction0 {

	@Override
	public final boolean run(IProcess proc) {
		float b = proc.popf();
		float a = proc.popf();
		if (b == 0) {
			proc.exit(ExitCode.DIVIDE_ERROR, "Float Division By Zero");
		} else {
			proc.pushf(a / b);
		}
		return false;
	}

}
