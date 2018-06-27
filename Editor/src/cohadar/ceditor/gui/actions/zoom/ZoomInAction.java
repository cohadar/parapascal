package cohadar.ceditor.gui.actions.zoom;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

import cohadar.ceditor.ResourceLoader;

class ZoomInAction extends AbstractAction {

	private final ZoomActions owner;

	ZoomInAction(ZoomActions owner) {
		super("Zoom In");
		this.owner = owner;

		putValue(AbstractAction.LARGE_ICON_KEY, ResourceLoader.ICON_ZOOM_PLUS);
		putValue(SHORT_DESCRIPTION, "Increase font size");
		putValue(MNEMONIC_KEY, KeyEvent.VK_PLUS);
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_PLUS, ActionEvent.CTRL_MASK));
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		owner.getTarget().zoomIn();
	}

}
