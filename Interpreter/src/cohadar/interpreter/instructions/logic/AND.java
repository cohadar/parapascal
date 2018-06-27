package cohadar.interpreter.instructions.logic;


public class AND extends AbstractLogicInstruction {

	@Override
	public int run(int a, int b) {
		return a & b;
	}

}
