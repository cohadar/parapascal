package cohadar.assembler.gui;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.BadLocationException;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Token;

import cohadar.assembler.Assembler;
import cohadar.assembler.grammar.MyLexer;
import cohadar.ceditor.gui.editorkit.CodeDocument;
import cohadar.ceditor.gui.editorkit.CodeHighlighter;
import cohadar.ceditor.gui.editorkit.CodeStyle;

public class AsmHighlighter implements CodeHighlighter {

	// list of styles for every document character
	// these are only references to defined SyntaxStyles so memory usage is
	// minimal
	List<CodeStyle> cs = new ArrayList<CodeStyle>();

	private static CodeStyle invalidTokenStyle = new CodeStyle(Color.RED);
	private static CodeStyle defaultStyle = new CodeStyle(Color.BLACK);
	private static CodeStyle keywordStyle = new CodeStyle(Color.BLACK, Font.BOLD);
	private static CodeStyle instructionStyle = new CodeStyle(Color.decode("0x7F0055"), Font.BOLD);
	private static CodeStyle labelStyle = new CodeStyle(Color.decode("0x007F55"), Font.BOLD);
	private static CodeStyle commentStyle = new CodeStyle(Color.decode("0x666666"), Font.ITALIC);
	private static CodeStyle stringStyle = new CodeStyle(Color.decode("0x2A00FF"));
	private static CodeStyle systemFunctionStyle = new CodeStyle(Color.decode("0x55007F"), Font.BOLD);
	private static CodeStyle constStyle = stringStyle;

	private CodeStyle getStyle(int tokenType) {
		switch (tokenType) {
		case MyLexer.LID:
		case MyLexer.FUNC:
		case MyLexer.COLON:
		case MyLexer.COMMA:
		case MyLexer.LB:
		case MyLexer.RB:
		case MyLexer.LC:
		case MyLexer.RC:
			return labelStyle;
		case MyLexer.SID:
			return systemFunctionStyle;
		case MyLexer.SHARED:
		case MyLexer.INSTANCE:
		case MyLexer.CODE:
			return keywordStyle;
		case MyLexer.INSTRUCTION0:
		case MyLexer.INSTRUCTION1:
			return instructionStyle;
		case MyLexer.TRUE:
		case MyLexer.FALSE:
			return constStyle;
		case MyLexer.STRING:
			return stringStyle;
		case MyLexer.COMMENT:
			return commentStyle;
		case Token.INVALID_TOKEN_TYPE:
			return invalidTokenStyle;
		default:
			return defaultStyle;
		}
	}

	@Override
	public void recalculateStyles(CodeDocument doc) {
		String text = null;
		try {
			text = doc.getText(0, doc.getLength());
		} catch (BadLocationException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < cs.size(); i++) {
			cs.set(i, invalidTokenStyle);
		}

		// +10 to make code style array bigger than document length
		// prevents IndexOutOfBoundsException special cases
		while (cs.size() < doc.getLength() + 10) {
			cs.add(invalidTokenStyle);
		}

		calculateHighlights(Assembler.scanText(text));

		if (Assembler.erlog.hasErrs()) {
			AsmFrame.get().displayProblems(Assembler.erlog.getAllErrText());
			AsmFrame.get().setErrorStatus(true);
		} else {
			AsmFrame.get().displayProblems("");
			AsmFrame.get().setErrorStatus(false);
		}
	}

	private void calculateHighlights(CommonTokenStream tokens) {

		for (int i = 0; i < tokens.size() - 1; i++) {
			CommonToken t = (CommonToken) tokens.get(i);

			CodeStyle sas = this.getStyle(t.getType());
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
				return invalidTokenStyle;
			} else {
				return ret;
			}
		} catch (IndexOutOfBoundsException e) {
			return invalidTokenStyle;
		}
	}

	@Override
	public String getContentType() {
		return "text/asm";
	}

}
