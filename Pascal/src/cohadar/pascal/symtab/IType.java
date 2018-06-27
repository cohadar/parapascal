package cohadar.pascal.symtab;

import cohadar.pascal.symtab.types.Category;

//type's name (inherited from ISymbol) is it's unique id
public interface IType extends ISymbol {

	// size in integer words
	int getSize();

	// not unique id
	Category getCategory();
}
