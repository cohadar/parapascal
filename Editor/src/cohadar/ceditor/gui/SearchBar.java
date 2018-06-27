package cohadar.ceditor.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;

public class SearchBar extends JPanel implements DocumentListener, ActionListener, FocusListener {
	private final JTextComponent editor;
	private final JTextField search;
	private final Document content_doc;
	private final JCheckBox matchCase;
	protected Matcher matcher;
	private boolean changed = false;

	public SearchBar(JTextComponent editor) {
		this.editor = editor;
		FlowLayout flow = new FlowLayout();
		flow.setAlignment(FlowLayout.LEFT);
		this.setLayout(flow);
		search = new JTextField(20);
		search.setToolTipText("search");
		this.add(search);
		matchCase = new JCheckBox();
		this.add(matchCase);
		this.add(new JLabel("Match case"));

		content_doc = editor.getDocument();

		content_doc.addDocumentListener(this);
		search.getDocument().addDocumentListener(this);

		search.addFocusListener(this);

		search.addActionListener(this);
		matchCase.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == matchCase) {
			runNewSearch();
		} else {
			findNext();
		}
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		if (e.getDocument() == content_doc) {
			changed = true;
		} else {
			runNewSearch();
		}
	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		if (e.getDocument() == content_doc) {
			changed = true;
		} else {
			runNewSearch();
		}
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		if (e.getDocument() == content_doc) {
			changed = true;
		} else {
			runNewSearch();
		}
	}

	private Matcher newMatcher() throws BadLocationException {
		if (matchCase.isSelected()) {
			Pattern pattern = Pattern.compile(search.getText());
			return pattern.matcher(content_doc.getText(0, content_doc.getLength()));
		} else {
			Pattern pattern = Pattern.compile(search.getText().toLowerCase());
			return pattern.matcher(content_doc.getText(0, content_doc.getLength()).toLowerCase());
		}
	}

	private void matcherReset() throws BadLocationException {
		if (matcher == null) {
			matcher = newMatcher();
		} else {
			if (matchCase.isSelected()) {
				matcher.reset(content_doc.getText(0, content_doc.getLength()));
			} else {
				matcher.reset(content_doc.getText(0, content_doc.getLength()).toLowerCase());
			}
		}
	}

	private void runNewSearch() {
		try {
			matcher = newMatcher();
			continueSearch(0);
		} catch (Exception ex) {
			// ex.printStackTrace();
		}
	}

	private void continueSearch(int index) {
		try {
			if (matcher.find(index)) {
				editor.getCaret().setDot(matcher.start());
				editor.getCaret().moveDot(matcher.end());
				editor.getCaret().setSelectionVisible(true);
			} else {
				if (index != 0) {
					continueSearch(0);
				}
			}
		} catch (Exception ex) {
			// ex.printStackTrace();
		}
	}

	public void findNext() {
		try {
			if (changed) {
				changed = false;
				matcherReset();
			}
			continueSearch(editor.getCaretPosition());
		} catch (Exception ex) {
			// ex.printStackTrace();
		}
	}

	@Override
	public void focusGained(FocusEvent e) {
		search.selectAll();
	}

	@Override
	public void focusLost(FocusEvent e) {
		editor.requestFocusInWindow();
	}

	public void find() {
		search.requestFocusInWindow();
	}

}
