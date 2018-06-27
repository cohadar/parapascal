package cohadar.ceditor.gui.actions.zoom;

import javax.swing.Action;

public class ZoomActions {
	private final ZoomActionsTarget target;

	public ZoomActions(ZoomActionsTarget target) {
		this.target = target;
	}

	public ZoomActionsTarget getTarget() {
		return target;
	}

	public final Action ZOOM_IN = new ZoomInAction(this);

	public final Action ZOOM_OUT = new ZoomOutAction(this);
}
