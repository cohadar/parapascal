package cohadar.interpreter.program;

public class AsmFunction extends AsmLabel {

	protected int nArgs;

	protected int nLocals;

	protected int retSize;

	private boolean initialized = false;

	public AsmFunction(String name) {
		super(name);
	}

	public int getArgCount() {
		return nArgs;
	}

	public int getLocalCount() {
		return nLocals;
	}

	public int getRetSize() {
		return retSize;
	}

	public void setParams(int nArgs, int nLocals, int retSize) {
		if (initialized) {
			throw new RuntimeException("AsmFunction.setFunctionParams(int, int): " + this.getName());
		} else {
			this.nArgs = nArgs;
			this.nLocals = nLocals;
			this.retSize = retSize;
			this.initialized = true;
		}
	}

	@Override
	public String toString() {
		return String.format("%s(%d){%d}:", getName(), nArgs, nLocals);
	}

}
