package cohadar.pascal.refing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.junit.Test;

import cohadar.pascal.AbstractTest;
import cohadar.pascal.PCompiler;
import cohadar.pascal.PasErrs;
import cohadar.pascal.grammar.IStrategy;
import cohadar.pascal.symtab.SymbolTable;
import cohadar.pascal.symtab.Variable;
import cohadar.pascal.walking.DefStrategy;
import cohadar.pascal.walking.RefStrategy;
import cohadar.util.Err;

// Ref depends on Def running successfully
public class TestsRef extends AbstractTest {
	@Override
	public String getPath() {
		return "test/cohadar/pascal/refing/";
	}

	SymbolTable symt = null;

	private void testRef(String fileName, boolean print) {
		getTree(fileName, print);

		CommonTreeNodeStream nodes = new CommonTreeNodeStream(root);
		nodes.setTokenStream(tokens);

		IStrategy strategy = null;

		strategy = new DefStrategy(PCompiler.getSymbolTable(), PCompiler.getAttributes());
		PCompiler.walking(nodes, strategy);

		nodes.reset();

		strategy = new RefStrategy(PCompiler.getSymbolTable(), PCompiler.getAttributes());
		PCompiler.walking(nodes, strategy);

		symt = PCompiler.getSymbolTable();
	}

	@Test
	public void test00() {
		testRef("reftest00.pas", false);

		Variable a = (Variable) symt.getGlobalScope().resolve("a");
		Variable b = (Variable) symt.getGlobalScope().resolve("b");

		assertFalse(erlog.hasErrs());

		assertEquals(1, a.getAccessCount());
		assertEquals(2, b.getAccessCount());

	}

	@Test
	public void test01() {
		testRef("reftest01.pas", false);

		Variable a = (Variable) symt.getGlobalScope().resolve("a");
		Variable b = (Variable) symt.getGlobalScope().resolve("b");
		Variable c = (Variable) symt.getGlobalScope().resolve("c");
		Variable d = (Variable) symt.getGlobalScope().resolve("d");
		Variable e = (Variable) symt.getGlobalScope().resolve("e");

		assertEquals(1, a.getAccessCount());
		assertEquals(3, b.getAccessCount());
		assertEquals(1, c.getAccessCount());
		assertEquals(0, d.getAccessCount());
		assertEquals(0, e.getAccessCount());

		assertEquals("integer", a.getType().getName());
		assertEquals("integer", b.getType().getName());
		assertEquals("2..10", c.getType().getName());
		assertEquals("real", d.getType().getName());
		assertEquals("real", e.getType().getName());

		assertEquals(2, a.getLine());
		assertEquals(2, b.getLine());
		assertEquals(3, c.getLine());
		assertEquals(4, d.getLine());
		assertEquals(4, e.getLine());

		assertFalse(erlog.hasErrs());
	}

	@Test
	public void test02() {
		testRef("reftest02.pas", false);

		Variable a = (Variable) symt.getGlobalScope().resolve("a");
		Variable b = (Variable) symt.getGlobalScope().resolve("b");
		assertNull(symt.getGlobalScope().resolve("c"));

		assertEquals("integer", a.getType().getName());
		assertEquals("integer", b.getType().getName());

		Err err = erlog.getErr(0);
		assertEquals(4, err.getLine());
		assertEquals(PasErrs.UNDEFINED_IDENTIFIER, err.getType());
	}
}
