package cohadar.pascal.grammar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.tree.Tree;

import cohadar.pascal.symtab.Constant;
import cohadar.pascal.symtab.IType;
import cohadar.pascal.symtab.IVariable;
import cohadar.pascal.symtab.Scope;

public class TreeAttributes {

	// link-get
	private final Map<Tree, Scope> scopes = new HashMap<Tree, Scope>();
	private final Map<Tree, IVariable> variables = new HashMap<Tree, IVariable>();
	private final Map<Tree, IType> types = new HashMap<Tree, IType>();
	private final Map<Tree, IType> types2 = new HashMap<Tree, IType>();
	private final Map<Tree, Integer> ints = new HashMap<Tree, Integer>();
	private final Map<Tree, String> strings = new HashMap<Tree, String>();
	private final Map<Tree, String> addr = new HashMap<Tree, String>();
	private final Map<Tree, String> prefix = new HashMap<Tree, String>();
	private final Map<Tree, String> sufix = new HashMap<Tree, String>();
	private final Map<Tree, List<Tree>> lists = new HashMap<Tree, List<Tree>>();
	private final Map<Tree, IType> promote = new HashMap<Tree, IType>();
	private final Map<Tree, Tree> nodes = new HashMap<Tree, Tree>();
	private final Map<Tree, Constant> constants = new HashMap<Tree, Constant>();

	public void reset() {
		variables.clear();
		scopes.clear();
		types.clear();
		types2.clear();
		ints.clear();
		strings.clear();
		addr.clear();
		lists.clear();
		promote.clear();
		nodes.clear();
		prefix.clear();
		sufix.clear();
		constants.clear();
	}

	public void linkScope(Tree node, Scope scope) {
		scopes.put(node, scope);
	}

	public void linkVariable(Tree node, IVariable var) {
		variables.put(node, var);
	}

	public void linkType(Tree node, IType type) {
		types.put(node, type);
	}

	public void linkType2(Tree node, IType type) {
		types2.put(node, type);
	}

	public void linkInteger(Tree node, Integer i) {
		ints.put(node, i);
	}

	public void linkString(Tree node, String s) {
		strings.put(node, s);
	}

	public void linkPrefix(Tree node, String s) {
		prefix.put(node, s);
	}

	public void linkSufix(Tree node, String s) {
		sufix.put(node, s);
	}

	public void linkADDR(Tree node, String s) {
		addr.put(node, s);
	}

	public void linkList(Tree node, List<Tree> list) {
		lists.put(node, list);
	}

	public void linkPromote(Tree node, IType type) {
		promote.put(node, type);
	}

	public void linkNode(Tree node, Tree node2) {
		nodes.put(node, node2);
	}

	public void linkConstant(Tree node, Constant constant) {
		constants.put(node, constant);
	}

	// -----------

	public Scope getScope(Tree node) {
		return scopes.get(node);
	}

	public IVariable getVariable(Tree node) {
		return variables.get(node);
	}

	public IType getType(Tree node) {
		return types.get(node);
	}

	public IType getType2(Tree node) {
		return types2.get(node);
	}

	public Integer getInteger(Tree node) {
		return ints.get(node);
	}

	public String getString(Tree node) {
		return strings.get(node);
	}

	public String getPrefix(Tree node) {
		return prefix.get(node);
	}

	public String getSufix(Tree node) {
		return sufix.get(node);
	}

	public String getADDR(Tree node) {
		return addr.get(node);
	}

	public List<Tree> getList(Tree node) {
		return lists.get(node);
	}

	public IType getPromote(Tree node) {
		return promote.get(node);
	}

	public Tree getNode(Tree node) {
		return nodes.get(node);
	}

	public Constant getConstant(Tree node) {
		return constants.get(node);
	}

}
