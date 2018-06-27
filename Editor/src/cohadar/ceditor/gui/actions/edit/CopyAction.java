package cohadar.ceditor.gui.actions.edit;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

class CopyAction extends AbstractAction {
	private final EditActions owner;

	CopyAction(EditActions owner) {
		super("Copy");
		this.owner = owner;

		putValue(ACCELERATOR_KEY,
				KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		owner.getTarget().copy();
	}

}
