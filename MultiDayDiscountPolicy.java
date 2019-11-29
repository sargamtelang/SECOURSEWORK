package uk.ac.ed.bikerental;

import java.math.BigDecimal;
import java.util.Collection;

public class MultiDayDiscountPolicy implements PricingPolicy{
	
	BikeType bikeType;
	BigDecimal dailyPrice;
	
	
	
	@Override
	public void setDailyRentalPrice(BikeType bikeType, BigDecimal dailyPrice) 
	{
		this.bikeType = bikeType;
		this.dailyPrice = dailyPrice;
		
	}
	
	public void UpdatePolicy(BikeType bt, BigDecimal dp)
	{
		bikeType = bt;
		dailyPrice = dp;
		
	}
	
	public double BikeDiscount(DateRange duration)
	{
		long discountdays = duration.toDays();
		
		
		if( discountdays>=1 && discountdays<=2)
		{
			return dailyPrice.doubleValue();
		}
		else if(discountdays>=3 && discountdays<=6)
		{ 
			double discount = dailyPrice.doubleValue()*0.05;
			double discountPrice = dailyPrice.doubleValue() - discount;
			return discountPrice;
		}
		else if(discountdays>=7 && discountdays<=13)
		{
			double discount = dailyPrice.doubleValue()*0.1;
			double discountPrice = dailyPrice.doubleValue() - discount;
			return discountPrice;
		}
		else 
		{
			double discount = dailyPrice.doubleValue()*0.15;
			double discountPrice = dailyPrice.doubleValue() - discount;
			return discountPrice;
		}

	}

	@Override
	public BigDecimal calculatePrice(Collection<Bike> bikes, DateRange duration) {
		return null;
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		

		
		
	}
	
	
}
