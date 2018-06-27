package cohadar.pascal.grammar;

import org.antlr.runtime.RecognitionException;

import cohadar.pascal.PasErrs;
import cohadar.util.ErrLogger;

public class MyWalker extends CWalker {

	private final ErrLogger erlog;

	public MyWalker(ErrLogger erlog) {
		super(null); // must explicitly set node stream
		this.erlog = erlog;
	}

	@Override
	public void emitErrorMessage(String msg) {
		erlog.append(PasErrs.WALKER, line, msg);
	}

	private int line = -1;

	@Override
	public String getErrorHeader(RecognitionException e) {
		line = e.line;
		return "";
	}

}
