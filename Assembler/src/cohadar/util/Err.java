package cohadar.util;

public class Err {
	private final String text;
	private final int line;
	private final int type;

	public Err(int type, int line, String plain) {
		this.type = type;
		this.line = line;
		this.text = plain;
	}

	public Err(int type, int line, String format, Object... args) {
		this.type = type;
		this.line = line;
		this.text = String.format(format, args);
	}

	@Override
	public String toString() {
		return String.format("line %d: %s", line, text);
	}

	public int getType() {
		return type;
	}

	public int getLine() {
		return line;
	}
}
