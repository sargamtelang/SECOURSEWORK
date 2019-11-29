package uk.ac.ed.bikerental;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
public class System

{
	
	
	BikeType bt = Customer.getCustomerType();
	
	public static HashMap<BikeProvider, LocalDate> GetQuotes(DateRange d, BikeType bt) {
		
		HashMap<BikeProvider, LocalDate> Output1 = new HashMap<BikeProvider, LocalDate>();
		
		if (bt.BikeStatus == false) {
			Output1.put(null,null);
			return Output1;
		}
		
		else
		{
		  
		}
	    
		
		
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
