package cohadar.interpreter.instructions.comparison;

public class EQ extends AbstractComparisonInstruction {

	@Override
	public int run(int a, int b) {
		return (a == b) ? -1 : 0;
	}

}
