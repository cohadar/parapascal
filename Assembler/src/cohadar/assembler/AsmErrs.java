package cohadar.assembler;

// TODO: make junit tests for these
public interface AsmErrs {
	// semantic errors
	final int VARIABLE_LOCATION = 3;
	final int BAD_OPERAND = 5;
	final int UNDEFINED_LABEL = 6;
	final int UNKNOWN_SYSTEM_FUNCTION = 7;
	final int UNDEFINED_VARIABLE = 8;
	final int DUPLICATE_NAME = 9;

	// non-semantic errors
	final int LEXER = 50;
	final int PARSER = 51;
}
