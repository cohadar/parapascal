package cohadar.interpreter.instructions.arithmetic;

/**
 * Negates integer from stack top. 
 * One integer is removed from stack top and result is pushed back on the stack.
 * 
 * <table class="stackTop">
 *     <tr><th>Before</th><th>After</th></tr>
 *     <tr><td>X</td><td>0 - X</td></tr>
 * </table>
 * */
public class NEG extends AbstractUnaryInstruction {

	@Override
	protected int run(int b) {
		return 0 - b;
	}

}
