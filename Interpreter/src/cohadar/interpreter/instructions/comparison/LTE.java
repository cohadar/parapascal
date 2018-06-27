package cohadar.interpreter.instructions.comparison;

public class LTE extends AbstractComparisonInstruction {

	@Override
	public int run(int a, int b) {
		return (a <= b) ? -1 : 0;
	}

}
