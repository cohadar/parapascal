package cohadar.interpreter.exceptions;


public class DeadlockException extends RuntimeException {
	public DeadlockException() {
		super("Check statistics for more info.");
	}
}
