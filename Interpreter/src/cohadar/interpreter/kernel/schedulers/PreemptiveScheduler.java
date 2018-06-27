package cohadar.interpreter.kernel.schedulers;

import java.util.HashMap;
import java.util.Map;

import cohadar.interpreter.kernel.IKernel;

// every process gets fixed number of instruction runs
public class PreemptiveScheduler implements IScheduler {
	private static int MAX_RUNS = 100;

	private final Map<Integer, Integer> counts = new HashMap<Integer, Integer>();

	private int oldId = -1;

	@Override
	public int getNextProcessId(IKernel kernel) {
		if ((oldId == -1) || (kernel.isProcessReady(oldId) == false)) {
			oldId = kernel.getReadyProcessId(0);
		}
		if (oldId >= counts.size()) {
			counts.put(oldId, 1);
		} else {
			Integer count = counts.get(oldId);
			if (count < MAX_RUNS) {
				counts.put(oldId, count + 1);
			} else {
				counts.put(oldId, 0);
				for (int i = 0; i < kernel.getReadyProcessCount(); i++) {
					if (oldId != kernel.getReadyProcessId(i)) {
						oldId = kernel.getReadyProcessId(i);
						break;
					}
				}
			}
		}
		return oldId;
	}

	@Override
	public void reset() {
		oldId = -1;
		counts.clear();
	}

	@Override
	public String getName() {
		return "Preemptive";
	}

}
