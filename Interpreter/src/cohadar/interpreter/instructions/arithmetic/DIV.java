package cohadar.interpreter.instructions.arithmetic;

import cohadar.interpreter.instructions.AbstractInstruction0;
import cohadar.interpreter.kernel.ExitCode;
import cohadar.interpreter.kernel.IProcess;

/**
 * Divides two integers from stack top.
 * Two integers are removed from stack top and result is pushed back on the stack.
 * 
 * <table class="stackTop">
 *     <tr><th>Before</th><th>After</th></tr>
 *     <tr><td>Y</td><td>X / Y</td></tr>
 *     <tr><td>X</td><td>...</td></tr>
 * </table>
 * */
public class DIV extends AbstractInstruction0 {

	@Override
	public final boolean run(IProcess proc) {
		int b = proc.pop();
		int a = proc.pop();
		if (b == 0) {
			proc.exit(ExitCode.DIVIDE_ERROR, "Integer Division By Zero");
		} else {
			proc.push(a / b);
		}
		return false;
	}
}
