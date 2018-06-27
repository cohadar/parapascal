package cohadar.pascal.walking;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

import cohadar.pascal.PasErrs;
import cohadar.pascal.grammar.AbstractStrategy;
import cohadar.pascal.grammar.BParser;
import cohadar.pascal.grammar.TreeAttributes;
import cohadar.pascal.symtab.IType;
import cohadar.pascal.symtab.IVariable;
import cohadar.pascal.symtab.Scope;
import cohadar.pascal.symtab.SymbolTable;
import cohadar.pascal.symtab.types.BuiltIn;
import cohadar.pascal.symtab.types.Category;
import cohadar.pascal.symtab.types.TypeArray;
import cohadar.pascal.symtab.types.TypeFunction;
import cohadar.pascal.symtab.types.TypeRecord;

// resolve types of all expressions
public class RefStrategy extends AbstractStrategy {
	private final SymbolTable symtab;
	private final TreeAttributes attribs;

	public RefStrategy(SymbolTable symtab, TreeAttributes attribs) {
		this.symtab = symtab;
		this.attribs = attribs;
	}

	@Override
	public void variable(boolean lhs, CommonTree id) {
		Scope scope = attribs.getScope(id);
		IVariable variable = scope.resolveVariable(id.getText());
		if (variable == null) {
			symtab.erlog.append(PasErrs.UNDEFINED_IDENTIFIER, id.getLine(), "undefined identifier %s", id.getText());
			attribs.linkType(id, BuiltIn.VOID);
		} else {
			variable.incAccessCount();
			attribs.linkVariable(id, variable);
			IType type = variable.getType();
			for (int i = 0; i < id.getChildCount(); i++) {
				type = variableSuffix(id, i, type);
			}
			attribs.linkType(id, type);
		}
	}

	private IType variableSuffix(CommonTree id, int childIndex, IType type) {
		IType ret = BuiltIn.VOID;
		CommonTree suffix = (CommonTree) id.getChild(childIndex);
		switch (suffix.getType()) {
		case BParser.LBRACK: {
			ret = arrayField(id, suffix, type);
			break;
		}
		case BParser.DOT: {
			ret = recordField(id, suffix, type);
			break;
		}
		default: {
			throw new RuntimeException("Invalid variable suffix type: " + BParser.tokenNames[suffix.getType()]);
		}
		}
		return ret;
	}

	public IType arrayField(CommonTree id, CommonTree lbrack, IType atype) {
		IType ret = BuiltIn.VOID;
		CommonTree index = (CommonTree) lbrack.getChild(0);
		if (atype instanceof TypeArray) {
			ret = ((TypeArray) atype).getBaseType();
			attribs.linkType(lbrack, ret);
			attribs.linkType2(lbrack, ((TypeArray) atype).getRangeType());
		} else {
			symtab.erlog.append(PasErrs.NOT_AN_ARRAY, lbrack.getLine(), "not an array: " + atype);
		}

		IType itype = attribs.getType(index);
		if (itype.getCategory() != Category.INTEGER) {
			symtab.erlog.append(PasErrs.INDEX_TYPE, lbrack.getLine(), "array index type must be integer");
		}

		return ret;
	}

	public IType recordField(CommonTree id, CommonTree dot, IType rtype) {
		IType ret = BuiltIn.VOID;
		CommonTree field = (CommonTree) dot.getChild(0);
		if (rtype instanceof TypeRecord) {
			IVariable v = ((TypeRecord) rtype).resolve(field.getText());
			if (v == null) {
				symtab.erlog.append(PasErrs.UNDEFINED_FIELD, dot.getLine(), "undefined field " + field.getText());
			} else {
				ret = v.getType();
				attribs.linkType(dot, ret);
				attribs.linkInteger(dot, ((TypeRecord) rtype).fieldOffset(field.getText()));
			}
		} else {
			symtab.erlog.append(PasErrs.NOT_A_RECORD, dot.getLine(), "not a record: " + rtype);
		}

		return ret;
	}

	@Override
	public void logicOperator(CommonTree op, CommonTree a, CommonTree b) {
		IType ta = attribs.getType(a);
		IType tb = attribs.getType(b);
		IType resultType = BuiltIn.logicResult(ta, tb);
		attribs.linkType(op, resultType);
		if (resultType == BuiltIn.VOID) {
			symtab.erlog.append(PasErrs.BAD_OPERAND_TYPES, op.getLine(),
					"bad operand types for operation " + op.getText());
		}
	}

	@Override
	public void comparisonOperator(CommonTree op, CommonTree a, CommonTree b) {
		IType ta = attribs.getType(a);
		IType tb = attribs.getType(b);
		IType resultType = BuiltIn.comparisonResult(ta, tb);
		attribs.linkType(op, resultType);
		if (resultType == BuiltIn.VOID) {
			symtab.erlog.append(PasErrs.BAD_OPERAND_TYPES, op.getLine(),
					"bad operand types for operation " + op.getText());
		} else {
			if (BuiltIn.promoteFromTo(ta, tb)) {
				attribs.linkPromote(a, tb);
			}
			if (BuiltIn.promoteFromTo(tb, ta)) {
				attribs.linkPromote(b, ta);
			}
		}
	}

	@Override
	public void equalityOperator(CommonTree op, CommonTree a, CommonTree b) {
		IType ta = attribs.getType(a);
		IType tb = attribs.getType(b);
		IType resultType = BuiltIn.equalityResult(ta, tb);
		attribs.linkType(op, resultType);
		if (resultType == BuiltIn.VOID) {
			symtab.erlog.append(PasErrs.BAD_OPERAND_TYPES, op.getLine(),
					"bad operand types for operation " + op.getText());
		} else {
			if (BuiltIn.promoteFromTo(ta, tb)) {
				attribs.linkPromote(a, tb);
			}
			if (BuiltIn.promoteFromTo(tb, ta)) {
				attribs.linkPromote(b, ta);
			}
		}
	}

	@Override
	public void arithmeticOperator(CommonTree op, CommonTree a, CommonTree b) {
		IType ta = attribs.getType(a);
		IType tb = attribs.getType(b);
		IType resultType = null;
		Token operator = op.getToken();
		if (operator.getType() == BParser.SLASH) {
			resultType = BuiltIn.slashResult(ta, tb);
			if (ta.getCategory() == Category.INTEGER) {
				attribs.linkPromote(a, BuiltIn.REAL);
			}
			if (tb.getCategory() == Category.INTEGER) {
				attribs.linkPromote(b, BuiltIn.REAL);
			}
		} else if ((operator.getType() == BParser.MOD) || (operator.getType() == BParser.DIV)) {
			resultType = BuiltIn.divModResult(ta, tb);
			if (BuiltIn.promoteFromTo(ta, tb)) {
				attribs.linkPromote(a, tb);
			}
			if (BuiltIn.promoteFromTo(tb, ta)) {
				attribs.linkPromote(b, ta);
			}
		} else {
			resultType = BuiltIn.arithmeticResult(ta, tb);
			if (BuiltIn.promoteFromTo(ta, tb)) {
				attribs.linkPromote(a, tb);
			}
			if (BuiltIn.promoteFromTo(tb, ta)) {
				attribs.linkPromote(b, ta);
			}
		}
		attribs.linkType(op, resultType);
		if (resultType == BuiltIn.VOID) {
			symtab.erlog.append(PasErrs.BAD_OPERAND_TYPES, op.getLine(),
					"bad operand types for operation " + op.getText());
		}
	}

	@Override
	public void not(CommonTree op, CommonTree a) {
		IType ta = attribs.getType(a);
		if (ta.getCategory() == Category.BOOLEAN) {
			attribs.linkType(op, BuiltIn.BOOLEAN);
		} else {
			attribs.linkType(op, BuiltIn.VOID);
			symtab.erlog.append(PasErrs.BAD_OPERAND_TYPES, op.getLine(),
					"bad operand type for operation " + op.getText());

		}
	}

	@Override
	public void unaryMinus(CommonTree op, CommonTree a) {
		IType ta = attribs.getType(a);
		if (ta.getCategory().isNumber()) {
			attribs.linkType(op, ta);
		} else {
			attribs.linkType(op, BuiltIn.VOID);
			symtab.erlog.append(PasErrs.BAD_OPERAND_TYPES, op.getLine(),
					"bad operand type for operation " + op.getText());

		}
	}

	@Override
	public void literal(CommonTree node) {
		switch (node.getType()) {
		case BParser.STRING_LITERAL:
			attribs.linkType(node, BuiltIn.STRING);
			break;
		case BParser.HEX_INT:
		case BParser.NUM_INT:
			attribs.linkType(node, BuiltIn.INTEGER);
			break;
		case BParser.NUM_REAL:
			attribs.linkType(node, BuiltIn.REAL);
			break;
		case BParser.TRUE:
		case BParser.FALSE:
			attribs.linkType(node, BuiltIn.BOOLEAN);
			break;
		default:
			throw new RuntimeException("literal, unknown type: " + node);
		}

	}

	@Override
	public void functionCall(CommonTree call) {
		TypeFunction sim = symtab.resolveFunction(call.getText());
		if (sim == null) {
			symtab.erlog.append(PasErrs.UNDEFINED_FUNCTION, call.getLine(), "undefined function " + call.getText());
			attribs.linkType(call, BuiltIn.VOID);
		} else {
			attribs.linkType(call, sim.getReturnType());
			if (!BuiltIn.isVarargFunction(call.getText())) {
				if ((call.getChildCount() == sim.getArgumentCount())) {
					for (int i = 0; i < sim.getArgumentCount(); i++) {
						IType formal = sim.getArgument(i);
						IType actual = attribs.getType(call.getChild(i));
						if (BuiltIn.canAssignFromTo(actual, formal)) {
							if (BuiltIn.promoteFromTo(actual, formal)) {
								attribs.linkPromote(call.getChild(i), formal);
							}
						} else {
							symtab.erlog.append(PasErrs.INCOMPATIBLE_TYPES, call.getLine(),
									"invalid argument type, expected " + formal.getName());
						}
					}
				} else {
					symtab.erlog.append(PasErrs.NUMBER_OF_ARGUMENTS, call.getLine(),
							"call to %s should have %d arguments", call.getText(), sim.getArgumentCount());
				}
			}
		}

	}

	@Override
	public void assignmentStatement(CommonTree assign, CommonTree variable, CommonTree expression) {
		IType actual = attribs.getType(expression);
		IType formal = attribs.getType(variable);

		if (BuiltIn.canAssignFromTo(actual, formal)) {
			if (BuiltIn.promoteFromTo(actual, formal)) {
				attribs.linkPromote(expression, formal);
			}
		} else {
			symtab.erlog.append(PasErrs.INCOMPATIBLE_TYPES, assign.getLine(), "invalid assignment type, expected "
					+ formal.getName());
		}
	}

	private void checkCondition(CommonTree _condition) {
		IType type = attribs.getType(_condition);
		if (type != BuiltIn.BOOLEAN) {
			symtab.erlog.append(PasErrs.NOT_A_BOOLEAN, _condition.getLine(), "condition must return boolean value");
		}
	}

	@Override
	public void ifStatement(CommonTree _if, CommonTree _condition, CommonTree _then, CommonTree _else) {
		checkCondition(_condition);
	}

	@Override
	public void whileStatement(CommonTree _while, CommonTree _condition, CommonTree _do) {
		checkCondition(_condition);
	}

	@Override
	public void repeatStatement(CommonTree _repeat, CommonTree _doList, CommonTree _condition) {
		checkCondition(_condition);

	}

	@Override
	public void coforStatement(CommonTree _cofor, boolean downto, CommonTree _start, CommonTree _end, CommonTree _do) {
		if (_cofor.hasAncestor(BParser.COBEGIN) == false) {
			symtab.erlog.append(PasErrs.COFOR_OUTSIDE, _cofor.getLine(), "cofor must be inside cobegin/coend");
		}
	}

	@Override
	public void regionStatement(CommonTree region, CommonTree variable, CommonTree statement) {
		IVariable sym = attribs.getVariable(variable);
		if (sym.isShared() == false) {
			symtab.erlog.append(PasErrs.NOT_A_SHARED_VARIABLE, variable.getLine(), variable.getText()
					+ " is not a shared variable");
			return;

		}
	}

	@Override
	public void awaitStatement(CommonTree await, CommonTree _condition) {
		checkCondition(_condition);
		CommonTree region = (CommonTree) await.getAncestor(BParser.REGION);
		if (region == null) {
			symtab.erlog.append(PasErrs.AWAIT_OUTSIDE_REGION, _condition.getLine(), "await cannot be outside region");
		}
	}

	@Override
	public void breakStatement(CommonTree _break) {
		CommonTree parent = Common.getBreakParent(_break);
		if (parent == null) {
			symtab.erlog.append(PasErrs.BREAK_OUTSIDE_LOOP, _break.getLine(), "break not inside loop");
		}
	}
}
