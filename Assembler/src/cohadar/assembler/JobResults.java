package cohadar.assembler;

import cohadar.interpreter.kernel.StatisticModel;

public class JobResults {

	private final Exception exception;
	private final StatisticModel stats;
	private final int usage;
	private final long cycles;
	private final int processors;

	public JobResults(Exception exception, StatisticModel stats, int processors, int usage, long cycles) {
		this.exception = exception;
		this.stats = stats;
		this.processors = processors;
		this.usage = usage;
		this.cycles = cycles;
	}

	public StatisticModel getStatisticModel() {
		return stats;
	}

	public int getConcurrency() {
		return usage;
	}

	public long getCycles() {
		return cycles;
	}

	public Exception getException() {
		return exception;
	}

	public int getProcessorCount() {
		return processors;
	}

}
