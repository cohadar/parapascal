package cohadar.interpreter.instructions.comparisonf;

public class FNEQ extends AbstractComparisonInstruction {

	@Override
	public int run(float a, float b) {
		return (a != b) ? -1 : 0;
	}

}
