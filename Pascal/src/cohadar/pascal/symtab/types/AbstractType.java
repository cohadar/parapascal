package cohadar.pascal.symtab.types;

import org.antlr.runtime.tree.CommonTree;

import cohadar.pascal.symtab.AbstractSymbol;
import cohadar.pascal.symtab.IType;

// name of a Type is it's unique key
abstract class AbstractType extends AbstractSymbol implements IType {

	public AbstractType(CommonTree node, String name) {
		super(node, name);
	}

}
