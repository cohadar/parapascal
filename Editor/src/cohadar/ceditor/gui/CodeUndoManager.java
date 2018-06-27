package cohadar.ceditor.gui;

import javax.swing.event.DocumentEvent;
import javax.swing.event.UndoableEditEvent;
import javax.swing.text.Document;
import javax.swing.undo.UndoManager;

import cohadar.ceditor.gui.actions.edit.EditActions;

public class CodeUndoManager extends UndoManager {
	private final EditActions editActions;

	private boolean mergeNext = false;

	private MyCompoundEdit inProgress;

	private int lastLine = 0;

	public CodeUndoManager(Document owner, EditActions editActions) {
		this.editActions = editActions;
		owner.addUndoableEditListener(this);
	}

	private boolean canMerge(DocumentEvent docEvt) {
		int editLine = docEvt.getDocument().getDefaultRootElement()
				.getElementIndex(docEvt.getOffset());

		if (editLine == lastLine) {
			if ((Math.abs(docEvt.getLength()) <= 1)) {
				return true;
			}
		} else {
			lastLine = editLine;
		}
		return false;
	}

	@Override
	public void undoableEditHappened(UndoableEditEvent e) {
		if (inProgress == null || inProgress.hasBeenUsed()) {
			inProgress = new MyCompoundEdit(e.getEdit());
			addEdit(inProgress);

		} else if (mergeNext) {
			inProgress.appendEdit(e.getEdit());
			mergeNext = false;

		} else if (canMerge((DocumentEvent) e.getEdit())) {
			inProgress.appendEdit(e.getEdit());
		} else {
			inProgress = new MyCompoundEdit(e.getEdit());
			addEdit(inProgress);
		}

		updateUndoRedo();
	}

	public void updateUndoRedo() {
		if (this.canUndo()) {
			editActions.UNDO.setEnabled(true);
		} else {
			editActions.UNDO.setEnabled(false);
		}
		if (this.canRedo()) {
			editActions.REDO.setEnabled(true);
		} else {
			editActions.REDO.setEnabled(false);
		}
	}

	/**
	 * When this method is called next edit will be merged into inProgress
	 * compound edit. This is used mainly by code formatters. Code formatter
	 * should delete all text from document, call this method and then insert
	 * new formatted text. That way formating will be treated as single large
	 * operation by undo manager.
	 * */
	public void mergeNextEdit() {
		mergeNext = true;
	}

}
