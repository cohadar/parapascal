package cohadar.ceditor.gui.menus;

import javax.swing.JMenuBar;

import cohadar.ceditor.gui.actions.edit.EditActions;
import cohadar.ceditor.gui.actions.file.FileActions;

public class MenuBar extends JMenuBar {

	public MenuBar(FileActions fileActions, EditActions editActions) {
		add(new FileMenu(fileActions));
		add(new EditMenu(editActions));
	}
}
