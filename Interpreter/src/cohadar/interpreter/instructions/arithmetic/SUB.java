package cohadar.interpreter.instructions.arithmetic;

/**
 * Subtracts two integers from stack top.
 * Two integers are removed from stack top and result is pushed back on the stack.
 * 
 * <table class="stackTop">
 *     <tr><th>Before</th><th>After</th></tr>
 *     <tr><td>Y</td><td>X - Y</td></tr>
 *     <tr><td>X</td><td>...</td></tr>
 * </table>
 * */
public class SUB extends AbstractBinaryInstruction {

	@Override
	protected int op(int a, int b) {
		return a - b;
	}
}
