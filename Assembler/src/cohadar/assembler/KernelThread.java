package cohadar.assembler;

import cohadar.interpreter.kernel.Kernel;
import cohadar.interpreter.kernel.StatisticModel;

public class KernelThread extends Thread {
	private final Kernel kernel = new Kernel();
	private final JobBuffer jobBuffer;
	private Exception exc = null;
	private long total_executed;

	public KernelThread(JobBuffer buffer) {
		this.jobBuffer = buffer;
		this.setDaemon(true);
	}

	private StatisticModel getStats() {
		try {
			return kernel.getStatisticModel();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public synchronized void run() {
		while (true) {
			Job job = null;
			try {
				exc = null;
				total_executed = 0;
				job = jobBuffer.getJob();
				kernel.reset();
				kernel.setProcessorCount(job.getProcessorCount());
				if (job.getSchedulerName() != null) {
					kernel.setScheduler(job.getSchedulerName());
				}
				kernel.loadProgram(job.getProgram());
				runKernel();
			} catch (Exception e) {
				exc = e;
			} finally {
				int usage = (int) ((total_executed * 100) / (kernel.getCycles() * job.getProcessorCount()));
				jobBuffer
						.putResults(new JobResults(exc, getStats(), job.getProcessorCount(), usage, kernel.getCycles()));
			}
		}
	}

	private void runKernel() {
		int executed = 0;
		while ((executed = kernel.runOneCycle(false)) >= 0) {
			total_executed += executed;
			if (Thread.interrupted()) {
				exc = new InterruptedException("By user request.");
				return;
			}
		}
	}
}
