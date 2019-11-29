package uk.ac.ed.bikerental;
import java.time.LocalDate;
import java.util.ArrayList;

public class Big_System {

	private ArrayList<BikeProvider> bp;
	String providername;
	String shopaddress;
	String shoppostcode;
	LocalDate date;
	
	
	
	
	public Big_System(ArrayList<BikeProvider> bp, String ProviderName, String ShopAddress, String ShopPostCode,
			LocalDate date) {
		this.bp = bp;
		ProviderName = providername;
		ShopAddress = shopaddress;
		ShopPostCode = shoppostcode;
		this.date = date;
	}


	Customer customer = new Customer(FirstName, LastName, Address, postcode, date);
	
    GetQuotes(date, )
	
}
