package cohadar.pascal.gui;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class CPasFileFilter extends FileFilter {
	@Override
	public boolean accept(File file) {
		if (file.isDirectory()) {
			return true;
		}
		String name = file.getName();
		if (name != null) {
			if (name.toLowerCase().endsWith(".pas")) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String getDescription() {
		return "concurrent pascal file (*.pas)";
	}
}
