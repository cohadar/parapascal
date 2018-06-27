package cohadar.ceditor.gui;

import java.awt.Image;

import javax.swing.filechooser.FileFilter;

public interface IFrameSetup {
	CodeFileEditor getEditor(AbstractFrame frame);

	FileFilter getFileFiler();

	Image getIconImage();
}
