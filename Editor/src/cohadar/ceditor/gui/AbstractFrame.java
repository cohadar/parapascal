package cohadar.ceditor.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.WindowConstants;

import cohadar.ceditor.Config;
import cohadar.ceditor.FileHandler;
import cohadar.ceditor.gui.actions.edit.EditActions;
import cohadar.ceditor.gui.actions.file.FileActions;
import cohadar.ceditor.gui.actions.run.RunActions;
import cohadar.ceditor.gui.actions.run.RunActionsTarget;
import cohadar.ceditor.gui.actions.zoom.ZoomActions;
import cohadar.ceditor.gui.menus.EditMenu;
import cohadar.ceditor.gui.menus.FileMenu;
import cohadar.ceditor.gui.menus.RunMenu;
import cohadar.ceditor.gui.tabs.Tabs;

public abstract class AbstractFrame extends JFrame implements RunActionsTarget {
	private final RunActions runActions = new RunActions(this);
	private final ZoomActions zoomActions;
	protected final CodeFileEditor editor;
	private final EditActions editActions;
	private final FileHandler fileHandler;
	private final FileActions fileActions;
	private final JToolBar toolbar;
	protected Tabs tabs;

	private boolean hasErrors = false;
	protected boolean running = false;
	protected final StatisticPane statPane;
	protected final JMenuBar menubar;
	private SearchBar searchBar;

	public CodeFileEditor getEditor() {
		return editor;
	}

	private static AbstractFrame instance;

	public static AbstractFrame get() {
		return instance;
	}

	public AbstractFrame(Config config, IFrameSetup setup) {
		instance = this;
		setTitle("new");
		editor = setup.getEditor(this);
		editActions = editor.getEditActions();
		fileHandler = new FileHandler(this, editor, config);
		fileActions = fileHandler.getFileActions();
		zoomActions = new ZoomActions(editor);
		statPane = new StatisticPane();

		toolbar = new JToolBar();
		fillToolBar();

		menubar = new JMenuBar();

		fileHandler.getFileChooser().setFileFilter(setup.getFileFiler());

		JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, new JScrollPane(editor), tabs = new Tabs());
		JSplitPane main = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, splitPane, statPane);
		splitPane.setOneTouchExpandable(true);
		main.setOneTouchExpandable(true);

		this.setPreferredSize(new Dimension(800, 600));
		this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new ExitInterceptor());

		this.getContentPane().add(main, BorderLayout.CENTER);
		this.getContentPane().add(toolbar, BorderLayout.PAGE_START);

		this.setJMenuBar(menubar);
		menubar.add(new FileMenu(fileActions));
		menubar.add(new EditMenu(editActions));
		menubar.add(new RunMenu(runActions));

		this.setIconImage(setup.getIconImage());

		this.pack();
		this.setLocationRelativeTo(null);
		splitPane.setDividerLocation(0.65);
		main.setDividerLocation(0.8);

		// Make editor get the focus whenever frame is activated.
		this.addWindowFocusListener(new WindowAdapter() {
			@Override
			public void windowGainedFocus(WindowEvent e) {
				editor.requestFocusInWindow();
			}
		});

		this.setVisible(true);
	}

	private void fillToolBar() {
		toolbar.setFloatable(false);

		toolbar.add(fileActions.NEW);
		toolbar.add(fileActions.OPEN);
		toolbar.add(fileActions.SAVE);
		// addSeparator();
		// add(editActions.CUT);
		// add(editActions.COPY);
		// add(editActions.PASTE);
		toolbar.addSeparator();
		toolbar.add(editActions.UNDO);
		toolbar.add(editActions.REDO);
		toolbar.addSeparator();
		toolbar.add(zoomActions.ZOOM_IN);
		toolbar.add(zoomActions.ZOOM_OUT);
		toolbar.addSeparator();
		toolbar.add(runActions.RUN);
		toolbar.add(runActions.TERMINATE);
		runActions.TERMINATE.setEnabled(false);

		toolbar.addSeparator();
		toolbar.add(searchBar = new SearchBar(editor));
	}

	private class ExitInterceptor extends WindowAdapter {

		@Override
		public void windowClosing(WindowEvent arg0) {
			fileHandler.exit();
		}

	}

	protected void updateStatus() {
		if (running) {
			runActions.TERMINATE.setEnabled(true);
			runActions.RUN.setEnabled(false);
			runActions.LISTING.setEnabled(false);
			fileActions.disableAll();
		} else {
			runActions.TERMINATE.setEnabled(false);
			fileActions.enableAll();
			if (hasErrors) {
				runActions.LISTING.setEnabled(false);
				runActions.RUN.setEnabled(false);
			} else {
				runActions.LISTING.setEnabled(true);
				runActions.RUN.setEnabled(true);
			}
		}
	}

	public void displayProblems(String errorText) {
		tabs.displayProblems(errorText);
	}

	public void setErrorStatus(boolean hasErrors) {
		this.hasErrors = hasErrors;
		if (hasErrors) {
			tabs.selectProblems();
		}
		updateStatus();
	}

	public void find() {
		searchBar.find();
	}

	public void findNext() {
		searchBar.findNext();
	}

}
