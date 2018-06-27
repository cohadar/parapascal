package cohadar.pascal.grammar;

import org.antlr.runtime.RecognitionException;

import cohadar.pascal.PasErrs;
import cohadar.util.ErrLogger;

public class MyParser extends BParser {

	private final ErrLogger erlog;

	public MyParser(ErrLogger erlog) {
		super(null); // must explicitly set token stream
		this.erlog = erlog;
	}

	@Override
	public void emitErrorMessage(String msg) {
		erlog.append(PasErrs.PARSER, line, msg);
	}

	private int line = -1;

	@Override
	public String getErrorHeader(RecognitionException e) {
		line = e.line;
		return "";
	}
}
