package cohadar.ceditor.gui.editorkit;

public interface CodeHighlighter {
	// this is called when ever document data is changed
	void recalculateStyles(CodeDocument doc);

	// Should return valid SyntaxStyle object for all offset values
	// if offset is invalid returns "BAD" CharacterStyle - usually red text
	CodeStyle getCharacterStyle(int offset);

	// syntax is by definition a content type
	String getContentType();
}
