package cohadar.interpreter.instructions.arithmetic;

/**
 * Decreases integer from stack top. 
 * One integer is removed from stack top and result is pushed back on the stack.
 * 
 * <table class="stackTop">
 *     <tr><th>Before</th><th>After</th></tr>
 *     <tr><td>X</td><td>X - 1</td></tr>
 * </table>
 * */
public class DEC extends AbstractUnaryInstruction {

	@Override
	protected int run(int b) {
		return b - 1;
	}

}
