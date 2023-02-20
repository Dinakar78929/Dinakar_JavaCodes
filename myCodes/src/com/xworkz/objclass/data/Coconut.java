package com.xworkz.objclass.data;

public class Coconut {
	private int price;
	private boolean big;
	private String size;
	private boolean water;
	
	public Coconut() {
		System.out.println("Coconut constructor with no parameter");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Price:"+price+"][isBig:"+big+"][size:"+size+"][isWater:"+water+"]";
	}
	public void setPrice(int price) 
	{
		this.price=price;
		System.out.println("Price:"+price);
	}
	public void isBig(boolean big)
	{
		this.big=big;
		System.out.println("Big:"+big);
	}
	public void setSize( String size) 
	{
		this.size=size;
		System.out.println("Size:"+size);
	}
	public void isWater(boolean water) 
	{
		this.water=water;
		System.out.println("water:"+water);
	}

}
