package cohadar.assembler.gui.menus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JRadioButtonMenuItem;

public class SchedulerMenu extends JMenu implements ActionListener {
	private final ButtonGroup group = new ButtonGroup();
	private String name;

	public SchedulerMenu(String[] names) {
		super("Scheduler");
		this.setMnemonic(KeyEvent.VK_S);

		JRadioButtonMenuItem b = null;

		for (int i = 0; i < names.length; i++) {
			b = new JRadioButtonMenuItem(names[i]);
			b.setActionCommand(names[i]);
			b.addActionListener(this);
			if (i == 0) {
				name = names[i];
				b.setSelected(true);
			} else {
				b.setSelected(false);
			}
			add(b);
			group.add(b);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		name = e.getActionCommand();
	}

	public String getSchedulerName() {
		return name;
	}

}
