package cohadar.ceditor;

import java.net.URL;

import javax.swing.ImageIcon;

public class ResourceLoader {

	public static final String PATH_ASM = "icons/asm.png";
	public static final String PATH_PAS = "icons/pas.png";

	public static final String PATH_NEW = "icons/1.png";
	public static final String PATH_OPEN = "icons/52.png";
	public static final String PATH_SAVE = "icons/22.png";

	public static final String PATH_UNDO = "icons/45.png";
	public static final String PATH_REDO = "icons/46.png";

	public static final String PATH_RUN = "icons/94.png";
	public static final String PATH_TERMINATE = "icons/33.png";

	public static final String ZOOM_PLUS = "icons/83.png";
	public static final String ZOOM_MINUS = "icons/82.png";

	public static ImageIcon ICON_ASM;
	public static ImageIcon ICON_PAS;

	public static ImageIcon ICON_NEW;
	public static ImageIcon ICON_OPEN;
	public static ImageIcon ICON_SAVE;

	public static ImageIcon ICON_UNDO;
	public static ImageIcon ICON_REDO;

	public static ImageIcon ICON_RUN;
	public static ImageIcon ICON_TERMINATE;

	public static ImageIcon ICON_ZOOM_PLUS;
	public static ImageIcon ICON_ZOOM_MINUS;

	private static ClassLoader classLoader;

	private static ImageIcon loadIcon(String path) {
		URL url = classLoader.getResource(path);
		if (url == null) {
			System.err.println("Icon not found: " + path);
			return null;
		} else {
			return new ImageIcon(url);
		}
	}

	public ResourceLoader() {
		classLoader = getClass().getClassLoader();
		ICON_ASM = loadIcon(PATH_ASM);
		ICON_PAS = loadIcon(PATH_PAS);
		ICON_NEW = loadIcon(PATH_NEW);
		ICON_OPEN = loadIcon(PATH_OPEN);
		ICON_SAVE = loadIcon(PATH_SAVE);
		ICON_UNDO = loadIcon(PATH_UNDO);
		ICON_REDO = loadIcon(PATH_REDO);
		ICON_RUN = loadIcon(PATH_RUN);
		ICON_TERMINATE = loadIcon(PATH_TERMINATE);
		ICON_ZOOM_PLUS = loadIcon(ZOOM_PLUS);
		ICON_ZOOM_MINUS = loadIcon(ZOOM_MINUS);
	}
}
