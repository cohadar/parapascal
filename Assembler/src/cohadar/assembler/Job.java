package cohadar.assembler;

import cohadar.interpreter.program.CCProgram;

public class Job {
	private final CCProgram program;
	private final String schedulerName;
	private final int processorCount;

	public CCProgram getProgram() {
		return program;
	}

	public String getSchedulerName() {
		return schedulerName;
	}

	public int getProcessorCount() {
		return processorCount;
	}

	public Job(CCProgram program, String schedulerName, int processorCount) {
		this.program = program;
		this.schedulerName = schedulerName;
		this.processorCount = processorCount;
	}
}
