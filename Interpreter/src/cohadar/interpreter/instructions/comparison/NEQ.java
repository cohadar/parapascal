package cohadar.interpreter.instructions.comparison;

public class NEQ extends AbstractComparisonInstruction {

	@Override
	public int run(int a, int b) {
		return (a != b) ? -1 : 0;
	}

}
