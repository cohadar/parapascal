package cohadar.ceditor.gui.actions.file;

public interface FileActionsTarget {
	void newFile();

	void exit();

	void open();

	boolean save();

	boolean saveAs();

	boolean exportToHTML();
}
