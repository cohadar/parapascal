package cohadar.interpreter.system;

class MATH_EXP extends AbstractRealFunc {

	@Override
	protected float run(float arg) {
		return (float) Math.exp(arg);
	}
}
