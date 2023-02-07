package com.xworkz.association.data;

public class Fridge {
	public float height;
	public int warranty;
	public String capacity;
	public boolean working;
	public float temp;
	public CoolDrinks coolDrinks;
	
	public Fridge() {
		
	}

	public Fridge(float height, int warranty, String capacity, boolean working, float temp) {
		this.height = height;
		this.warranty = warranty;
		this.capacity = capacity;
		this.working = working;
		this.temp = temp;
	}
	public void init(float height, int warranty, String capacity, boolean working, float temp) {
		this.height = height;
		this.warranty = warranty;
		this.capacity = capacity;
		this.working = working;
		this.temp = temp;
	}
	public void init(CoolDrinks coolDrinks)
	{
		this.coolDrinks=coolDrinks;
	}
	public void show()
	{
		System.out.println("Fridge details are:");
		System.out.println("height of fridge:"+height);
		System.out.println("warranty:"+warranty);
		System.out.println("capacity"+capacity);
		System.out.println("working:"+working);
		System.out.println("current temperature"+temp);
		if(this.coolDrinks!=null) {
			this.coolDrinks.showCool();
	}
	else
	{
		System.err.println("this.coolDrinks is not pointing to cooldrinks");
		
	}
	
	

}
}
