package cohadar.interpreter.system;

class MATH_COS extends AbstractRealFunc {

	@Override
	protected float run(float arg) {
		return (float) Math.cos(arg);
	}
}
