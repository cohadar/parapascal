package cohadar.ceditor.gui.actions.edit;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

class SelectAllAction extends AbstractAction {
	private final EditActions owner;

	SelectAllAction(EditActions owner) {
		super("Select All");
		this.owner = owner;

		putValue(ACCELERATOR_KEY,
				KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		owner.getTarget().selectAll();
	}

}
