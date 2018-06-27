package cohadar.pascal;

import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import cohadar.pascal.grammar.ICharStream;
import cohadar.pascal.grammar.IStrategy;
import cohadar.pascal.grammar.MyLexer;
import cohadar.pascal.grammar.MyParser;
import cohadar.pascal.grammar.MyStringStream;
import cohadar.pascal.grammar.MyWalker;
import cohadar.pascal.grammar.TreeAttributes;
import cohadar.pascal.symtab.SymbolTable;
import cohadar.pascal.walking.DefStrategy;
import cohadar.pascal.walking.RefStrategy;
import cohadar.pascal.walking.TxtStrategy;
import cohadar.util.ErrLogger;

public class PCompiler {
	public static final ErrLogger erlog = new ErrLogger();
	private static MyLexer lexer = new MyLexer(erlog);
	private static MyParser parser = new MyParser(erlog);
	private static MyWalker walker = new MyWalker(erlog);
	public static SymbolTable symtab = new SymbolTable(erlog);
	public static TreeAttributes attribs = new TreeAttributes();

	public static void reset() {
		erlog.reset();
		symtab.reset();
		attribs.reset();
		lexer.reset();
		parser.reset();
		walker.reset();
	}

	public static MyLexer getLexer() {
		return lexer;
	}

	public static MyParser getParser() {
		return parser;
	}

	public static SymbolTable getSymbolTable() {
		return symtab;
	}

	public static TreeAttributes getAttributes() {
		return attribs;
	}

	// =============================================================
	// LEXING
	// =============================================================
	public static CommonTokenStream lexing(ICharStream input) {
		CommonTokenStream tokens = null;
		try {
			input.prepare();
			lexer.setCharStream(input);
			tokens = new CommonTokenStream(lexer);
		} catch (Exception e) {
			throw new RuntimeException("Lexer error", e);
		}
		return tokens;
	}

	// =============================================================
	// PARSING
	// =============================================================
	public static CommonTree parsing(CommonTokenStream tokens) {
		CommonTree tree = null;
		try {
			parser.setTokenStream(tokens);
			tree = (CommonTree) parser.program().getTree();
		} catch (Exception e) {
			throw new RuntimeException("Parser error", e);
		}
		return tree;
	}

	// =============================================================
	// WALKING
	// =============================================================
	public static void walking(CommonTreeNodeStream nodes, IStrategy strategy) {
		try {
			walker.setTreeNodeStream(nodes);
			walker.setStrategy(strategy);
			walker.program();
		} catch (Exception e) {
			throw new RuntimeException("Walker error", e);
		}
	}

	// =============================================================
	// COMPILING pas -> asm
	// =============================================================
	public static String getListing(String text) {
		reset();

		CommonTokenStream tokens = lexing(new MyStringStream(text));

		if (erlog.hasErrs()) {
			return null;
		}

		CommonTree tree = parsing(tokens);

		CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
		nodes.setTokenStream(tokens);

		if (erlog.hasErrs()) {
			return null;
		}

		IStrategy strategy = null;

		strategy = new DefStrategy(symtab, attribs);
		PCompiler.walking(nodes, strategy);

		if (erlog.hasErrs()) {
			return null;
		}

		nodes.reset();
		strategy = new RefStrategy(symtab, attribs);
		PCompiler.walking(nodes, strategy);

		if (erlog.hasErrs()) {
			return null;
		}

		nodes.reset();
		strategy = new TxtStrategy(symtab, attribs);
		PCompiler.walking(nodes, strategy);

		if (erlog.hasErrs()) {
			return null;
		}

		return strategy.toString();

	}

	// =============================================================
	// SYNTAX COLORING && precompiling
	// =============================================================
	public static CommonTokenStream scanText(String text) {
		reset();

		CommonTokenStream tokens = lexing(new MyStringStream(text));
		try {
			parsing(tokens);
			// CommonTree tree = parsing(tokens);

			// CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
			// nodes.setTokenStream(tokens);

			// defining(tree, nodes);
			// resolving(tree, nodes);
		} catch (Exception e) {
			e.printStackTrace();
			erlog.append(PasErrs.COLORING, -1, e.getMessage());
		}
		return tokens;
	}

}
