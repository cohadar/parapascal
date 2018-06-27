package cohadar.pascal;

import java.io.IOException;

import junit.framework.Assert;

import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.Tree;

import cohadar.pascal.PCompiler;
import cohadar.pascal.grammar.MyFileStream;
import cohadar.pascal.grammar.TreeAttributes;
import cohadar.pascal.grammar.TreePrinter;
import cohadar.pascal.symtab.SymbolTable;
import cohadar.util.ErrLogger;

public abstract class AbstractTest {
	protected CommonTokenStream tokens = null;
	protected Tree root = null;
	protected SymbolTable symtab = null;
	protected TreeAttributes attribs = null;
	protected ErrLogger erlog = null;

	protected void getTree(String fileName) {
		getTree(fileName, false);
	}

	protected void getTree(String fileName, boolean print) {
		PCompiler.reset();
		symtab = PCompiler.getSymbolTable();
		attribs = PCompiler.getAttributes();
		erlog = PCompiler.erlog;

		MyFileStream input;
		try {
			input = new MyFileStream(getPath() + fileName);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		tokens = PCompiler.lexing(input);

		Tree t = PCompiler.parsing(tokens);

		if (print) {
			TreePrinter.setTokenNames(PCompiler.getParser().getTokenNames());
			System.out.println(TreePrinter.toStringTree(t));
		}

		if (erlog.hasErrs()) {
			System.err.println(erlog.getAllErrText());
			throw new RuntimeException(erlog.getAllErrText());
		}

		root = t;
	}

	public abstract String getPath();

	protected Tree node(int... indexes) {
		Tree temp = root;
		for (int i : indexes) {
			temp = temp.getChild(i);
		}
		return temp;
	}

	public void assertNodeType(int type, int... indexes) {
		Assert.assertEquals(type, node(indexes).getType());
	}
}
