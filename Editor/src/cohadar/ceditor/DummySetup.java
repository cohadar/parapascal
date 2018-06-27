package cohadar.ceditor;

import java.awt.Image;
import java.io.File;

import javax.swing.filechooser.FileFilter;

import cohadar.ceditor.gui.AbstractFrame;
import cohadar.ceditor.gui.CodeFileEditor;
import cohadar.ceditor.gui.IFrameSetup;

public class DummySetup implements IFrameSetup {
	class AllFileFilter extends FileFilter {

		@Override
		public boolean accept(File arg0) {
			return true;
		}

		@Override
		public String getDescription() {
			return "*.*";
		}
	}

	@Override
	public CodeFileEditor getEditor(AbstractFrame frame) {
		return new CodeFileEditor(frame);
	}

	@Override
	public FileFilter getFileFiler() {
		return new AllFileFilter();
	}

	@Override
	public Image getIconImage() {
		return null;
	}

}
