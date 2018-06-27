package cohadar.ceditor.gui.actions.edit;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

class PasteAction extends AbstractAction {
	private final EditActions owner;

	PasteAction(EditActions owner) {
		super("Paste");
		this.owner = owner;

		putValue(ACCELERATOR_KEY,
				KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		owner.getTarget().paste();
	}

}
