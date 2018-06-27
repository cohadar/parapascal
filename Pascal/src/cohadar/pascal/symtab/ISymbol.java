package cohadar.pascal.symtab;

public interface ISymbol {
	// name is treated as unique id in pascal
	String getName();

	// line in source where ISymbol was found
	int getLine();
}
