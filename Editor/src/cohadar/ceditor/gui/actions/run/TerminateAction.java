package cohadar.ceditor.gui.actions.run;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

import cohadar.ceditor.ResourceLoader;

class TerminateAction extends AbstractAction {

	private final RunActions owner;

	TerminateAction(RunActions owner) {
		super("Terminate");
		this.owner = owner;

		putValue(AbstractAction.LARGE_ICON_KEY, ResourceLoader.ICON_TERMINATE);
		putValue(SHORT_DESCRIPTION, "Terminate");
		putValue(MNEMONIC_KEY, KeyEvent.VK_T);
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.CTRL_MASK));
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		owner.getTarget().terminate();
	}

}
