package cohadar.ceditor.gui.actions.file;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;

class SaveAsAction extends AbstractAction {

	private final FileActions owner;

	SaveAsAction(FileActions owner) {
		super("Save As...");
		this.owner = owner;

		putValue(SHORT_DESCRIPTION, "Save as new file");
		putValue(MNEMONIC_KEY, KeyEvent.VK_A);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		owner.getTarget().saveAs();
	}

}
