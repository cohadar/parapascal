package cohadar.ceditor.gui.actions.edit;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

class FindNextAction extends AbstractAction {
	private final EditActions owner;

	FindNextAction(EditActions owner) {
		super("Find Next");
		this.owner = owner;

		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke("F3"));
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		owner.getTarget().findNext();
	}

}
