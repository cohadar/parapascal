package cohadar.ceditor;

import javax.swing.JFileChooser;

public class HtmlChooser extends JFileChooser {
	public HtmlChooser() {
		this.setFileFilter(new HtmlFileFilter());
	}
}
