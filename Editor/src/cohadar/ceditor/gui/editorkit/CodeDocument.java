package cohadar.ceditor.gui.editorkit;

import javax.swing.event.DocumentEvent;
import javax.swing.text.PlainDocument;

/**
 * document that uses syntax highlighting
 * 
 * @author Cohadar
 * 
 */
public class CodeDocument extends PlainDocument {

	public CodeStyle getCharacterStyle(int offset) {
		return highlighter.getCharacterStyle(offset);
	}

	private final CodeHighlighter highlighter;

	public CodeDocument(CodeHighlighter highlighter) {
		this.highlighter = highlighter;
	}

	@Override
	protected void fireChangedUpdate(DocumentEvent e) {
		highlighter.recalculateStyles(this);
		super.fireChangedUpdate(e);
	}

	@Override
	protected void fireInsertUpdate(DocumentEvent e) {
		highlighter.recalculateStyles(this);
		super.fireInsertUpdate(e);
	}

	@Override
	protected void fireRemoveUpdate(DocumentEvent e) {
		highlighter.recalculateStyles(this);
		super.fireRemoveUpdate(e);
	}

}