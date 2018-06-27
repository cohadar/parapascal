package cohadar.interpreter.program;

public class AsmLabel {
	protected final String name;
	protected int address;
	private boolean initialized = false;

	public AsmLabel(String name) {
		this.name = name;
	}

	// address must be set by CProgram
	public void setAddress(int address) {
		if (initialized) {
			throw new RuntimeException("AsmLabel.setAddress(): " + this.getName());
		} else {
			this.address = address;
			this.initialized = true;
		}
	}

	public String getName() {
		return name;
	}

	public Integer getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return name;
	}

}
