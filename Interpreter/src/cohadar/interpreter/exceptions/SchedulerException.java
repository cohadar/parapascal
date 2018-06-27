package cohadar.interpreter.exceptions;

public class SchedulerException extends RuntimeException {
	public SchedulerException(String name, int id) {
		super(String.format("%s:\nReturned non-ready process: [%02X]\n", name, id));
	}
}
