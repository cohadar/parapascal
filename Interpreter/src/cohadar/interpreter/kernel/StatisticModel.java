package cohadar.interpreter.kernel;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class StatisticModel implements TableModel {
	private final String[] columnNames = { "Status", "Exit" };
	private final String[] idz;
	private final String[] exitz;
	private final int errorCount;

	// default empty model
	public StatisticModel() {
		this.idz = new String[0];
		this.exitz = new String[0];
		this.errorCount = 0;
	}

	// user defined data
	public StatisticModel(String[] idz, String exitz[], int errorCount) {
		this.idz = idz;
		this.exitz = exitz;
		this.errorCount = errorCount;
	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		// throw new UnsupportedOperationException();
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}

	@Override
	public int getColumnCount() {
		return 2;
	}

	@Override
	public String getColumnName(int columnIndex) {
		return columnNames[columnIndex];
	}

	@Override
	public int getRowCount() {
		return idz.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {
		case 0:
			return idz[rowIndex];
		case 1:
			return exitz[rowIndex];
		default:
			throw new RuntimeException("StaticModel.getValueAt");
		}
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		// throw new UnsupportedOperationException();
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		throw new UnsupportedOperationException();
	}

	public int getErrorCount() {
		return errorCount;
	}

}
