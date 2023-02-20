package com.xworkz.objclass.data;

public class Door {
	private String wood;
	private int price;
	private double length;
	private double width;
	
	public Door() {
		System.out.println("Door constructor with no parameter");
	}
	public String toString() {
		return "[Name:"+wood+"][Price:"+price+"][length:"+length+"][width:"+width+"]";
	}	
	
	public void setwood(String wood) 
	{
		this.wood=wood;
		System.out.println("Name:"+wood);
	}
	public void setPrice(int price) 
	{
		this.price=price;
		System.out.println("Price:"+price);
	}
	public void setLength(double length) 
	{
		this.length=length;
		System.out.println("Length:"+length);
	}
	public void setWidth(double width) 
	{
		this.width=width;
		System.out.println("width:"+width);
	}

}
