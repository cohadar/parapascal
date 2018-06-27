package cohadar.interpreter.kernel.schedulers;

import cohadar.interpreter.kernel.IKernel;

public interface IScheduler {
	// Kernel will call getNextProcessId
	// only if there is at least 1 ready process
	int getNextProcessId(IKernel kernel);

	String getName();

	void reset();
}
