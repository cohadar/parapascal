package cohadar.pascal.parsing;

import static cohadar.pascal.grammar.BParser.AND;
import static cohadar.pascal.grammar.BParser.ASSIGN;
import static cohadar.pascal.grammar.BParser.BEGIN;
import static cohadar.pascal.grammar.BParser.BOOLEAN;
import static cohadar.pascal.grammar.BParser.BY_VALUE;
import static cohadar.pascal.grammar.BParser.CALL;
import static cohadar.pascal.grammar.BParser.DIV;
import static cohadar.pascal.grammar.BParser.DOTDOT;
import static cohadar.pascal.grammar.BParser.EQUAL;
import static cohadar.pascal.grammar.BParser.GE;
import static cohadar.pascal.grammar.BParser.GT;
import static cohadar.pascal.grammar.BParser.IDENT;
import static cohadar.pascal.grammar.BParser.IDLIST;
import static cohadar.pascal.grammar.BParser.INSTANCE;
import static cohadar.pascal.grammar.BParser.INTEGER;
import static cohadar.pascal.grammar.BParser.LE;
import static cohadar.pascal.grammar.BParser.LIST;
import static cohadar.pascal.grammar.BParser.LT;
import static cohadar.pascal.grammar.BParser.MINUS;
import static cohadar.pascal.grammar.BParser.MOD;
import static cohadar.pascal.grammar.BParser.NOT;
import static cohadar.pascal.grammar.BParser.NOT_EQUAL;
import static cohadar.pascal.grammar.BParser.NUM_INT;
import static cohadar.pascal.grammar.BParser.OR;
import static cohadar.pascal.grammar.BParser.PLUS;
import static cohadar.pascal.grammar.BParser.PROCEDURE;
import static cohadar.pascal.grammar.BParser.PROGRAM;
import static cohadar.pascal.grammar.BParser.REAL;
import static cohadar.pascal.grammar.BParser.SHARED;
import static cohadar.pascal.grammar.BParser.SLASH;
import static cohadar.pascal.grammar.BParser.STAR;
import static cohadar.pascal.grammar.BParser.UNARY_MINUS;

import org.junit.Test;

import cohadar.pascal.AbstractTest;

public class TestsParser extends AbstractTest {
	@Override
	public String getPath() {
		return "test/cohadar/pascal/parsing/";
	}

	@Test
	public void _debug_() {
		getTree("_debug_.pas", false);
	}

	@Test
	public void test00() {
		getTree("partest00.pas");
		assertNodeType(PROGRAM);
		assertNodeType(BEGIN, 0);
	}

	@Test
	public void test01() {
		getTree("partest01.pas");
		assertNodeType(PROGRAM);
		assertNodeType(INSTANCE, 0);
		assertNodeType(BEGIN, 1);

		assertNodeType(IDLIST, 0, 0);
		assertNodeType(INTEGER, 0, 1);

		assertNodeType(IDENT, 0, 0, 0);
		assertNodeType(IDENT, 0, 0, 1);
	}

	@Test
	public void test02() {
		getTree("partest02.pas");
		assertNodeType(PROGRAM);

		assertNodeType(INSTANCE, 0);
		assertNodeType(SHARED, 1);
		assertNodeType(INSTANCE, 2);
		assertNodeType(BEGIN, 3);

		assertNodeType(IDLIST, 0, 0);
		assertNodeType(INTEGER, 0, 1);

		assertNodeType(IDLIST, 1, 0);
		assertNodeType(REAL, 1, 1);

		assertNodeType(IDLIST, 2, 0);
		assertNodeType(BOOLEAN, 2, 1);

		assertNodeType(IDENT, 0, 0, 0);
		assertNodeType(IDENT, 0, 0, 1);
		assertNodeType(IDENT, 0, 0, 2);

		assertNodeType(IDENT, 1, 0, 0);
		assertNodeType(IDENT, 1, 0, 1);

		assertNodeType(IDENT, 2, 0, 0);
	}

	@Test
	public void test03() {
		getTree("partest03.pas", false);
		assertNodeType(PROGRAM);

		assertNodeType(INSTANCE, 0);
		assertNodeType(INSTANCE, 1);
		assertNodeType(BEGIN, 2);

		assertNodeType(DOTDOT, 0, 1);
		// assertNodeType(LOW_BOUND, 1, 1);
	}

	@Test
	public void test04() {
		getTree("partest04.pas");
		assertNodeType(PROGRAM);

		assertNodeType(ASSIGN, 1, 0);
		assertNodeType(IDENT, 1, 0, 0);
		assertNodeType(PLUS, 1, 0, 1);
		assertNodeType(IDENT, 1, 0, 1, 0);
		assertNodeType(NUM_INT, 1, 0, 1, 1);
	}

	@Test
	public void testLogic() {
		getTree("logic.pas");
		assertNodeType(PROGRAM);

		assertNodeType(EQUAL, 1, 0, 1);
		assertNodeType(NOT_EQUAL, 1, 1, 1);
		assertNodeType(GT, 1, 2, 1);
		assertNodeType(GE, 1, 3, 1);
		assertNodeType(LT, 1, 4, 1);
		assertNodeType(LE, 1, 5, 1);
		assertNodeType(AND, 1, 6, 1);
		assertNodeType(OR, 1, 7, 1);
		assertNodeType(NOT, 1, 8, 1);
	}

	@Test
	public void testArithmetic() {
		getTree("arithmetic.pas");
		assertNodeType(PROGRAM);

		assertNodeType(PLUS, 1, 0, 1);
		assertNodeType(MINUS, 1, 1, 1);
		assertNodeType(STAR, 1, 2, 1);
		assertNodeType(DIV, 1, 3, 1);
		assertNodeType(MOD, 1, 4, 1);
		assertNodeType(SLASH, 1, 5, 1);
		assertNodeType(UNARY_MINUS, 1, 6, 1);
	}

	@Test
	public void testFuncCall() {
		getTree("funccall.pas");
		root = node(3, 0);
		assertNodeType(ASSIGN);
		assertNodeType(IDENT, 0);
		assertNodeType(PLUS, 1);
		assertNodeType(CALL, 1, 0);
		assertNodeType(IDENT, 1, 0, 0);
		assertNodeType(MINUS, 1, 0, 1);
		assertNodeType(IDENT, 1, 0, 1, 0);
		assertNodeType(NUM_INT, 1, 0, 1, 1);
		assertNodeType(NUM_INT, 1, 1);
	}

	@Test
	public void ifTest() {
		getTree("iftest.pas", false);
		assertNodeType(PROGRAM);
		assertNodeType(BEGIN, 0);
	}

	@Test
	public void params() {
		getTree("params.pas", false);
		assertNodeType(PROGRAM);
		assertNodeType(PROCEDURE, 0);
		assertNodeType(LIST, 0, 0);
		assertNodeType(BY_VALUE, 0, 0, 0);
		assertNodeType(BY_VALUE, 0, 0, 1);
		assertNodeType(BEGIN, 1);
	}

}
