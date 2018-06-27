package cohadar.assembler.gui.menus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JRadioButtonMenuItem;

import cohadar.interpreter.kernel.CCSemaphore;

public class SemaphoreMenu extends JMenu implements ActionListener {
	private final ButtonGroup group = new ButtonGroup();

	public SemaphoreMenu() {
		super("Semaphore");
		this.setMnemonic(KeyEvent.VK_M);

		String[] names = CCSemaphore.getNames();

		JRadioButtonMenuItem b = null;

		for (int i = 0; i < names.length; i++) {
			b = new JRadioButtonMenuItem(names[i]);
			b.setActionCommand(names[i]);
			b.addActionListener(this);
			if (i == 0) {
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
		CCSemaphore.setDiscipline(e.getActionCommand());
	}

}
