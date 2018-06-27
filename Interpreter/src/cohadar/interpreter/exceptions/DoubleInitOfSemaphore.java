package cohadar.interpreter.exceptions;

public class DoubleInitOfSemaphore extends RuntimeException {
	public DoubleInitOfSemaphore(int semId) {
		super("Double initialization of semaphore #" + (semId + 1));
	}
}
