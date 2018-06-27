package cohadar.pascal.symtab;

import org.antlr.runtime.tree.CommonTree;

public abstract class AbstractSymbol implements ISymbol {
	protected final CommonTree node;
	protected final String name;

	public AbstractSymbol(CommonTree node, String name) {
		this.node = node;
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getLine() {
		return node.getLine();
	}

	@Override
	public String toString() {
		return name;
	}
}
