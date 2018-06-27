package cohadar.ceditor.gui.actions.file;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

class ExportAction extends AbstractAction {

	private final FileActions owner;

	ExportAction(FileActions owner) {
		super("Export to HTML");
		this.owner = owner;

		putValue(SHORT_DESCRIPTION, "Preserves color highlighting");
		// putValue(MNEMONIC_KEY, KeyEvent.VK_P);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		owner.getTarget().exportToHTML();
	}

}
