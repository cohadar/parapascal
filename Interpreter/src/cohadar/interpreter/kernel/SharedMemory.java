package cohadar.interpreter.kernel;

public class SharedMemory {
	private final int[] memory;

	public SharedMemory(int nShared) {
		memory = new int[nShared];
	}

	public int get(int address) {
		if ((address < 0) || (address >= memory.length)) {
			throw new RuntimeException("Shared Memory Error");
		}
		return memory[address];
	}

	public void set(int address, int value) {
		if ((address < 0) || (address >= memory.length)) {
			throw new RuntimeException("Shared Memory Error");
		}
		memory[address] = value;
	}
}
