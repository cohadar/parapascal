package cohadar.ceditor.gui.tabs;

import java.awt.event.KeyEvent;

import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

public class Tabs extends JTabbedPane {
	private final Problems problems;
	private final Console console;

	public Tabs() {
		addTab("Problems", null, new JScrollPane(problems = new Problems()), "syntax errors");
		setMnemonicAt(0, KeyEvent.VK_1);

		addTab("Console", null, new JScrollPane(console = new Console()), "stdout");
		setMnemonicAt(1, KeyEvent.VK_2);
	}

	public void clearAll() {
		problems.clear();
		console.clear();
	}

	public void clearConsole() {
		console.clear();
	}

	public void displayProblems(String errorText) {
		problems.setText(errorText);
	}

	public void selectConsole() {
		this.setSelectedIndex(1);
	}

	public void selectProblems() {
		this.setSelectedIndex(0);
	}

}
