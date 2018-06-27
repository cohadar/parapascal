package cohadar.ceditor.gui.editorkit;

import java.awt.Graphics;

import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
import javax.swing.text.PlainView;
import javax.swing.text.Segment;
import javax.swing.text.Utilities;

class CodeView extends PlainView {
	private final CodeDocument doc;

	public CodeView(Element elem) {
		super(elem);
		doc = (CodeDocument) getDocument();
	}

	@Override
	protected int drawUnselectedText(Graphics g, int x, int y, int startOffset, int endOffset)
			throws BadLocationException {
		int length = (endOffset < doc.getLength() ? endOffset : doc.getLength()) - startOffset;

		return drawCharacters(g, x, y, startOffset, length);
	}

	// data to hold one character - needed by Utilities
	private Segment charSegment = new Segment();

	// TODO: optimize to draw sequential characters of same color at once?
	private int drawCharacters(Graphics g, int x, int y, int startPosition, int length) throws BadLocationException {
		// draws each character in it's own color & font
		for (int i = 0; i < length; i++) {
			doc.getText(startPosition + i, 1, charSegment);
			CodeStyle ss = doc.getCharacterStyle(startPosition + i);
			g.setColor(ss.getColor());
			g.setFont(g.getFont().deriveFont(ss.getFontStyle()));
			x = Utilities.drawTabbedText(charSegment, x, y, g, this, startPosition + i);
		}
		return x;
	}

}