package cohadar.interpreter.instructions.arithmeticf;

/**
 * Increases real number from stack top. 
 * One real is removed from stack top and result is pushed back on the stack.
 * 
 * <table class="stackTop">
 *     <tr><th>Before</th><th>After</th></tr>
 *     <tr><td>F</td><td>F + 1.0</td></tr>
 * </table>
 * */
public class FINC extends AbstractUnaryInstruction {

	@Override
	protected float run(float b) {
		return b + 1;
	}

}
