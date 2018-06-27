package cohadar.assembler.grammar;

import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.MissingTokenException;
import org.antlr.runtime.RecognitionException;

import cohadar.assembler.AsmErrs;
import cohadar.util.ErrLogger;

public class MyParser extends AssemblerParser {
	private final ErrLogger erlog;

	public MyParser(ErrLogger erlog) {
		super(null); // must explicitly set token stream
		this.erlog = erlog;
	}

	@Override
	public void emitErrorMessage(String msg) {
		erlog.append(AsmErrs.PARSER, line, msg);
	}

	private int line = -1;

	@Override
	public String getErrorHeader(RecognitionException e) {
		line = e.line;
		return "";
	}

	@Override
	public String getErrorMessage(RecognitionException e, String[] tokenNames) {
		// List stack = getRuleInvocationStack(e, this.getClass().getName());
		String msg = null;
		if (e instanceof EarlyExitException) {
			EarlyExitException eee = (EarlyExitException) e;
			msg = "segment header missing (.SHARED | .INSTANCE | .CODE)";
		} else if (e instanceof MissingTokenException) {
			MissingTokenException mte = (MissingTokenException) e;
			if (mte.expecting == this.EOF) {
				msg = "misplaced constructs (instruction or declaration in wrong segment)";
			} else {
				msg = super.getErrorMessage(e, tokenNames);
			}
		} else {
			msg = super.getErrorMessage(e, tokenNames);
		}
		// return stack + " " + msg;
		// return e.getClass().getSimpleName() + " - " + msg;
		return msg;
	}

}
