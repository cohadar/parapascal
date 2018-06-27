package cohadar.ceditor.gui.actions.file;

import javax.swing.Action;

public class FileActions {
	private final FileActionsTarget target;

	public FileActionsTarget getTarget() {
		return target;
	}

	public FileActions(FileActionsTarget target) {
		this.target = target;
	}

	public final Action NEW = new NewAction(this);

	public final Action OPEN = new OpenAction(this);

	public final Action SAVE = new SaveAction(this);

	public final Action SAVE_AS = new SaveAsAction(this);

	public final Action EXIT = new ExitAction(this);

	public final Action EXPORT_TO_HTML = new ExportAction(this);

	public void disableAll() {
		NEW.setEnabled(false);
		OPEN.setEnabled(false);
		SAVE.setEnabled(false);
		SAVE_AS.setEnabled(false);
		EXPORT_TO_HTML.setEnabled(false);
		// EXIT.setEnabled(false);
	}

	public void enableAll() {
		NEW.setEnabled(true);
		OPEN.setEnabled(true);
		SAVE.setEnabled(true);
		SAVE_AS.setEnabled(true);
		EXPORT_TO_HTML.setEnabled(true);
		EXIT.setEnabled(true);
	}

}
