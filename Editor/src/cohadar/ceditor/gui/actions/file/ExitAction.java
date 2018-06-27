package cohadar.ceditor.gui.actions.file;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

class ExitAction extends AbstractAction {
	private final FileActions owner;

	ExitAction(FileActions owner) {
		super("Exit");
		this.owner = owner;

		putValue(SHORT_DESCRIPTION, "Exit application");
		putValue(MNEMONIC_KEY, KeyEvent.VK_X);
		putValue(ACCELERATOR_KEY,
				KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		owner.getTarget().exit();
	}

}
