package cohadar.pascal.defing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.junit.Test;

import cohadar.pascal.AbstractTest;
import cohadar.pascal.PCompiler;
import cohadar.pascal.grammar.IStrategy;
import cohadar.pascal.symtab.IVariable;
import cohadar.pascal.walking.DefStrategy;

public class TestsDef extends AbstractTest {
	@Override
	public String getPath() {
		return "test/cohadar/pascal/defing/";
	}

	private void testDef(String fileName, boolean print) {
		getTree(fileName, print);

		CommonTreeNodeStream nodes = new CommonTreeNodeStream(root);
		nodes.setTokenStream(tokens);

		IStrategy strategy = new DefStrategy(symtab, attribs);
		PCompiler.walking(nodes, strategy);
	}

	@Test
	public void test00() {
		testDef("deftest00.pas", false);

		assertNull(symtab.resolveType("some stupid unexisting type name"));
		assertNotNull(symtab.resolveType("integer"));
		assertNotNull(symtab.resolveType("boolean"));
		assertNotNull(symtab.resolveType("real"));
		assertNotNull(symtab.resolveType("string"));
		assertNotNull(symtab.resolveType("semaphore"));

		IVariable a = attribs.getVariable(node(0, 0, 0));

		IVariable b = attribs.getVariable(node(1, 0, 0));

		IVariable c = attribs.getVariable(node(2, 0, 0));

		assertEquals("integer", a.getType().getName());
		assertEquals("boolean", b.getType().getName());
		assertEquals("real", c.getType().getName());
	}

	@Test
	public void test01() {
		testDef("deftest01.pas", false);

		IVariable a = attribs.getVariable(node(0, 0, 0));

		IVariable b = attribs.getVariable(node(1, 0, 0));

		assertEquals("11..30", a.getType().getName());
		assertEquals("15..40", b.getType().getName());
	}

}
