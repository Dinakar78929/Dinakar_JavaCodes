package com.xworkz.objclass.data;

public class Gold {
	private String name;
	private int price;
	private double grams;
	private boolean original;
	
	public Gold() {
		System.out.println("Gold constructor with no parameter");
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "[Name:"+name+"][Price:"+price+"][Grams:"+grams+"][is Original:"+original+"]";
		}	
		
		public void setName(String name) 
		{
			this.name=name;
			System.out.println("Name:"+name);
		}
		public void setPrice(int price) 
		{
			this.price=price;
			System.out.println("Price:"+price);
		}
		public void setGrams(double grams) 
		{
			this.grams=grams;
			System.out.println("Grams:"+grams);
		}
		public void isOriginal(boolean original) 
		{
			this.original=original;
			System.out.println("is Original:"+original);
		}
}
