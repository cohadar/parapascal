package cohadar.pascal.symtab.types;

import org.antlr.runtime.tree.CommonTree;

import cohadar.pascal.symtab.IType;
import cohadar.pascal.symtab.SymbolTable;

// factory with goc-(Get or Create) functions for types without name identity
public class Factory {
	private final SymbolTable symtab;

	public Factory(SymbolTable symtab) {
		this.symtab = symtab;
	}

	public IType gocTypeRange(CommonTree dotdot, int low, int high) {
		String name = TypeRange.formatName(low, high);
		IType type = symtab.resolveType(name);
		if (type == null) {
			type = new TypeRange(dotdot, low, high);
			symtab.defineType(type);
		}
		return type;
	}

	public IType gocTypeArray(CommonTree array, IType rangeType, IType baseType) {
		String name = TypeArray.formatName(rangeType, baseType);
		IType type = symtab.resolveType(name);
		if (type == null) {
			type = new TypeArray(array, (TypeRange) rangeType, baseType);
			symtab.defineType(type);
		}
		return type;
	}
}
