package cohadar.ceditor.gui.widgets;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.JLabel;

/**
 * An underlined label that opens URL when clicked. Mouse over changes cursor to
 * hand like in browser.
 * */
public class HyperlinkLabel extends JLabel {
	public static final Color DEFAULT_LINK_COLOR = Color.BLUE;

	public HyperlinkLabel(String url) {
		this(url, null);
	}

	public HyperlinkLabel(String url, String label) {
		addMouseListener(new ClickAdapter());
		setUI(UnderlinedLabelUI.instance);
		this.url = url;
		if (label == null) {
			setText(url);
		} else {
			setText(label);
		}
		this.setForeground(DEFAULT_LINK_COLOR);
	}

	private final String url;

	private class ClickAdapter extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent mev) {
			if (isEnabled() && mev.getButton() == MouseEvent.BUTTON1) {
				openURL(url);
			}
		}

		@Override
		public void mouseEntered(MouseEvent mev) {
			setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		}

		@Override
		public void mouseExited(MouseEvent mev) {
			setCursor(Cursor.getDefaultCursor());
		}
	}

	private static void openURL(String url) {
		try {
			java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
