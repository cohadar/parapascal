package cohadar.ceditor.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.PlainDocument;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;

import cohadar.ceditor.FileEditor;
import cohadar.ceditor.gui.actions.edit.EditActions;
import cohadar.ceditor.gui.actions.edit.EditActionsTarget;
import cohadar.ceditor.gui.actions.zoom.ZoomActionsTarget;
import cohadar.ceditor.gui.editorkit.CodeEditorKit;
import cohadar.ceditor.gui.editorkit.CodeHighlighter;
import cohadar.ceditor.gui.editorkit.CodeStyle;
import cohadar.ceditor.gui.menus.PopupMenu;

// NOTE: Some action methods from EditActionsTarget interface are
// implemented by default in all JTextComponent-s so we don't need to
// implement them here.
// Those methods are: cut(), copy(), paste() and selectAll()

public class CodeFileEditor extends JEditorPane implements FileEditor,
		DocumentListener, EditActionsTarget, ZoomActionsTarget {
	private boolean dirty = false;
	private File inputFile = null;
	private final AbstractFrame owner;
	private final EditActions editActions = new EditActions(this);
	private final CodeUndoManager undoManager;
	private final PopupMenu popup = new PopupMenu(editActions);

	@Override
	public boolean isDirty() {
		return dirty;
	}

	public JFrame getOwner() {
		return owner;
	}

	public EditActions getEditActions() {
		return editActions;
	}

	public CodeFileEditor(AbstractFrame owner) {
		this.owner = owner;
		this.setFont(new Font("Courier New", 0, 14));
		this.undoManager = new CodeUndoManager(this.getDocument(), editActions);
		this.getDocument().addDocumentListener(this);
		this.addMouseListener(new PopupListener(popup));
		undoManager.updateUndoRedo();
	}

	@Override
	public File getFile() {
		return inputFile;
	}

	private void setDirty() {
		if (!dirty) {
			dirty = true;
			if (inputFile == null) {
				owner.setTitle("new*");
			} else {
				owner.setTitle(inputFile.getAbsolutePath() + "*");
			}
		}
	}

	@Override
	public void updateEditActions() {
		boolean isEnabled = this.isEnabled();
		boolean hasSelection = (this.getSelectionEnd() != this
				.getSelectionStart());
		boolean isEditable = this.isEditable() && this.isEditable();

		editActions.CUT.setEnabled(isEnabled && hasSelection && isEditable);
		editActions.COPY.setEnabled(isEnabled && hasSelection);
		editActions.PASTE.setEnabled(isEnabled && isEditable);
		editActions.DELETE.setEnabled(isEnabled && hasSelection && isEditable);
		editActions.SELECT_ALL.setEnabled(isEnabled);
	}

	@Override
	public void changedUpdate(DocumentEvent arg0) {
		setDirty();
	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		setDirty();
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		setDirty();
	}

	private int getRowCount() {
		Element element = getDocument().getDefaultRootElement();
		return element.getElementCount();
	}

	private int oldLeft = 5;
	private Border oldBorder = BorderFactory.createMatteBorder(0, 5, 0, 0,
			Color.black);

	// creates new border object only if width changes
	private Border getBorderOptimized(int left) {
		if (oldLeft != left) {
			oldLeft = left;
			oldBorder = BorderFactory.createMatteBorder(0, left, 0, 0,
					Color.black);
		}
		return oldBorder;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		int rowCount = getRowCount();
		int row_width = getFontMetrics(getFont()).getWidths()[0];
		
		// calculate width based on number of digits in row count
		// 1..9 -> 1
		// 10..99 -> 2
		// 100...999 -> 3
		int width = (int) Math.log10(rowCount) + 1;
		
		setBorder(getBorderOptimized(row_width * width + 5));
		g.setColor(Color.white);
		// compute information to help draw the line numbers
		int row_height = getFontMetrics(getFont()).getHeight();
		// top margin depends on your font -- may need to adjust a little
		int top_margin = getInsets().top + row_height - 3;
		int left_margin = 2;
		int line = 1;
		// draw the line numbers
		for (int y = top_margin; y < rowCount * row_height; y += row_height) {
			g.drawString("" + line++, left_margin, y);
		}

	}

	@Override
	public void newBuffer() {
		inputFile = null;
		this.setText("");
		dirty = false;
		owner.setTitle("new");
		undoManager.discardAllEdits();
		undoManager.updateUndoRedo();
	}

	// TODO: better exception handling
	@Override
	public boolean openFile(File file) {
		try {
			StringBuilder sb = new StringBuilder();

			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line);
				sb.append('\n');
			}

			Document doc = this.getDocument();
			doc.remove(0, doc.getLength());
			doc.insertString(0, sb.toString(), null);
			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		} catch (BadLocationException e) {
			e.printStackTrace();
			return false;
		}
		inputFile = file;
		dirty = false;
		owner.setTitle(inputFile.getAbsolutePath());

		undoManager.discardAllEdits();
		undoManager.updateUndoRedo();
		return true;
	}

	private static boolean saveFile(File file, String text) {
		try {
			FileWriter fw = new FileWriter(file);
			fw.write(text);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	// TODO: better exception handling
	@Override
	public boolean saveFile(File file) {
		Document doc = this.getDocument();
		String text = null;
		try {
			text = doc.getText(0, doc.getLength());
		} catch (BadLocationException e) {
			e.printStackTrace();
		}

		if (saveFile(file, text)) {
			inputFile = file;
			dirty = false;
			owner.setTitle(inputFile.getAbsolutePath());
			return true;
		}
		return false;
	}

	@Override
	public void undo() {
		try {
			undoManager.undo();
		} catch (CannotUndoException ex) {
			System.err.println("Unable to undo: " + ex);
			ex.printStackTrace();
		}
		undoManager.updateUndoRedo();
	}

	@Override
	public void redo() {
		try {
			undoManager.redo();
		} catch (CannotRedoException ex) {
			System.err.println("Unable to redo: " + ex);
			ex.printStackTrace();
		}
		undoManager.updateUndoRedo();
	}

	@Override
	public void delete() {
		if (getSelectedText() != null) {
			replaceSelection(null);
		}
	}

	public void mergeNextEdit() {
		undoManager.mergeNextEdit();
	}

	@Override
	public void find() {
		owner.find();
	}

	@Override
	public void findNext() {
		owner.findNext();
	}

	@Override
	public boolean exportToHTML(File file) {
		Document doc = this.getDocument();
		int tabSize = (Integer) doc.getProperty(PlainDocument.tabSizeAttribute);
		String text = null;
		try {
			text = doc.getText(0, doc.getLength());
		} catch (BadLocationException e) {
			e.printStackTrace();
		}

		CodeHighlighter ch = ((CodeEditorKit) this.getEditorKit())
				.getCodeHighlighter();
		StringBuilder ret = new StringBuilder();
		ret.append("<html>\n");
		ret.append("<body>\n");
		ret.append("<code>\n");
		ret.append("<pre>\n");
		ret.append("\n");

		CodeStyle oldStyle = null;
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (Character.isWhitespace(c)) {
				if (oldStyle != null) {
					ret.append(oldStyle.getHtmlEnd());
				}
				oldStyle = null;
				if (c == '\t') {
					for (int t = 0; t < tabSize; t++) {
						ret.append(' ');
					}
				} else {
					ret.append(c);
				}
			} else {
				CodeStyle style = ch.getCharacterStyle(i);
				if (style != oldStyle) {
					if (oldStyle != null) {
						ret.append(oldStyle.getHtmlEnd());
					}
					if (style != null) {
						ret.append(style.getHtmlStart());
					}
					oldStyle = style;
				}
				ret.append(c);
			}
		}
		if (oldStyle != null) {
			ret.append(oldStyle.getHtmlEnd());
		}

		ret.append("\n");
		ret.append("</pre>\n");
		ret.append("</code>\n");
		ret.append("</body>\n");
		ret.append("</html>\n");
		return saveFile(file, ret.toString());
	}

	@Override
	public void zoomIn() {
		Font font = this.getFont();
		float newSize = font.getSize() + 1.0f;
		this.setFont(font.deriveFont(newSize));
	}

	@Override
	public void zoomOut() {
		Font font = this.getFont();
		float newSize = font.getSize() - 1.0f;
		this.setFont(font.deriveFont(newSize));
	}

}
