package cohadar.ceditor.gui.editorkit;

import javax.swing.text.DefaultEditorKit;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.View;
import javax.swing.text.ViewFactory;

public class CodeEditorKit extends DefaultEditorKit implements ViewFactory {
	private final CodeHighlighter h;

	public CodeEditorKit(CodeHighlighter h) {
		this.h = h;
	}

	public CodeHighlighter getCodeHighlighter() {
		return h;
	}

	@Override
	public String getContentType() {
		return h.getContentType();
	}

	@Override
	public Document createDefaultDocument() {
		return new CodeDocument(h);
	}

	@Override
	public final ViewFactory getViewFactory() {
		return this;
	}

	@Override
	public View create(Element elem) {
		return new CodeView(elem);
	}

}