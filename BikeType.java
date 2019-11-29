package uk.ac.ed.bikerental;

import java.math.BigDecimal;
import java.util.Objects;

public class BikeType {
	
	int BikeID;
	BigDecimal RentalPrice;
	Boolean BikeStatus;
	BigDecimal ReplacementValue;
	
	public int getBikeID() {
		return BikeID;
	}



	public void setBikeID(int bikeID) {
		BikeID = bikeID;
	}



	public BigDecimal getRentalPrice() {
		return RentalPrice;
	}



	public void setRentalPrice(BigDecimal rentalPrice) {
		RentalPrice = rentalPrice;
	}



	public Boolean getBikeStatus() {
		
		
		return BikeStatus;
	}



	public void setBikeStatus(Boolean bikeStatus) {
		BikeStatus = bikeStatus;
		
		
		
	}



	public BigDecimal getDepositRate() {
		return DepositRate;
	}



	public void setDepositRate(BigDecimal depositRate) {
		DepositRate = depositRate;
	}



	public void setReplacementValue(BigDecimal replacementValue) {
		ReplacementValue = replacementValue;
	}



	BigDecimal DepositRate;
	
	BikeType bt = new BikeType();
	
	
	
   
	public BigDecimal getReplacementValue() {
        // TODO: Implement Bike.getReplacementValue
        assert false;
        return null;
    }
}