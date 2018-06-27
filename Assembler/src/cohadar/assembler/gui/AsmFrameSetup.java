package cohadar.assembler.gui;

import java.awt.Image;

import javax.swing.filechooser.FileFilter;

import cohadar.ceditor.ResourceLoader;
import cohadar.ceditor.gui.AbstractFrame;
import cohadar.ceditor.gui.CodeFileEditor;
import cohadar.ceditor.gui.IFrameSetup;

public class AsmFrameSetup implements IFrameSetup {

	@Override
	public CodeFileEditor getEditor(AbstractFrame frame) {
		return new AsmEditor(frame);
	}

	@Override
	public FileFilter getFileFiler() {
		return new AsmFileFilter();
	}

	@Override
	public Image getIconImage() {
		return ResourceLoader.ICON_ASM.getImage();
	}

}
