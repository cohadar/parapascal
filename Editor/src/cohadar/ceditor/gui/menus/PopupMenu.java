package cohadar.ceditor.gui.menus;

import java.awt.Component;

import javax.swing.JPopupMenu;

import cohadar.ceditor.gui.actions.edit.EditActions;

public class PopupMenu extends JPopupMenu {

	private final EditActions actions;

	public PopupMenu(EditActions actions) {
		this.actions = actions;
		this.add(actions.CUT);
		this.add(actions.COPY);
		this.add(actions.PASTE);
		this.add(actions.DELETE);
		this.addSeparator();
		this.add(actions.SELECT_ALL);
	}

	@Override
	public void show(Component invoker, int x, int y) {
		actions.getTarget().updateEditActions();
		super.show(invoker, x, y);
	}
}
