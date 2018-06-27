package cohadar.pascal.symtab;

// TODO: report warnings of variables with access count zero
public interface IVariable extends ISymbol {
	IType getType();

	void incAccessCount();

	int getAccessCount();

	boolean isReference();

	boolean isShared();
}
