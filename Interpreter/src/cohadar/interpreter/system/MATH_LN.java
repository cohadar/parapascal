package cohadar.interpreter.system;

// returns natural logarithm - base e
class MATH_LN extends AbstractRealFunc {

	@Override
	protected float run(float arg) {
		return (float) Math.log(arg);
	}
}
