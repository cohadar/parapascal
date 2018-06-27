package cohadar.assembler;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import cohadar.assembler.gui.AsmFrame;
import cohadar.assembler.gui.AsmFrameSetup;
import cohadar.ceditor.Config;
import cohadar.ceditor.ResourceLoader;

public class Main implements Runnable {

	private static void setNativeLookandFeel() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		setNativeLookandFeel();
		new ResourceLoader();
		javax.swing.SwingUtilities.invokeLater(new Main());
	}

	@Override
	public void run() {
		Config config = new Config("asm.cfg");
		config.load();
		new AsmFrame(config, new AsmFrameSetup());
	}
}
