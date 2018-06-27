package cohadar.pascal.gui;

import java.awt.Image;

import javax.swing.filechooser.FileFilter;

import cohadar.ceditor.ResourceLoader;
import cohadar.ceditor.gui.AbstractFrame;
import cohadar.ceditor.gui.CodeFileEditor;
import cohadar.ceditor.gui.IFrameSetup;

public class PasFrameSetup implements IFrameSetup {

	@Override
	public CodeFileEditor getEditor(AbstractFrame frame) {
		return new CPasEditor(frame);
	}

	@Override
	public FileFilter getFileFiler() {
		return new CPasFileFilter();
	}

	@Override
	public Image getIconImage() {
		return ResourceLoader.ICON_PAS.getImage();
	}

}
