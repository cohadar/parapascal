package cohadar.ceditor.gui.actions.edit;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

import cohadar.ceditor.ResourceLoader;

class RedoAction extends AbstractAction {
	private final EditActions owner;

	RedoAction(EditActions owner) {
		super("Redo");
		this.owner = owner;

		putValue(AbstractAction.LARGE_ICON_KEY, ResourceLoader.ICON_REDO);
		putValue(SHORT_DESCRIPTION, "Redo");

		putValue(MNEMONIC_KEY, KeyEvent.VK_Y);
		putValue(ACCELERATOR_KEY,
				KeyStroke.getKeyStroke(KeyEvent.VK_Y, ActionEvent.CTRL_MASK));
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		owner.getTarget().redo();
	}

}
