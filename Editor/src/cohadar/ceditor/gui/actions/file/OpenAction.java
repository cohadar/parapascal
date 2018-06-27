package cohadar.ceditor.gui.actions.file;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

import cohadar.ceditor.ResourceLoader;

class OpenAction extends AbstractAction {

	private final FileActions owner;

	OpenAction(FileActions owner) {
		super("Open");
		this.owner = owner;

		putValue(AbstractAction.LARGE_ICON_KEY, ResourceLoader.ICON_OPEN);

		putValue(SHORT_DESCRIPTION, "Open");

		putValue(MNEMONIC_KEY, KeyEvent.VK_O);

		putValue(ACCELERATOR_KEY,
				KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		owner.getTarget().open();
	}

}
