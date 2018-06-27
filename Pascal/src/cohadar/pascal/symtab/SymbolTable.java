package cohadar.pascal.symtab;

import java.util.HashMap;
import java.util.Map;

import cohadar.pascal.symtab.types.BuiltIn;
import cohadar.pascal.symtab.types.Factory;
import cohadar.pascal.symtab.types.TypeFunction;
import cohadar.pascal.symtab.types.TypeRecord;
import cohadar.util.ErrLogger;

public class SymbolTable {
	public final ErrLogger erlog;
	public final Factory typeFactory = new Factory(this);

	private Scope globals;
	private Scope currentScope;
	private final Map<String, IType> types = new HashMap<String, IType>();

	public void reset() {
		globals = new Scope(null, "<GLOBAL>");
		erlog.reset();
		currentScope = globals;
		types.clear();

		// init type system
		BuiltIn.initSymbolTable(this);
	}

	public SymbolTable(ErrLogger erlog) {
		this.erlog = erlog;
		reset();
	}

	public Scope getGlobalScope() {
		return globals;
	}

	public Scope getCurrentScope() {
		return currentScope;
	}

	public void newScope(String name) {
		if (name == null) {
			currentScope = new Scope(currentScope);
		} else {
			currentScope = new Scope(currentScope, name);
		}
	}

	public void leaveScope() {
		currentScope = currentScope.getEnclosingScope();
	}

	public void defineType(IType type) {
		if (types.containsKey(type.getName())) {
			throw new RuntimeException("Double defineType: " + type);
		} else {
			types.put(type.getName(), type);
			currentScope.define(type);
		}
	}

	public void defineTypeAlias(String name, IType type) {
		types.put(name, type);
	}

	public IType resolveType(String string) {
		return types.get(string);
	}

	public void define(ISymbol v) {
		currentScope.define(v);
	}

	public TypeFunction resolveFunction(String pasName) {
		IType t = types.get(pasName);
		if (t instanceof TypeFunction) {
			return (TypeFunction) t;
		} else {
			return null;
		}
	}

	public TypeRecord resolveRecord(String pasName) {
		IType t = types.get(pasName);
		if (t instanceof TypeRecord) {
			return (TypeRecord) t;
		} else {
			return null;
		}
	}

	public ConstantSymbol resolveConstant(String pasName) {
		ISymbol c = currentScope.resolve(pasName);
		if (c instanceof ConstantSymbol) {
			return (ConstantSymbol) c;
		} else {
			return null;
		}
	}

	@Override
	public String toString() {
		return globals.toString();
	}

}
