package cohadar.ceditor.gui.menus;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;

import cohadar.ceditor.gui.actions.file.FileActions;

public class FileMenu extends JMenu {

	public FileMenu(FileActions fileActions) {
		super("File");
		this.setMnemonic(KeyEvent.VK_F);

		add(fileActions.NEW);
		add(fileActions.OPEN);

		addSeparator();

		add(fileActions.SAVE);
		add(fileActions.SAVE_AS);

		addSeparator();

		add(fileActions.EXPORT_TO_HTML);
		addSeparator();

		add(fileActions.EXIT);
	}

}
