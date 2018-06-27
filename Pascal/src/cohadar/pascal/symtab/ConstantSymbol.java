package cohadar.pascal.symtab;

import org.antlr.runtime.tree.CommonTree;

public class ConstantSymbol extends AbstractSymbol implements IVariable {
	protected int useCount = 0;
	private final Constant c;

	public ConstantSymbol(CommonTree node, String name, Constant constant) {
		super(node, name);
		this.c = constant;
	}

	@Override
	public IType getType() {
		return c.getType();
	}

	public Constant getConstant() {
		return c;
	}

	@Override
	public void incAccessCount() {
		useCount++;
	}

	@Override
	public int getAccessCount() {
		return useCount;
	}

	@Override
	public String toString() {
		return String.format("<%s='%s'>", getType().toString(), getName());
	}

	@Override
	public boolean isReference() {
		return false;
	}

	@Override
	public boolean isShared() {
		return false;
	}
}
