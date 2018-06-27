package cohadar.ceditor;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FileChooser extends JFileChooser {

	public FileChooser(Config config) {
		File workDirectory = new File(config.getWorkDirectory());
		if (workDirectory.exists() && workDirectory.isDirectory()) {
			this.setCurrentDirectory(workDirectory);
		} else {
			JOptionPane.showMessageDialog(null, config.getWorkDirectory(),
					"Directory not found", JOptionPane.ERROR_MESSAGE);
			this.setCurrentDirectory(new File("."));
			config.setWorkDirectory(".");
		}
	}
}
