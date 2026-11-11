package adapter;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import domain.Driver;
import domain.Ride;


public class DriverAdapter extends AbstractTableModel {

	private static final long serialVersionUID = 1L;

	private final Driver driver;
	private final String[] columnNames = { "from", "to", "date", "places", "price" };

	public DriverAdapter(Driver driver) {
		this.driver = driver;
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		return driver.getRides().size();
	}

	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	@Override
	public Object getValueAt(int row, int col) {
		List<Ride> rides = driver.getRides();
		Ride ride = rides.get(row);
		switch (col) {
		case 0:
			return ride.getFrom();
		case 1:
			return ride.getTo();
		case 2:
			return ride.getDate();
		case 3:
			return ride.getnPlaces();
		case 4:
			return ride.getPrice();
		default:
			return null;
		}
	}
}