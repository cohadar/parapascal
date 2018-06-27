package cohadar.pascal.grammar;

import org.antlr.runtime.RecognitionException;

import cohadar.pascal.PasErrs;
import cohadar.util.ErrLogger;

// think of some better name ffs.
public class MyLexer extends ALexer {
	private final ErrLogger erlog;

	public MyLexer(ErrLogger erlog) {
		this.erlog = erlog;
	}

	@Override
	public void emitErrorMessage(String msg) {
		erlog.append(PasErrs.LEXER, line, msg);
	}

	private int line = -1;

	@Override
	public String getErrorHeader(RecognitionException e) {
		line = e.line;
		return "";
	}

}
