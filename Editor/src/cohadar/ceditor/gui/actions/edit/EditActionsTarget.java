package cohadar.ceditor.gui.actions.edit;

public interface EditActionsTarget {

	void undo();

	void redo();

	void cut();

	void copy();

	void paste();

	void delete();

	void selectAll();

	void find();

	void findNext();

	void updateEditActions();

}
