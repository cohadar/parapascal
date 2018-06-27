package cohadar.pascal.grammar;

import org.antlr.runtime.tree.CommonTree;

public class AbstractStrategy implements IStrategy {

	@Override
	public void program(CommonTree program) {
		// empty on purpose

	}

	@Override
	public void variableDeclaration(boolean shared, boolean global, CommonTree idList, CommonTree typeRoot) {
		// empty on purpose

	}

	@Override
	public void typeIdentifier(CommonTree typeRoot) {
		// empty on purpose

	}

	@Override
	public void subrangeType(CommonTree dotdot, CommonTree low, CommonTree high) {
		// empty on purpose

	}

	@Override
	public void logicOperator(CommonTree op, CommonTree a, CommonTree b) {
		// empty on purpose

	}

	@Override
	public void arithmeticOperator(CommonTree op, CommonTree a, CommonTree b) {
		// empty on purpose

	}

	@Override
	public void functionCall(CommonTree call) {
		// empty on purpose

	}

	@Override
	public void assignmentStatement(CommonTree assign, CommonTree variable, CommonTree expression) {
		// empty on purpose

	}

	@Override
	public void mainBody(CommonTree begin) {
		// empty on purpose

	}

	@Override
	public void compoundStatement(CommonTree commonTree) {
		// empty on purpose

	}

	@Override
	public void cobeginStatement(CommonTree commonTree) {
		// empty on purpose

	}

	@Override
	public void ifStatement(CommonTree _if, CommonTree _condition, CommonTree _then, CommonTree _else) {
		// empty on purpose

	}

	@Override
	public void whileStatement(CommonTree _while, CommonTree _condition, CommonTree _do) {
		// empty on purpose

	}

	@Override
	public void repeatStatement(CommonTree _repeat, CommonTree _doList, CommonTree _condition) {
		// empty on purpose

	}

	@Override
	public void forStatement(CommonTree _for, boolean downto, CommonTree _start, CommonTree _end, CommonTree _do) {
		// empty on purpose

	}

	@Override
	public void parameterDeclaration(boolean byref, CommonTree idList, CommonTree typeRoot) {
		// empty on purpose

	}

	@Override
	public void functionDeclaration(CommonTree id, CommonTree paramListNode, CommonTree localListNode, CommonTree body,
			CommonTree retType) {
		// empty on purpose

	}

	@Override
	public void functionStart(CommonTree head) {
		// empty on purpose

	}

	@Override
	public void comparisonOperator(CommonTree op, CommonTree a, CommonTree b) {
		// empty on purpose

	}

	@Override
	public void equalityOperator(CommonTree op, CommonTree a, CommonTree b) {
		// empty on purpose

	}

	@Override
	public void not(CommonTree _not, CommonTree a) {
		// empty on purpose

	}

	@Override
	public void unaryMinus(CommonTree _minus, CommonTree a) {
		// empty on purpose

	}

	@Override
	public void arrayType(CommonTree array, CommonTree range, CommonTree base) {
		// empty on purpose

	}

	@Override
	public void variable(boolean lhs, CommonTree id) {
		// empty on purpose

	}

	@Override
	public void typeDeclaration(CommonTree id, CommonTree typeNode) {
		// empty on purpose

	}

	@Override
	public void recordType(CommonTree _record) {
		// empty on purpose

	}

	@Override
	public void fieldDeclaration(CommonTree _colon, CommonTree idList, CommonTree typeRoot) {
		// empty on purpose

	}

	@Override
	public void recordStart(CommonTree _record) {
		// empty on purpose

	}

	@Override
	public void constantDefinition(CommonTree id, CommonTree _const) {
		// empty on purpose

	}

	@Override
	public void literal(CommonTree node) {
		// empty on purpose

	}

	@Override
	public void coforStatement(CommonTree _cofor, boolean downto, CommonTree _start, CommonTree _end, CommonTree _do) {
		// empty on purpose

	}

	@Override
	public void regionStatement(CommonTree region, CommonTree variable, CommonTree statement) {
		// empty on purpose

	}

	@Override
	public void awaitStatement(CommonTree await, CommonTree _condition) {
		// empty on purpose

	}

	@Override
	public void breakStatement(CommonTree _break) {
		// empty on purpose

	}

}
