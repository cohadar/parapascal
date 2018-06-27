package cohadar.assembler.gui;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class AsmFileFilter extends FileFilter {

	@Override
	public boolean accept(File file) {
		if (file.isDirectory()) {
			return true;
		}
		String name = file.getName();
		if (name != null) {
			if (name.toLowerCase().endsWith(".asm")) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String getDescription() {
		return "concurrent assembler file (*.asm)";
	}
}
