package com.xworkz.association.data;

public class CoolDrinks {
	public String brand;
	public  int price;
	public String ambasetor;
	
	public CoolDrinks()
	{
		
	}

	public CoolDrinks(String brand, int price, String ambasetor) {
		this.brand = brand;
		this.price = price;
		this.ambasetor = ambasetor;
	}
	
	
	public void showCool() {
		System.out.println();
		System.out.println("CollDrink brand :"+brand);
		System.out.println("price:"+price);
		System.out.println("ambasetor:"+ambasetor);
		
	}
	
	

}
