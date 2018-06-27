package cohadar.assembler.gui.menus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JRadioButtonMenuItem;

public class ProcessorsMenu extends JMenu implements ActionListener {
	private final ButtonGroup group = new ButtonGroup();
	private static final int[] p = { 1, 2, 4, 8, 16, 32, 64, 128, 256 };
	private int numP = 1;

	public ProcessorsMenu() {
		super("Processors");
		this.setMnemonic(KeyEvent.VK_P);

		addSeparator();

		JRadioButtonMenuItem b = null;

		for (int i = 0; i < p.length; i++) {
			b = new JRadioButtonMenuItem(Integer.toString(p[i]));
			b.setActionCommand(Integer.toString(p[i]));
			b.addActionListener(this);
			if (i == 2) {
				numP = p[i];
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
		numP = Integer.parseInt(e.getActionCommand());
	}

	public int getProcessorCount() {
		return numP;
	}
}
