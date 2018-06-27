package cohadar.interpreter.instructions;

/** Instruction with one parameter. */
public abstract class AbstractInstruction1 extends AbstractInstruction {

	protected abstract String param();

	@Override
	public final String toString() {
		StringBuilder sb = new StringBuilder(getName());
		// max asm instruction name length is 7 (syscall)
		// so we append spaces to shorter instructions
		// to align operands when printing
		for (int i = 7 - sb.length(); i > 0; i--) {
			sb.append(' ');
		}
		sb.append(' ');

		sb.append(param());
		return sb.toString();
	}
}
