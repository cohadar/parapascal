package cohadar.pascal.gui;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.BadLocationException;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Token;

import cohadar.ceditor.gui.editorkit.CodeDocument;
import cohadar.ceditor.gui.editorkit.CodeHighlighter;
import cohadar.ceditor.gui.editorkit.CodeStyle;
import cohadar.pascal.PCompiler;
import cohadar.pascal.grammar.ALexer;
import cohadar.pascal.grammar.BParser;
import cohadar.pascal.symtab.types.BuiltIn;

public class CPasHighlighter implements CodeHighlighter {

	// list of styles for every document character
	// these are only references to defined SyntaxStyles so memory usage is
	// minimal
	List<CodeStyle> cs = new ArrayList<CodeStyle>();

	private static CodeStyle badTokenStyle = new CodeStyle(Color.RED);
	private static CodeStyle defaultStyle = new CodeStyle(Color.BLACK);
	private static CodeStyle keywordStyle = new CodeStyle(Color.decode("0x6F0045"));
	private static CodeStyle reservedStyle = new CodeStyle(Color.decode("0x55007F"));
	private static CodeStyle commentStyle = new CodeStyle(Color.decode("0x3F7F5F"), Font.ITALIC);
	private static CodeStyle stringStyle = new CodeStyle(Color.decode("0x2A00FF"));
	private static CodeStyle numberStyle = new CodeStyle(Color.decode("0x2A007F"));

	private CodeStyle getStyle(Token t) {
		switch (t.getType()) {
		case ALexer.COBEGIN:
		case ALexer.BEGIN:
		case ALexer.COEND:
		case ALexer.END:
		case ALexer.PROGRAM:
		case ALexer.VAR:
		case ALexer.SHARED:
		case ALexer.PROCEDURE:
		case ALexer.FUNCTION:
		case ALexer.IF:
		case ALexer.THEN:
		case ALexer.ELSE:
		case ALexer.WHILE:
		case ALexer.DO:
		case ALexer.REPEAT:
		case ALexer.UNTIL:
		case ALexer.FOR:
		case ALexer.COFOR:
		case ALexer.TO:
		case ALexer.DOWNTO:
		case ALexer.AND:
		case ALexer.OR:
		case ALexer.XOR:
		case ALexer.NOT:
		case ALexer.BOOLEAN:
		case ALexer.INTEGER:
		case ALexer.REAL:
		case ALexer.SEMAPHORE:
		case ALexer.TRUE:
		case ALexer.FALSE:
		case ALexer.ARRAY:
		case ALexer.OF:
		case ALexer.TYPE:
		case ALexer.RECORD:
		case ALexer.CONST:
		case ALexer.REGION:
		case ALexer.AWAIT:
		case ALexer.BREAK:
			return keywordStyle;
		case ALexer.NUM_INT:
		case ALexer.HEX_INT:
			return numberStyle;
		case ALexer.STRING_LITERAL:
			return stringStyle;
		case ALexer.COMMENT_0:
		case ALexer.COMMENT_1:
		case ALexer.COMMENT_2:
			return commentStyle;
		case BParser.IDENT: {
			if (BuiltIn.isPredefinedFunction(t.getText())) {
				return reservedStyle;
			}
		}
		default:
			return defaultStyle;
		}
	}

	@Override
	public void recalculateStyles(CodeDocument doc) {
		try {
			String text = doc.getText(0, doc.getLength());

			for (int i = 0; i < cs.size(); i++) {
				cs.set(i, badTokenStyle);
			}

			// +10 to make code style array bigger than document length
			// prevents IndexOutOfBoundsException special cases
			while (cs.size() < doc.getLength() + 10) {
				cs.add(badTokenStyle);
			}

			calculateHighlights(PCompiler.scanText(text));

			if (PCompiler.erlog.hasErrs()) {
				PasFrame.get().displayProblems(PCompiler.erlog.getAllErrText());
				PasFrame.get().setErrorStatus(true);
			} else {
				PasFrame.get().displayProblems("");
				PasFrame.get().setErrorStatus(false);
			}

		} catch (BadLocationException e) {
			e.printStackTrace();
		}

	}

	private void calculateHighlights(CommonTokenStream tokens) {
		for (int i = 0; i < tokens.size() - 1; i++) {
			CommonToken t = (CommonToken) tokens.get(i);

			CodeStyle sas = this.getStyle(t);
			int start = t.getStartIndex();
			int stop = t.getStopIndex();

			for (int j = start; j <= stop; j++) {
				cs.set(j, sas);
			}
		}

	}

	@Override
	public CodeStyle getCharacterStyle(int offset) {
		try {
			CodeStyle ret = cs.get(offset);
			if (ret == null) {
				return badTokenStyle;
			} else {
				return ret;
			}
		} catch (IndexOutOfBoundsException e) {
			return badTokenStyle;
		}
	}

	@Override
	public String getContentType() {
		return "text/pas";
	}

}
