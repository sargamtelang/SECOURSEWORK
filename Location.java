package uk.ac.ed.bikerental;

public class Location {
    private String postcode;
    private String address;
    
    public Location(String postcode, String address) {
        assert postcode.length() >= 6;
        this.postcode = postcode;
        this.address = address;
    } 
    
    public boolean isNearTo(Location other) {
        // TODO: Implement Location.isNearTo
    	String p1 = postcode.substring(0, 2);
    	String p2 = other.postcode.substring(0, 2);
    	if (p1 == p2) 
    	{
    		return true;
    	}
    	
    	else 
    	{
        return false;
        }
    	
    }

    public String getPostcode() {
        return postcode;
    }

    public String getAddress() {
        return address;
    }
    
    // You can add your own methods here
}
