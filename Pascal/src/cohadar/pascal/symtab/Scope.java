package cohadar.pascal.symtab;

import java.util.LinkedHashMap;
import java.util.Map;

public class Scope {
	private final Scope enclosingScope;
	private final Map<String, ISymbol> symbols = new LinkedHashMap<String, ISymbol>();
	private final String name;

	public Scope(Scope enclosingScope) {
		this.enclosingScope = enclosingScope;
		this.name = "<local>";
	}

	public Scope(Scope enclosingScope, String name) {
		this.enclosingScope = enclosingScope;
		this.name = name;
	}

	public ISymbol resolve(String name) {
		ISymbol s = symbols.get(name);
		if (s != null)
			return s;
		// if not here, check any enclosing scope
		if (enclosingScope != null)
			return enclosingScope.resolve(name);
		return null; // not found
	}

	public IVariable resolveVariable(String name) {
		ISymbol s = resolve(name);
		if (s instanceof IVariable) {
			return (IVariable) s;
		} else {
			return null;
		}
	}

	public ISymbol shallowResolve(String name) {
		return symbols.get(name);
	}

	public boolean define(ISymbol sym) {
		if (symbols.containsKey(sym.getName())) {
			return false;
		} else {
			symbols.put(sym.getName(), sym);
			return true;
		}
	}

	public Scope getEnclosingScope() {
		return enclosingScope;
	}

	@Override
	public String toString() {
		return symbols.keySet().toString();
	}

	public String getScopeName() {
		return name;
	}

}
