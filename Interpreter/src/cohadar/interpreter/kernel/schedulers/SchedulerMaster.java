package cohadar.interpreter.kernel.schedulers;

public class SchedulerMaster {
	private static final IScheduler sRandom = new RandomScheduler();
	private static final IScheduler sFIFO = new FIFOScheduler();
	private static final IScheduler sPreemptive = new PreemptiveScheduler();
	private static final IScheduler sNonPreemptive = new NonPreemptiveScheduler();

	private static final IScheduler[] schedulers = { sRandom, sFIFO, sPreemptive, sNonPreemptive };

	public static IScheduler get(String name) {
		for (IScheduler s : schedulers) {
			if (s.getName().equals(name)) {
				return s;
			}
		}
		return null;
	}

	public static IScheduler get(int index) {
		return schedulers[index];
	}

	public static String[] getNames() {
		String[] ret = new String[schedulers.length];
		int i = 0;
		for (IScheduler s : schedulers) {
			ret[i++] = s.getName();
		}
		return ret;
	}
}
