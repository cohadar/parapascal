package cohadar.interpreter.exceptions;

public class NotASemaphore extends RuntimeException {
	public NotASemaphore(String funcName) {
		super(funcName + " - damaged pointer to semaphore.");
	}
}
