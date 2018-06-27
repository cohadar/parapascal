package cohadar.ceditor.gui.editorkit;

import java.awt.Color;
import java.awt.Font;

public final class CodeStyle {

	private final Color color;
	private final int fontStyle;

	public CodeStyle(Color color, int fontStyle) {
		super();
		this.color = color;
		this.fontStyle = fontStyle;
	}

	public CodeStyle(Color color) {
		super();
		this.color = color;
		this.fontStyle = Font.PLAIN;
	}

	public int getFontStyle() {
		return fontStyle;
	}

	public Color getColor() {
		return color;
	}

	public String getHtmlStart() {
		String ret = "";

		if (Color.BLACK.equals(color) == false) {
			ret += String.format("<font color='#%02X%02X%02X'>", color.getRed(), color.getGreen(), color.getBlue());
		}
		if ((fontStyle & Font.BOLD) != 0) {
			ret += "<b>";
		}
		if ((fontStyle & Font.ITALIC) != 0) {
			ret += "<i>";
		}
		return ret;
	}

	public String getHtmlEnd() {
		String ret = "";
		if ((fontStyle & Font.ITALIC) != 0) {
			ret += "</i>";
		}
		if ((fontStyle & Font.BOLD) != 0) {
			ret += "</b>";
		}
		if (Color.BLACK.equals(color) == false) {
			ret += "</font>";
		}
		return ret;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + fontStyle;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CodeStyle other = (CodeStyle) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (fontStyle != other.fontStyle)
			return false;
		return true;
	}

}
