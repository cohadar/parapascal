package cohadar.pascal.symtab.types;

import org.antlr.runtime.tree.CommonTree;

import cohadar.pascal.symtab.IType;

public class TypeArray extends AbstractType {
	private final IType baseType;
	private final TypeRange rangeType;

	TypeArray(CommonTree node, TypeRange rangeType, IType base) {
		super(node, formatName(rangeType, base));
		this.rangeType = rangeType;
		this.baseType = base;
	}

	public IType getBaseType() {
		return baseType;
	}

	public TypeRange getRangeType() {
		return rangeType;
	}

	@Override
	public int getSize() {
		return rangeType.getRange() * baseType.getSize();
	}

	@Override
	public Category getCategory() {
		return Category.ARRAY;
	}

	public static String formatName(IType rangeType, IType baseType) {
		return String.format("array [%s] of %s", rangeType.getName(), baseType.getName());
	}

}
