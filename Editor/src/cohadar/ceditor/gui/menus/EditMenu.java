package cohadar.ceditor.gui.menus;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;

import cohadar.ceditor.gui.actions.edit.EditActions;

public class EditMenu extends JMenu implements ItemListener {

	private final EditActions editActions;

	public EditMenu(EditActions editActions) {
		super("Edit");
		this.editActions = editActions;
		this.setMnemonic(KeyEvent.VK_E);

		add(editActions.UNDO);
		add(editActions.REDO);

		addSeparator();

		add(editActions.CUT);
		add(editActions.COPY);
		add(editActions.PASTE);
		add(editActions.DELETE);
		add(editActions.SELECT_ALL);
		addSeparator();
		add(editActions.FIND);
		add(editActions.FIND_NEXT);

		// addSeparator();

		// add(editActions.FIND_REPLACE);
		this.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		editActions.getTarget().updateEditActions();
	}

}
