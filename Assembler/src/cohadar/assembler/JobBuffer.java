package cohadar.assembler;

public class JobBuffer {
	private Job job = null;
	private JobResults results = null;

	public synchronized Job getJob() {
		while (job == null) {
			try {
				this.wait();
			} catch (InterruptedException e) {
			}
		}
		return job;
	}

	public synchronized void putJob(Job newJob) {
		if (this.job == null) {
			this.job = newJob;
			this.notifyAll();
		} else {
			throw new RuntimeException("kernel job rewrite");
		}
	}

	public synchronized boolean isItDone() {
		return (job == null);
	}

	public synchronized void putResults(JobResults results) {
		job = null;
		if (this.results == null) {
			this.results = results;
		} else {
			throw new RuntimeException("kernel results rewrite");
		}
	}

	public synchronized JobResults getResults() {
		JobResults ret = results;
		results = null;
		return ret;
	}
}
