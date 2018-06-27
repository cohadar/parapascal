package cohadar.interpreter.kernel;

// TODO: junit these
public class ExitCode {
	public static final int OK = 0;
	public static final int DIVIDE_ERROR = 0xFFFF0001;
	public static final int INDEX_ERROR = 0xFFFF0002;
	public static final int RANGE_ERROR = 0xFFFF0003;
	public static final int MEMORY_ACCESS_ERROR = 0xFFFF0004;
	public static final int PREMATURE_END_ERROR = 0xFFFF0005;
	public static final int RETURN_ERROR = 0xFFFF0006;
	public static final int CALL_ERROR = 0xFFFF0007;

	// not an error
	public static final int INSTRUCTION_EXCEPTION = 0xFFFF000F;
}
