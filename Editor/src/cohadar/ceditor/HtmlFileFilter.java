package cohadar.ceditor;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class HtmlFileFilter extends FileFilter {

	@Override
	public boolean accept(File file) {
		if (file.isDirectory()) {
			return true;
		}
		String name = file.getName();
		if (name != null) {
			if (name.toLowerCase().endsWith(".html")) {
				return true;
			}
			if (name.toLowerCase().endsWith(".htm")) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String getDescription() {
		return "Hyper Text Markup Language (*.html; *.htm)";
	}
}
