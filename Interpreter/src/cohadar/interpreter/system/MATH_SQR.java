package cohadar.interpreter.system;

// returns absolute value of real number
class MATH_SQR extends AbstractRealFunc {

	@Override
	protected float run(float arg) {
		return arg * arg;
	}
}
