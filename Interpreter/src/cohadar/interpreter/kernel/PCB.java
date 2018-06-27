package cohadar.interpreter.kernel;

// process control block
class PCB {
	private final Kernel kernel;
	private final int id;
	private int exitCode = 0;

	private int nChildren = 0;
	private PCBState state;
	private final IProcess process;
	private String exitMessage;
	private long wakeupTime;

	PCB(Kernel kernel, int id, IProcess process) {
		this.kernel = kernel;
		this.process = process;
		this.id = id;
	}

	// ====================================================
	// all PCB functions should be called only from Kernel
	// ====================================================
	int getId() {
		return id;
	}

	PCBState getState() {
		return state;
	}

	void setState(PCBState state) {
		this.state = state;
	}

	IProcess getProcess() {
		return process;
	}

	int getExitCode() {
		return exitCode;
	}

	String getExitMessage() {
		return exitMessage;
	}

	void sleep(int milis) {
		wakeupTime = System.currentTimeMillis() + milis;
	}

	void fork() {
		PCB parent = getParent();
		if (parent != null) {
			parent.nChildren++;
		}
	}

	boolean join() {
		return (nChildren > 0);
	}

	void exit(int exitCode, String exitMessage) {
		this.exitMessage = exitMessage;
		this.exitCode = exitCode;

		PCB parent = getParent();
		if (parent != null) {
			if (parent.nChildren < 0) {
				throw new RuntimeException("nChildren count");
			} else {
				parent.nChildren--;
				if (parent.nChildren == 0) {
					kernel.lastChildExited(parent);
				}
			}
		}
	}

	long getWakeupTime() {
		return wakeupTime;
	}

	private PCB getParent() {
		if (process.getParent() == null) {
			return null;
		} else {
			return kernel.getPCB(process.getParent());
		}
	}
}
