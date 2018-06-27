package cohadar.ceditor.gui.tabs;

import javax.swing.JTextArea;

public class Problems extends JTextArea {
	Problems() {
		setEditable(false);
	}

	public void clear() {
		this.setText("");
	}
}
