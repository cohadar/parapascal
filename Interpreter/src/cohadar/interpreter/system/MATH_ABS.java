package cohadar.interpreter.system;

// returns absolute value of real number
class MATH_ABS extends AbstractRealFunc {

	@Override
	protected float run(float arg) {
		return Math.abs(arg);
	}

}
