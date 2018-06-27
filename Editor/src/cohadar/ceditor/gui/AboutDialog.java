package cohadar.ceditor.gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import cohadar.ceditor.gui.widgets.HyperlinkLabel;

public class AboutDialog extends JDialog implements ActionListener {
	private static final String AUTHOR = "Damir Čohadarević";
	private static final String HOME_PAGE = "http://parapascal.sourceforge.net";
	private static final String LICENSE = "http://www.opensource.org/licenses/mit-license.php";
	private static final String ICONS = "http://www.aha-soft.com";

	private final JButton okButton = new JButton("Ok");

	public AboutDialog(AbstractFrame mainFrame, String title, ImageIcon icon) {
		super(mainFrame);
		this.setTitle(title);
		this.setLayout(new BorderLayout());
		this.add(new JLabel(icon), BorderLayout.WEST);
		this.add(new LinkPanel(), BorderLayout.CENTER);
		this.add(okButton, BorderLayout.SOUTH);
		this.pack();
		this.setResizable(false);
		this.setLocationRelativeTo(this.getOwner());
		this.setModal(true);
		okButton.addActionListener(this);
	}

	@Override
	public void setVisible(boolean visible) {
		this.setLocationRelativeTo(this.getOwner());
		super.setVisible(visible);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
	}

	class LinkPanel extends JPanel {
		public LinkPanel() {
			this.setBorder(BorderFactory.createLoweredBevelBorder());
			GridLayout thisLayout = new GridLayout(4, 1);
			thisLayout.setHgap(10);
			thisLayout.setVgap(10);
			this.setLayout(thisLayout);

			Font font = this.getFont();
			font = font.deriveFont(font.getSize() * 1.5f);

			JLabel temp = null;

			this.add(new HGroup(new JLabel("Author:"), temp = new JLabel(AUTHOR)));
			temp.setFont(font);

			this.add(new HGroup(new JLabel("Home Page:"), temp = new HyperlinkLabel(HOME_PAGE,
					"http://parapascal.sf.net")));
			temp.setFont(font);

			this.add(new HGroup(new JLabel("License:"), temp = new HyperlinkLabel(LICENSE, "MIT")));
			temp.setFont(font);

			this.add(new HGroup(new JLabel("Icons:"), temp = new HyperlinkLabel(ICONS, "Aha Soft")));
			temp.setFont(font);

		}
	}

	class HGroup extends JPanel {
		public HGroup(JComponent... components) {
			for (JComponent c : components) {
				this.add(c);
			}
		}
	}
}
