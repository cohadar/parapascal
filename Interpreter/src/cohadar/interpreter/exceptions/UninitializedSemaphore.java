package cohadar.interpreter.exceptions;

public class UninitializedSemaphore extends RuntimeException {
	public UninitializedSemaphore() {
		super("Semaphore not initialized.");
	}
}
