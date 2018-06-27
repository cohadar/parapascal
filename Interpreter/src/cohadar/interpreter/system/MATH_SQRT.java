package cohadar.interpreter.system;

// returns absolute value of real number
class MATH_SQRT extends AbstractRealFunc {

	@Override
	protected float run(float arg) {
		return (float) Math.sqrt(arg);
	}
}
