package cohadar.assembler.gui;

import javax.swing.text.EditorKit;

import cohadar.ceditor.gui.AbstractFrame;
import cohadar.ceditor.gui.CodeFileEditor;
import cohadar.ceditor.gui.editorkit.CodeEditorKit;

public class AsmEditor extends CodeFileEditor {

	public AsmEditor(AbstractFrame owner) {
		super(owner);
	}

	@Override
	protected EditorKit createDefaultEditorKit() {
		return new CodeEditorKit(new AsmHighlighter());
	}

}
