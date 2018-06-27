package cohadar.ceditor;

import java.io.File;

public interface FileEditor {

	void newBuffer();

	boolean isDirty();

	boolean openFile(File file);

	boolean saveFile(File file);

	File getFile();

	boolean exportToHTML(File file);

}
