package cohadar.ceditor.gui.actions.run;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

class ListingAction extends AbstractAction {

	private final RunActions owner;

	ListingAction(RunActions owner) {
		super("Code Listing");
		this.owner = owner;

		putValue(SHORT_DESCRIPTION, "Prints code listing in console");
		putValue(MNEMONIC_KEY, KeyEvent.VK_L);
		putValue(ACCELERATOR_KEY,
				KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		owner.getTarget().codeListing();
	}

}
