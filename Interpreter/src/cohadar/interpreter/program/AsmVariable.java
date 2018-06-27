package cohadar.interpreter.program;

import cohadar.interpreter.kernel.MemorySpace;

public class AsmVariable {
	// in which memory variable value(s) reside?
	private final MemorySpace space;

	// address relative to memory space
	private final int address;

	private final String name;

	private final int size;

	public AsmVariable(MemorySpace space, String name, int address, int size) {
		this.space = space;
		this.name = name;
		this.address = address;
		this.size = size;
		if (space == MemorySpace.INVALID) {
			throw new RuntimeException("Cannot use invalid memory space: " + name);
		}
		if ((address & 0xC0000000) != 0) {
			throw new RuntimeException("Invalid relative address of variable: " + name);
		}
	}

	// encoded space code + relative address
	public int getAbsoluteAddress() {
		return (space.ordinal() << 30) | address;
	}

	public void checkIndex(int index) {
		if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(String.format("%s[%d]", name, index));
		}
	}

	public String getName() {
		return name;
	}

	public MemorySpace getMemorySpace() {
		return space;
	}
}
