package cohadar.interpreter.kernel.schedulers;

import cohadar.interpreter.kernel.IKernel;

// runs one process as long as it can
public class NonPreemptiveScheduler implements IScheduler {
	private int oldId = -1;

	@Override
	public int getNextProcessId(IKernel kernel) {
		if ((oldId == -1) || (kernel.isProcessReady(oldId) == false)) {
			oldId = kernel.getReadyProcessId(0);
		}
		return oldId;
	}

	@Override
	public void reset() {
		oldId = -1;
	}

	@Override
	public String getName() {
		return "NonPreemptive";
	}

}
