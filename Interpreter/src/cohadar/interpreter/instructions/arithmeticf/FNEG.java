package cohadar.interpreter.instructions.arithmeticf;

/**
 * Negates real number from stack top. 
 * One real is removed from stack top and result is pushed back on the stack.
 * 
 * <table class="stackTop">
 *     <tr><th>Before</th><th>After</th></tr>
 *     <tr><td>F</td><td>0.0 - F</td></tr>
 * </table>
 * */
public class FNEG extends AbstractUnaryInstruction {

	@Override
	protected float run(float b) {
		return 0 - b;
	}

}
