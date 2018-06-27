package cohadar.pascal.symtab.types;

import org.antlr.runtime.tree.CommonTree;

import cohadar.pascal.symtab.IType;
import cohadar.util.Util;

public class TypeFunction extends AbstractType {
	protected final String asmName;
	protected final IType[] args;
	protected final boolean[] byref;
	protected final IType retType;

	// predefined functions
	public TypeFunction(String name, String asmName, IType retType, IType[] args) {
		this(name, asmName, retType, args, null);
	}

	// predefined functions
	public TypeFunction(String name, String asmName, IType retType, IType[] args, boolean[] byref) {
		super(null, name);
		this.asmName = asmName;
		this.retType = retType;
		this.args = args;
		this.byref = byref;
	}

	// user functions
	public TypeFunction(CommonTree node, String name, IType retType, IType[] args) {
		this(node, name, retType, args, null);
	}

	// user functions
	public TypeFunction(CommonTree node, String name, IType retType, IType[] args, boolean[] byref) {
		super(node, name);
		this.asmName = name;
		this.retType = retType;
		this.args = args;
		this.byref = byref;
	}

	public String getAsmName() {
		return asmName;
	}

	public IType[] getArguments() {
		return args;
	}

	public int getArgumentCount() {
		if (args == null) {
			return 0;
		} else {
			return args.length;
		}
	}

	public boolean isArgumentReference(int index) {
		if (byref == null) {
			return false;
		} else {
			return byref[index];
		}
	}

	public IType getReturnType() {
		return retType;
	}

	@Override
	public String toString() {
		String a = Util.replicate(", ", args);
		if (retType == BuiltIn.VOID) {
			return String.format("procedure %s(%s)", getName(), a);
		} else {
			return String.format("function %s(%s):%s", getName(), a, retType);
		}
	}

	public IType getArgument(int index) {
		return args[index];
	}

	@Override
	public int getSize() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Category getCategory() {
		return Category.FUNCTION;
	}
}