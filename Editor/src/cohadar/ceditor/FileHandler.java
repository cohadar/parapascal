package cohadar.ceditor;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import cohadar.ceditor.gui.actions.file.FileActions;
import cohadar.ceditor.gui.actions.file.FileActionsTarget;

public class FileHandler implements FileActionsTarget {
	private final FileActions fileActions = new FileActions(this);
	private final JFrame frame;
	private final FileEditor editor;
	private final Config config;
	private final JFileChooser fileChooser = new JFileChooser();
	private final HtmlChooser htmlChooser = new HtmlChooser();

	public FileHandler(JFrame frame, FileEditor editor) {
		this.frame = frame;
		this.editor = editor;
		this.config = null;
		initFileChooser();
	}

	public FileHandler(JFrame frame, FileEditor editor, Config config) {
		this.frame = frame;
		this.editor = editor;
		this.config = config;
		initFileChooser();
	}

	private void initFileChooser() {
		if (config != null) {
			File workDirectory = new File(config.getWorkDirectory());
			if (workDirectory.exists() && workDirectory.isDirectory()) {
				fileChooser.setCurrentDirectory(workDirectory);
				config.setWorkDirectory(workDirectory.getPath());
				return;
			}
		}
		fileChooser.setCurrentDirectory(new File("."));
		config.setWorkDirectory(".");
	}

	public JFileChooser getFileChooser() {
		return fileChooser;
	}

	@Override
	public void newFile() {
		if (handleUnsaved()) {
			editor.newBuffer();
		}
	}

	@Override
	public void open() {
		if (handleUnsaved()) {
			fileChooser.setDialogTitle("Open");
			if (fileChooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION) {
				File file = fileChooser.getSelectedFile();
				if (editor.openFile(file)) {
					if (config != null) {
						config.setWorkDirectory(file.getParent());
					}
				}
			}
		}
	}

	// returns true on successful save
	@Override
	public boolean save() {
		if (editor.isDirty()) {
			if (editor.getFile() == null) {
				return saveAs();
			} else {
				if (editor.saveFile(editor.getFile())) {
					if (config != null) {
						config.setWorkDirectory(editor.getFile().getParent());
					}
					return true;
				}
			}

		}
		return false;
	}

	// returns true on successful save
	@Override
	public boolean saveAs() {
		fileChooser.setDialogTitle("Save As");
		if (fileChooser.showSaveDialog(frame) == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			if (editor.saveFile(file)) {
				return true;
			}
		}
		return false;
	}

	private int offerToSaveUnsaved() {
		if (editor.getFile() == null) {
			return JOptionPane.showConfirmDialog(frame, "Save modified buffer", "Save",
					JOptionPane.YES_NO_CANCEL_OPTION);
		} else {
			return JOptionPane.showConfirmDialog(frame, "Save file " + editor.getFile().getName(), "Save",
					JOptionPane.YES_NO_CANCEL_OPTION);
		}
	}

	// if this method returns false, abort current action.
	private boolean handleUnsaved() {
		if (editor.isDirty()) {
			int ret = offerToSaveUnsaved();

			switch (ret) {
			case JOptionPane.YES_OPTION: {
				return this.save();
			}
			case JOptionPane.NO_OPTION: {
				return true;
			}
			default: {
				return false;
			}
			}
		}
		return true;
	}

	@Override
	public void exit() {
		if (handleUnsaved()) {
			if (config != null) {
				config.store();
			}
			System.exit(0);
		}
	}

	public FileActions getFileActions() {
		return fileActions;
	}

	@Override
	public boolean exportToHTML() {
		htmlChooser.setDialogTitle("Export to HTML");
		if (htmlChooser.showSaveDialog(frame) == JFileChooser.APPROVE_OPTION) {
			File file = htmlChooser.getSelectedFile();
			if (editor.exportToHTML(file)) {
				return true;
			}
		}
		return false;
	}
}
