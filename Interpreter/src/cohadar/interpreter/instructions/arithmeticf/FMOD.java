package cohadar.interpreter.instructions.arithmeticf;

/**
 * Calculates real-modulo of real numbers from stack top. 
 * Two reals are removed from stack top and result is pushed back on the stack.
 * 
 * <table class="stackTop">
 *     <tr><th>Before</th><th>After</th></tr>
 *     <tr><td>G</td><td>F % G</td></tr>
 *     <tr><td>F</td><td>...</td></tr>
 * </table>
 * */
public class FMOD extends AbstractBinaryInstruction {

	@Override
	protected float run(float a, float b) {
		return a % b;
	}
}
