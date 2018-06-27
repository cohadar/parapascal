package cohadar.ceditor.gui.menus;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;

import cohadar.ceditor.gui.actions.run.RunActions;

public class RunMenu extends JMenu {

	public RunMenu(RunActions actions) {
		super("Run");
		this.setMnemonic(KeyEvent.VK_R);

		add(actions.LISTING);
		addSeparator();

		add(actions.RUN);
		add(actions.TERMINATE);
	}

}
