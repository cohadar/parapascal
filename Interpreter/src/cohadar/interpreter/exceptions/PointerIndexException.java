package cohadar.interpreter.exceptions;

public class PointerIndexException extends RuntimeException {
	public PointerIndexException(String msg) {
		super("pointer index out of bounds: " + msg);
	}
}
