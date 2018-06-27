package cohadar.ceditor.gui.actions.file;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

import cohadar.ceditor.ResourceLoader;

class NewAction extends AbstractAction {

	private final FileActions owner;

	NewAction(FileActions actions) {
		super("New");
		this.owner = actions;

		putValue(AbstractAction.LARGE_ICON_KEY, ResourceLoader.ICON_NEW);

		putValue(SHORT_DESCRIPTION, "New");

		putValue(MNEMONIC_KEY, KeyEvent.VK_N);

		putValue(ACCELERATOR_KEY,
				KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		owner.getTarget().newFile();
	}

}
