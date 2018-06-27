package cohadar.ceditor.gui;

import javax.swing.JOptionPane;

import cohadar.ceditor.Config;

public class BaseFrame extends AbstractFrame {
	public BaseFrame(Config config, IFrameSetup setup) {
		super(config, setup);
	}

	@Override
	public void run() {
		JOptionPane.showMessageDialog(this, "Abstract", "run", JOptionPane.INFORMATION_MESSAGE);
	}

	@Override
	public void terminate() {
		JOptionPane.showMessageDialog(this, "Abstract", "terminate", JOptionPane.INFORMATION_MESSAGE);
	}

	@Override
	public void codeListing() {
		JOptionPane.showMessageDialog(this, "Abstract", "codeListing", JOptionPane.INFORMATION_MESSAGE);
	}

}
