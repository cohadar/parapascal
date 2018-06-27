package cohadar.ceditor.gui;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

// per thread statistic
public class StatisticPane extends JScrollPane {
	private static JTable table;

	public StatisticPane() {
		super(table = new JTable());
		table.setFillsViewportHeight(true);
	}

	public void clear() {
		table.setVisible(false);
	}

	public void setModel(TableModel dataModel) {
		if (dataModel != null) {
			table.setModel(dataModel);
			table.setVisible(true);
		}
	}
}
