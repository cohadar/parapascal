package cohadar.ceditor.gui.actions.edit;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

import cohadar.ceditor.ResourceLoader;

class UndoAction extends AbstractAction {
	private final EditActions owner;

	UndoAction(EditActions owner) {
		super("Undo");
		this.owner = owner;

		putValue(AbstractAction.LARGE_ICON_KEY, ResourceLoader.ICON_UNDO);
		putValue(SHORT_DESCRIPTION, "Undo");

		putValue(MNEMONIC_KEY, KeyEvent.VK_Z);
		putValue(ACCELERATOR_KEY,
				KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		owner.getTarget().undo();
	}

}
