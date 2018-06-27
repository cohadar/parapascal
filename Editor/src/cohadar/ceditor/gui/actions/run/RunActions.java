package cohadar.ceditor.gui.actions.run;

import javax.swing.Action;

public class RunActions {
	private final RunActionsTarget target;

	public RunActions(RunActionsTarget target) {
		this.target = target;
	}

	public RunActionsTarget getTarget() {
		return target;
	}

	public final Action RUN = new RunAction(this);

	public final Action TERMINATE = new TerminateAction(this);

	public final Action LISTING = new ListingAction(this);
}
