package cohadar.interpreter.kernel.schedulers;

import java.util.Random;

import cohadar.interpreter.kernel.IKernel;

// randomly choose next process after each instruction
public class RandomScheduler implements IScheduler {
	private final Random rand = new Random();

	@Override
	public int getNextProcessId(IKernel kernel) {
		int index = rand.nextInt(kernel.getReadyProcessCount());
		return kernel.getReadyProcessId(index);
	}

	@Override
	public void reset() {
	}

	@Override
	public String getName() {
		return "Random";
	}

}
