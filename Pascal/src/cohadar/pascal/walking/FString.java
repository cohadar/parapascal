package cohadar.pascal.walking;

public class FString {
	private final String string;

	public FString(String plain) {
		this.string = plain;
	}

	public FString(String format, Object... args) {
		this.string = String.format(format, args);
	}

	@Override
	public String toString() {
		return string;
	}
}
