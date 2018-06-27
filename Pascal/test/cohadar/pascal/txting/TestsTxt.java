package cohadar.pascal.txting;

import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.junit.Test;

import cohadar.pascal.AbstractTest;
import cohadar.pascal.PCompiler;
import cohadar.pascal.grammar.IStrategy;
import cohadar.pascal.symtab.SymbolTable;
import cohadar.pascal.walking.DefStrategy;
import cohadar.pascal.walking.RefStrategy;
import cohadar.pascal.walking.TxtStrategy;

// Ref depends on Def running successfully
public class TestsTxt extends AbstractTest {
	@Override
	public String getPath() {
		return "test/cohadar/pascal/txting/";
	}

	SymbolTable symt = null;

	private String testRef(String fileName, boolean print) {
		getTree(fileName, print);

		CommonTreeNodeStream nodes = new CommonTreeNodeStream(root);
		nodes.setTokenStream(tokens);

		IStrategy strategy = null;

		strategy = new DefStrategy(symtab, attribs);
		PCompiler.walking(nodes, strategy);

		nodes.reset();
		strategy = new RefStrategy(symtab, attribs);
		PCompiler.walking(nodes, strategy);

		nodes.reset();
		strategy = new TxtStrategy(symtab, attribs);
		PCompiler.walking(nodes, strategy);

		if (erlog.hasErrs()) {
			System.err.println(erlog.getAllErrText());
			throw new RuntimeException(erlog.getAllErrText());
		}

		return strategy.toString();
	}

	@Test
	public void test00() {
		testRef("test00.pas", false);
	}

	@Test
	public void testWrite() {
		testRef("testwrite.pas", false);
	}

	@Test
	public void testIf() {
		testRef("iftest.pas", false);
	}

}