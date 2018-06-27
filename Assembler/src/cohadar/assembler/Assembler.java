package cohadar.assembler;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import cohadar.assembler.grammar.CodePolicy;
import cohadar.assembler.grammar.HighlighterPolicy;
import cohadar.assembler.grammar.MyLexer;
import cohadar.assembler.grammar.MyParser;
import cohadar.interpreter.program.CCProgram;
import cohadar.util.ErrLogger;

public class Assembler {
	public static final ErrLogger erlog = new ErrLogger();

	private static final HighlighterPolicy highlighterPolicy = new HighlighterPolicy();

	private static MyLexer lexer = new MyLexer(erlog);
	private static MyParser parser = new MyParser(erlog);

	public static CommonTokenStream scanText(String text) {
		erlog.reset();
		// create a CharStream that reads from standard input
		ANTLRStringStream input = new ANTLRStringStream(text.replace("\r\n", "\n") + '\n');
		// create a lexer that feeds off of input CharStream
		lexer.reset();
		lexer.setCharStream(input);
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		parser.reset();
		parser.setTokenStream(tokens);
		try {
			highlighterPolicy.reset(parser);
			parser.program(highlighterPolicy);
		} catch (RecognitionException e) {
			e.printStackTrace();
		}

		return tokens;
	}

	public static CCProgram assemble(String text) {
		erlog.reset();
		// newline is appended to prevent lexing errors because lexer uses
		// newline tokens
		lexer.reset();
		lexer.setCharStream(new ANTLRStringStream(text + '\n'));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		parser.reset();
		parser.setTokenStream(tokens);
		CodePolicy cp = new CodePolicy(erlog);
		try {
			parser.program(cp);
		} catch (RecognitionException e) {
			throw new RuntimeException(e);
		}
		return cp.getProgram();
	}

}
