package cohadar.interpreter.kernel.schedulers;

import cohadar.interpreter.kernel.IKernel;

// uses the fact that ready process list in kernel is FIFO
public class FIFOScheduler implements IScheduler {

	@Override
	public int getNextProcessId(IKernel kernel) {
		return kernel.getReadyProcessId(0);
	}

	@Override
	public void reset() {
	}

	@Override
	public String getName() {
		return "FIFO";
	}

}
