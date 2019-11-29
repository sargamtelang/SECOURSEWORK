package uk.ac.ed.bikerental;
import java.util.ArrayList;
import java.util.HashMap;

public class BikeProvider {
	
	
	private String ProviderName;
	private String ShopAddress;
	private String ShopPostCode;
	private int PhoneNumber;
    ArrayList<BikeType> BikeTypeList;
    
    HashMap<String,ArrayList<BikeType>> ProviderBikes = new HashMap<String,ArrayList<BikeType>>();
    
    
    
    
    
    public void FillProviderBikes()
    {
    	ProviderBikes.put(ProviderName,BikeType bt)
    }
    
    
	public String getProviderName() {
		return ProviderName;
	}
	public void setProviderName(String providerName) {
		ProviderName = providerName;
		
	}
	public String getShopAddress() {
		return ShopAddress;
	}
	public void setShopAddress(String shopAddress) {
		ShopAddress = shopAddress;
	}
	public String getShopPostCode() {
		return ShopPostCode;
	}
	public void setShopPostCode(String shopPostCode) {
		ShopPostCode = shopPostCode;
	}
	public int getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	} 
	
	

}
