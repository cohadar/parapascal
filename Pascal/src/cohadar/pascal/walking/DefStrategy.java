package cohadar.pascal.walking;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

import cohadar.pascal.PasErrs;
import cohadar.pascal.grammar.AbstractStrategy;
import cohadar.pascal.grammar.BParser;
import cohadar.pascal.grammar.TreeAttributes;
import cohadar.pascal.symtab.Constant;
import cohadar.pascal.symtab.ConstantSymbol;
import cohadar.pascal.symtab.IType;
import cohadar.pascal.symtab.IVariable;
import cohadar.pascal.symtab.SymbolTable;
import cohadar.pascal.symtab.Variable;
import cohadar.pascal.symtab.types.BuiltIn;
import cohadar.pascal.symtab.types.TypeFunction;
import cohadar.pascal.symtab.types.TypeRange;
import cohadar.pascal.symtab.types.TypeRecord;
import cohadar.util.Util;

// populates symbol table and calculates types of variable declarations,
// calculates constant expressions
public class DefStrategy extends AbstractStrategy {
	private final SymbolTable symtab;
	private final TreeAttributes attribs;

	public DefStrategy(SymbolTable symtab, TreeAttributes attribs) {
		this.symtab = symtab;
		this.attribs = attribs;
	}

	@Override
	public void recordStart(CommonTree _record) {
		symtab.newScope(_record.getText());
	}

	@Override
	public void recordType(CommonTree id) {
		List<Tree> fieldList = attribs.getList(id);
		IVariable[] fields = new IVariable[fieldList.size()];
		int i = 0;
		for (Tree f : fieldList) {
			fields[i++] = attribs.getVariable(f);
		}

		// create record signature
		TypeRecord rec = new TypeRecord(id, fields);

		// define record in record's owner scope
		symtab.leaveScope();
		symtab.defineType(rec);
		attribs.linkType(id, rec);
	}

	@Override
	public void fieldDeclaration(CommonTree _colon, CommonTree idList, CommonTree typeRoot) {
		CommonTree record = (CommonTree) idList.getAncestor(BParser.RECORD);
		List<Tree> fieldList = attribs.getList(record);
		if (fieldList == null) {
			fieldList = new ArrayList<Tree>();
			attribs.linkList(record, fieldList);
		}

		IType type = attribs.getType(typeRoot);
		for (int i = 0; i < idList.getChildCount(); i++) {
			CommonTree id = (CommonTree) idList.getChild(i);
			Variable vs = new Variable(id, id.getText(), type);
			symtab.define(vs);
			attribs.linkVariable(id, vs);
			fieldList.add(id);
		}
	}

	@Override
	public void variableDeclaration(boolean shared, boolean global, CommonTree idList, CommonTree typeRoot) {
		IType type = attribs.getType(typeRoot);
		if (type == BuiltIn.SEMAPHORE) {
			shared = true; // semaphores are always shared
		}
		if (global) {
			for (int i = 0; i < idList.getChildCount(); i++) {
				CommonTree id = (CommonTree) idList.getChild(i);
				Variable vs = new Variable(id, id.getText(), type);
				if (shared) {
					vs.markAsShared();
				}
				symtab.define(vs);
				attribs.linkVariable(id, vs);
			}
		} else {
			CommonTree localListNode = (CommonTree) idList.getAncestor(BParser.LIST);
			List<Tree> localsList = attribs.getList(localListNode);
			if (localsList == null) {
				localsList = new ArrayList<Tree>();
				attribs.linkList(localListNode, localsList);
			}

			for (int i = 0; i < idList.getChildCount(); i++) {
				CommonTree id = (CommonTree) idList.getChild(i);
				localsList.add(id);
				Variable vs = new Variable(id, id.getText(), type);
				symtab.define(vs);
				attribs.linkVariable(id, vs);
			}
			if (shared) {
				symtab.erlog.append(PasErrs.LOCAL_SHARED, idList.getLine(),
						"shared variables and semaphores cannot be local");
			}
		}
	}

	@Override
	public void functionStart(CommonTree head) {
		symtab.newScope(head.getText());
	}

	@Override
	public void functionDeclaration(CommonTree id, CommonTree paramListNode, CommonTree localListNode, CommonTree body,
			CommonTree retType) {

		IType ret = null;
		if (retType == null) {
			ret = BuiltIn.VOID;
		} else {
			ret = attribs.getType(retType);
		}

		IType[] args = null;
		boolean[] byref = null;
		List<Tree> paramList = attribs.getList(paramListNode);
		if (paramList == null) {
			args = new IType[0];
		} else {
			// collect argument types for function signature
			args = new IType[paramList.size()];
			byref = new boolean[paramList.size()];
			for (int i = 0; i < args.length; i++) {
				IVariable v = attribs.getVariable(paramList.get(i));
				args[i] = v.getType();
				byref[i] = v.isReference();
			}
		}

		// local variables are not part of function signature so we ignore them

		// create function signature
		TypeFunction func = new TypeFunction(id, id.getText(), ret, args, byref);

		// define return variable for non-procedures
		if (func.getReturnType() != BuiltIn.VOID) {
			Variable vs = new Variable(id, id.getText(), func.getReturnType());
			symtab.define(vs);
			attribs.linkVariable(id, vs);
		}

		// define function in function's owner scope
		symtab.leaveScope();
		symtab.defineType(func);
	}

	@Override
	public void parameterDeclaration(boolean byref, CommonTree idList, CommonTree typeRoot) {
		CommonTree paramListNode = (CommonTree) idList.getAncestor(BParser.LIST);
		List<Tree> paramList = attribs.getList(paramListNode);
		if (paramList == null) {
			paramList = new ArrayList<Tree>();
			attribs.linkList(paramListNode, paramList);
		}

		IType type = attribs.getType(typeRoot);
		for (int i = 0; i < idList.getChildCount(); i++) {
			CommonTree id = (CommonTree) idList.getChild(i);
			paramList.add(id);
			Variable vs = null;
			if (byref) {
				vs = new Variable(id, id.getText(), type, true);
			} else {
				vs = new Variable(id, id.getText(), type, false);
			}
			symtab.define(vs);
			attribs.linkVariable(id, vs);
		}
	}

	@Override
	public void typeDeclaration(CommonTree id, CommonTree typeNode) {
		IType type = attribs.getType(typeNode);
		symtab.defineTypeAlias(id.getText(), type);
	}

	@Override
	public void typeIdentifier(CommonTree node) {
		if (attribs.getType(node) == null) {
			IType type = symtab.resolveType(node.getText());
			if (type == null) {
				symtab.erlog.append(PasErrs.UNDEFINED_TYPE, node.getLine(), "undefined type " + node.getText());
				attribs.linkType(node, BuiltIn.VOID);
			} else {
				attribs.linkType(node, type);
			}
		} else {
			// type already attached by subrangeType method
		}
	}

	private int getIntegerConstant(CommonTree node) {
		Integer ret = 0;
		Constant c = attribs.getConstant(node);
		if (c == null) {
			symtab.erlog.append(PasErrs.NOT_A_CONSTANT, node.getLine(), "bad constant expression: " + node.getText());
		} else {
			ret = c.getIntegerValue();
			if (ret == null) {
				ret = 0;
				symtab.erlog.append(PasErrs.NOT_AN_INTEGER, node.getLine(),
						"expected integer constant: " + node.getText());
			}
		}
		return ret;
	}

	@Override
	public void subrangeType(CommonTree dotdot, CommonTree low, CommonTree high) {
		int i = getIntegerConstant(low);
		int j = getIntegerConstant(high);
		IType type = symtab.typeFactory.gocTypeRange(dotdot, i, j);
		attribs.linkType(dotdot, type);
	}

	@Override
	public void arrayType(CommonTree array, CommonTree range, CommonTree base) {
		IType rangeType = attribs.getType(range);
		if (rangeType instanceof TypeRange) {
			IType baseType = attribs.getType(base);
			IType type = symtab.typeFactory.gocTypeArray(array, rangeType, baseType);
			attribs.linkType(array, type);
		} else {
			symtab.erlog.append(PasErrs.NOT_A_RANGE, range.getLine(),
					"only integer range can be used as array index type");
			attribs.linkType(array, BuiltIn.VOID);
		}
	}

	@Override
	public void variable(boolean lhs, CommonTree id) {
		attribs.linkScope(id, symtab.getCurrentScope());
		ConstantSymbol c = symtab.resolveConstant(id.getText());
		if (c != null) {
			attribs.linkConstant(id, c.getConstant());
		}
	}

	@Override
	public void literal(CommonTree id) {
		String text = id.getText();
		switch (id.getType()) {
		case BParser.HEX_INT:
			attribs.linkConstant(id, new Constant(Util.parseHex(text.substring(1))));
			break;
		case BParser.NUM_INT:
			attribs.linkConstant(id, new Constant(Integer.parseInt(text)));
			break;
		case BParser.NUM_REAL:
			attribs.linkConstant(id, new Constant(Float.parseFloat(text)));
			break;
		case BParser.STRING_LITERAL:
			attribs.linkConstant(id, new Constant(text));
			break;
		case BParser.TRUE:
			attribs.linkConstant(id, Constant.TRUE);
			break;
		case BParser.FALSE:
			attribs.linkConstant(id, Constant.FALSE);
			break;
		default:
			String name = BParser.tokenNames[id.getType()];
			throw new RuntimeException("constantLiteral - unsupported literal type: " + name);
		}
	}

	@Override
	public void constantDefinition(CommonTree id, CommonTree _const) {
		Constant value = attribs.getConstant(_const);
		if (value == null) {
			symtab.erlog.append(PasErrs.NOT_A_CONSTANT, id.getLine(), "bad constant expression: " + _const.getText());
			value = Constant.ZERO; // default to zero
		}
		ConstantSymbol cs = new ConstantSymbol(id, id.getText(), value);
		symtab.define(cs);
	}

	@Override
	public void unaryMinus(CommonTree op, CommonTree a) {
		Constant c = attribs.getConstant(a);
		if (c != null) {
			c = c.negative();
			if (c != null) {
				attribs.linkConstant(op, c);
			}
		}
	}

	@Override
	public void not(CommonTree op, CommonTree a) {
		Constant c = attribs.getConstant(a);
		if (c != null) {
			c = c.not();
			if (c != null) {
				attribs.linkConstant(op, c);
			}
		}
	}

	@Override
	public void arithmeticOperator(CommonTree op, CommonTree a, CommonTree b) {
		Constant ca = attribs.getConstant(a);
		Constant cb = attribs.getConstant(b);
		Constant ret = null;
		if ((ca == null) || (cb == null)) {
			return;
		}

		switch (op.getType()) {
		case BParser.PLUS:
			ret = ca.plus(cb);
			break;
		case BParser.MINUS:
			ret = ca.minus(cb);
			break;
		case BParser.STAR:
			ret = ca.star(cb);
			break;
		case BParser.DIV:
			ret = ca.div(cb);
			break;
		case BParser.MOD:
			ret = ca.mod(cb);
			break;
		case BParser.SLASH:
			break;
		default:
			String name = BParser.tokenNames[op.getType()];
			throw new RuntimeException("arithmeticOperator - unsupported: " + name);
		}

		if (ret != null) {
			attribs.linkConstant(op, ret);
		}
	}

	@Override
	public void comparisonOperator(CommonTree op, CommonTree a, CommonTree b) {
		Constant ca = attribs.getConstant(a);
		Constant cb = attribs.getConstant(b);
		Constant ret = null;
		if ((ca == null) || (cb == null)) {
			return;
		}

		switch (op.getType()) {
		case BParser.LT:
			ret = ca.lt(cb);
			break;
		case BParser.LE:
			ret = ca.le(cb);
			break;
		case BParser.GT:
			ret = ca.gt(cb);
			break;
		case BParser.GE:
			ret = ca.ge(cb);
			break;
		default:
			String name = BParser.tokenNames[op.getType()];
			throw new RuntimeException("comparisonOperator - unsupported: " + name);
		}

		if (ret != null) {
			attribs.linkConstant(op, ret);
		}
	}

	@Override
	public void equalityOperator(CommonTree op, CommonTree a, CommonTree b) {
		Constant ca = attribs.getConstant(a);
		Constant cb = attribs.getConstant(b);
		Constant ret = null;
		if ((ca == null) || (cb == null)) {
			return;
		}

		switch (op.getType()) {
		case BParser.EQUAL:
			ret = ca.equal(cb);
			break;
		case BParser.NOT_EQUAL:
			ret = ca.not_equal(cb);
			break;
		default:
			String name = BParser.tokenNames[op.getType()];
			throw new RuntimeException("equalityOperator - unsupported: " + name);
		}

		if (ret != null) {
			attribs.linkConstant(op, ret);
		}
	}

	@Override
	public void logicOperator(CommonTree op, CommonTree a, CommonTree b) {
		Constant ca = attribs.getConstant(a);
		Constant cb = attribs.getConstant(b);
		Constant ret = null;
		if ((ca == null) || (cb == null)) {
			return;
		}

		switch (op.getType()) {
		case BParser.AND:
			ret = ca.and(cb);
			break;
		case BParser.OR:
			ret = ca.or(cb);
			break;
		case BParser.XOR:
			ret = ca.xor(cb);
			break;
		default:
			String name = BParser.tokenNames[op.getType()];
			throw new RuntimeException("logicOperator - unsupported: " + name);
		}

		if (ret != null) {
			attribs.linkConstant(op, ret);
		}
	}

}
