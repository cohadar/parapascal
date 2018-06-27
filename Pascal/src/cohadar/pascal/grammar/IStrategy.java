package cohadar.pascal.grammar;

import org.antlr.runtime.tree.CommonTree;

public interface IStrategy {

	void program(CommonTree program);

	// DEF
	void variableDeclaration(boolean shared, boolean global, CommonTree idList, CommonTree typeRoot);

	void functionDeclaration(CommonTree id, CommonTree paramListNode, CommonTree localListNode, CommonTree body,
			CommonTree retType);

	void functionStart(CommonTree head);

	void parameterDeclaration(boolean byref, CommonTree idList, CommonTree typeRoot);

	void typeIdentifier(CommonTree typeRoot);

	void subrangeType(CommonTree dotdot, CommonTree low, CommonTree high);

	void arrayType(CommonTree array, CommonTree range, CommonTree base);

	void typeDeclaration(CommonTree id, CommonTree typeNode);

	void recordType(CommonTree _record);

	void fieldDeclaration(CommonTree _colon, CommonTree idList, CommonTree typeRoot);

	// EXPR

	void not(CommonTree _not, CommonTree a);

	void unaryMinus(CommonTree _minus, CommonTree a);

	void logicOperator(CommonTree op, CommonTree a, CommonTree b);

	void comparisonOperator(CommonTree op, CommonTree a, CommonTree b);

	void equalityOperator(CommonTree op, CommonTree a, CommonTree b);

	void arithmeticOperator(CommonTree op, CommonTree a, CommonTree b);

	void functionCall(CommonTree call);

	void assignmentStatement(CommonTree assign, CommonTree variable, CommonTree expression);

	void mainBody(CommonTree begin);

	void variable(boolean lhs, CommonTree id);

	// void arrayField(boolean lhs, CommonTree lbrack, CommonTree array,
	// CommonTree index);

	// void recordField(boolean lhs, CommonTree dot, CommonTree record,
	// CommonTree member);

	void compoundStatement(CommonTree commonTree);

	void cobeginStatement(CommonTree commonTree);

	void ifStatement(CommonTree _if, CommonTree _condition, CommonTree _then, CommonTree _else);

	void whileStatement(CommonTree _while, CommonTree _condition, CommonTree _do);

	void repeatStatement(CommonTree _repeat, CommonTree _doList, CommonTree _condition);

	void forStatement(CommonTree _for, boolean downto, CommonTree _start, CommonTree _end, CommonTree _do);

	void coforStatement(CommonTree _cofor, boolean downto, CommonTree _start, CommonTree _end, CommonTree _do);

	void recordStart(CommonTree _record);

	void constantDefinition(CommonTree id, CommonTree _const);

	void literal(CommonTree node);

	void regionStatement(CommonTree region, CommonTree variable, CommonTree statement);

	void awaitStatement(CommonTree await, CommonTree condition);

	void breakStatement(CommonTree _break);

}
