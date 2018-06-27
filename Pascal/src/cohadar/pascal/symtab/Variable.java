package cohadar.pascal.symtab;

import org.antlr.runtime.tree.CommonTree;

public class Variable extends AbstractSymbol implements IVariable {
	protected final IType type;
	protected int useCount = 0;
	private final boolean reference;
	private boolean shared = false;

	public Variable(CommonTree node, String name, IType type) {
		this(node, name, type, false);
	}

	public Variable(CommonTree node, String name, IType type, boolean reference) {
		super(node, name);
		this.type = type;
		this.reference = reference;
		if (type == null) {
			throw new NullPointerException(String.format("variable %s has null type", name));
		}
	}

	@Override
	public IType getType() {
		return type;
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
		if (type == null) {
			return String.format("%s", getName());
		} else {
			return String.format("%s<%s>", getName(), type.toString());
		}
	}

	@Override
	public boolean isReference() {
		return reference;
	}

	public void markAsShared() {
		shared = true;
	}

	@Override
	public boolean isShared() {
		return shared;
	}
}
