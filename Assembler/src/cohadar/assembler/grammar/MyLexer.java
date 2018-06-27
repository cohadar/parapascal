package cohadar.assembler.grammar;

import org.antlr.runtime.RecognitionException;

import cohadar.assembler.AsmErrs;
import cohadar.util.ErrLogger;

public class MyLexer extends AssemblerLexer {
	private final ErrLogger erlog;

	public MyLexer(ErrLogger erlog) {
		this.erlog = erlog;
	}

	@Override
	public void emitErrorMessage(String msg) {
		erlog.append(AsmErrs.LEXER, line, msg);
	}

	private int line = -1;

	@Override
	public String getErrorHeader(RecognitionException e) {
		line = e.line;
		return "";
	}
}
