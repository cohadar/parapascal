package cohadar.ceditor.gui.actions.edit;

import javax.swing.Action;

public class EditActions {

	private final EditActionsTarget target;

	public EditActionsTarget getTarget() {
		return target;
	}

	public EditActions(EditActionsTarget target) {
		this.target = target;
	}

	public final Action UNDO = new UndoAction(this);

	public final Action REDO = new RedoAction(this);

	public final Action CUT = new CutAction(this);

	public final Action COPY = new CopyAction(this);

	public final Action PASTE = new PasteAction(this);

	public final Action DELETE = new DeleteAction(this);

	public final Action SELECT_ALL = new SelectAllAction(this);

	public final Action FIND = new FindAction(this);

	public final Action FIND_NEXT = new FindNextAction(this);
}
