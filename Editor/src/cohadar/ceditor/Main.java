package cohadar.ceditor;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import cohadar.ceditor.gui.BaseFrame;

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
		Config config = new Config("test.cfg");
		config.load();
		new BaseFrame(config, new DummySetup());
	}
}
