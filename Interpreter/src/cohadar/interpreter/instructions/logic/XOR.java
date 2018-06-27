package cohadar.interpreter.instructions.logic;


public class XOR extends AbstractLogicInstruction {

	@Override
	public int run(int a, int b) {
		return a ^ b;
	}
}
