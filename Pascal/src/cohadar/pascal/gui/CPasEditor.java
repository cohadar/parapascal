package cohadar.pascal.gui;

import javax.swing.text.EditorKit;
import javax.swing.text.PlainDocument;

import cohadar.ceditor.gui.AbstractFrame;
import cohadar.ceditor.gui.CodeFileEditor;
import cohadar.ceditor.gui.editorkit.CodeEditorKit;

public class CPasEditor extends CodeFileEditor {

	public CPasEditor(AbstractFrame owner) {
		super(owner);
		this.getDocument().putProperty(PlainDocument.tabSizeAttribute, 4);
	}

	@Override
	protected EditorKit createDefaultEditorKit() {
		return new CodeEditorKit(new CPasHighlighter());
	}

}
