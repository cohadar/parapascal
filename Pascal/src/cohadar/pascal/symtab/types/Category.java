package cohadar.pascal.symtab.types;

// used for type checking, type promotion, and static type analysis
// range types have category of their base type
// reference types have category of their base type
public enum Category {
	VOID, BOOLEAN, INTEGER, REAL, STRING, SEMAPHORE, ARRAY, RECORD, FUNCTION;

	public boolean isNumber() {
		return (this == INTEGER) || (this == REAL);
	}
}
