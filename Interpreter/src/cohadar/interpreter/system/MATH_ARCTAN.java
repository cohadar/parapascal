package cohadar.interpreter.system;

class MATH_ARCTAN extends AbstractRealFunc {

	@Override
	protected float run(float arg) {
		return (float) Math.atan(arg);
	}

}
