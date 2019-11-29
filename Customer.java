package uk.ac.ed.bikerental;
import java.time.LocalDate;

public class Customer {
	
	String FirstName;
	String LastName;
	String Address;     
	String postcode;  
	LocalDate start;  
	LocalDate end; 
	BikeType customerType;
	
	public Customer(String firstName, String lastName, String address, String postcode, LocalDate start,LocalDate end, BikeType CustomerType) {
		
		FirstName = firstName;
		LastName = lastName;
		Address = address;
		this.postcode = postcode;
		this.date = date;
		customerType = CustomerType;
		
	}

	public BikeType getCustomerType() {
		return customerType;
	}

	public void setCustomerType(BikeType customerType) {
		this.customerType = customerType;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	

}
