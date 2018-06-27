package cohadar.ceditor.gui.actions.edit;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

class DeleteAction extends AbstractAction {
	private final EditActions owner;

	DeleteAction(EditActions owner) {
		super("Delete");
		this.owner = owner;

		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		owner.getTarget().delete();
	}

}
