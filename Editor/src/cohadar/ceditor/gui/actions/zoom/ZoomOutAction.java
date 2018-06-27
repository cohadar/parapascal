package cohadar.ceditor.gui.actions.zoom;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

import cohadar.ceditor.ResourceLoader;

class ZoomOutAction extends AbstractAction {

	private final ZoomActions owner;

	ZoomOutAction(ZoomActions owner) {
		super("Zoom Out");
		this.owner = owner;

		putValue(AbstractAction.LARGE_ICON_KEY, ResourceLoader.ICON_ZOOM_MINUS);
		putValue(SHORT_DESCRIPTION, "Decrease font size");
		putValue(MNEMONIC_KEY, KeyEvent.VK_MINUS);
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, ActionEvent.CTRL_MASK));
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		owner.getTarget().zoomOut();
	}

}
