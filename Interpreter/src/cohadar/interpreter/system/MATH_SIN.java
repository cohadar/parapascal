package cohadar.interpreter.system;

// returns absolute value of real number
class MATH_SIN extends AbstractRealFunc {

	@Override
	protected float run(float arg) {
		return (float) Math.sin(arg);
	}
}
