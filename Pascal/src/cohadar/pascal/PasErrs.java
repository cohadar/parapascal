package cohadar.pascal;

public interface PasErrs {
	final int UNDEFINED_IDENTIFIER = 101;
	final int UNDEFINED_TYPE = 103;
	final int UNDEFINED_FUNCTION = 104;
	final int UNDEFINED_FIELD = 105;

	final int BAD_OPERAND_TYPES = 111;
	final int INCOMPATIBLE_TYPES = 112;
	final int NOT_AN_ARRAY = 113;
	final int INDEX_TYPE = 114;
	final int NOT_A_RECORD = 115;
	final int NUMBER_OF_ARGUMENTS = 116;
	final int EXPECTED_REFERENCE = 117;
	final int BAD_WRITE_ARGUMENT = 118;
	final int NOT_A_CONSTANT = 119;
	final int NOT_AN_INTEGER = 120;
	final int NOT_A_BOOLEAN = 121;
	final int LOCAL_SHARED = 122;
	final int COFOR_OUTSIDE = 124;
	final int NOT_A_SHARED_VARIABLE = 126;
	final int AWAIT_OUTSIDE_REGION = 127;
	final int BREAK_OUTSIDE_LOOP = 128;
	final int NOT_A_RANGE = 129;

	// following errors are not pascal errors but runtime exceptions.
	// we make them pascal errors for easier display.
	// if you encounter one of these than code needs some fixing.
	final int LEXER = 201;
	final int PARSER = 202;
	final int WALKER = 203;
	final int COLORING = 204;

}
