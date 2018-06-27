package cohadar.pascal.lexing;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Token;
import org.junit.Test;

import cohadar.pascal.PCompiler;
import cohadar.pascal.grammar.ALexer;
import cohadar.pascal.grammar.MyFileStream;
import cohadar.util.ErrLogger;

public class TestsLexer {
	CommonTokenStream tokens = null;
	private final String PATH = "test/cohadar/pascal/lexing/";

	private void getTokens(String fileName, boolean print) {
		PCompiler.reset();

		MyFileStream input;
		try {
			input = new MyFileStream(PATH + fileName);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		tokens = PCompiler.lexing(input);

		while (tokens.LA(1) != ALexer.EOF) {
			if (print) {
				Token t = tokens.LT(1);
				System.out.printf("[%02X] %s\n", t.getType(), t.getText());
			}
			tokens.consume();
		}

		ErrLogger erlog = PCompiler.erlog;

		if (erlog.hasErrs()) {
			System.err.println(erlog.getAllErrText());
			throw new RuntimeException(erlog.getAllErrText());
		}

		tokens.reset();
	}

	private final float fs[] = { 123f, 123.5f, 123.5e3f, 123.e-3f, 3e7f };

	private void assertToken(int type) {
		assertEquals(tokens.LT(1).getType(), type);
		tokens.consume();
	}

	@Test
	public void testFloatLexing() {
		getTokens("lextest00.pas", false);
		int i = 0;
		while (tokens.LA(1) != ALexer.EOF) {
			Token t = tokens.LT(1);
			// System.out.printf("T[%02d]  %s\n", t.getType(), t.getText());
			if (t.getType() == ALexer.NUM_REAL) {
				assertEquals(fs[i++], Float.parseFloat(t.getText()), 0.0f);
			}
			tokens.consume();
		}

	}

	@Test
	public void testDotDotLexing() {
		getTokens("lextest01.pas", false);

		assertToken(ALexer.NUM_INT);
		assertToken(ALexer.DOTDOT);
		assertToken(ALexer.NUM_INT);

		assertToken(ALexer.MINUS);
		assertToken(ALexer.NUM_INT);
		assertToken(ALexer.DOTDOT);
		assertToken(ALexer.NUM_INT);

		assertToken(ALexer.NUM_INT);
		assertToken(ALexer.DOTDOT);
		assertToken(ALexer.MINUS);
		assertToken(ALexer.NUM_INT);

		assertToken(ALexer.MINUS);
		assertToken(ALexer.NUM_INT);
		assertToken(ALexer.DOTDOT);
		assertToken(ALexer.MINUS);
		assertToken(ALexer.NUM_INT);

		assertToken(ALexer.NUM_INT);
		assertToken(ALexer.DOTDOT);
		assertToken(ALexer.NUM_INT);

		assertToken(ALexer.MINUS);
		assertToken(ALexer.NUM_INT);
		assertToken(ALexer.DOTDOT);
		assertToken(ALexer.NUM_INT);

		assertToken(ALexer.NUM_INT);
		assertToken(ALexer.DOTDOT);
		assertToken(ALexer.MINUS);
		assertToken(ALexer.NUM_INT);

		assertToken(ALexer.MINUS);
		assertToken(ALexer.NUM_INT);
		assertToken(ALexer.DOTDOT);
		assertToken(ALexer.MINUS);
		assertToken(ALexer.NUM_INT);
	}

	@Test
	public void testSign() {
		getTokens("lextest02.pas", false);

		assertToken(ALexer.NUM_INT);
		assertToken(ALexer.MINUS);
		assertToken(ALexer.NUM_INT);
	}

}
