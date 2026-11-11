package adapter;

import businessLogic.BLFacade;
import businessLogic.BLFacadeFactory;
import domain.Driver;


public class Main {

	public static void main(String[] args) throws Exception {
		BLFacade blFacade = BLFacadeFactory.createBLFacade();
		Driver d = blFacade.getDriver("Urtzi");
		DriverTable dt = new DriverTable(d);
		dt.setVisible(true);
	}
}

