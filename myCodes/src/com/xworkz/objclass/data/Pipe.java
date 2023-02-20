package com.xworkz.objclass.data;

public class Pipe extends Object {
	private String name;
	private double length;
	private double diameter;
	private int price;
	
	public Pipe() {
		System.out.println(" Pipe constructor with no argument");
	}
	
	@Override
	public String toString() {
		return  "[Name:"+"pilips"+"][Length:"+10+"][Diameter:"+4+"][Price:"+150+"]";
	}
	public void setName(String name) 
	{
		this.name=name;
		System.out.println("Pipe name is:"+name);
	}
	public void setLength( double length) 
	{
		this.length=length;
		System.out.println("Pipe length is:"+length);
	}
	public void setDiameter(double diameter) 
	{
		this.diameter=diameter;
		System.out.println("Pipe diameter is:"+diameter);
	}	
	public void setPrice(int price) 
	{
		this.price=price;
		System.out.println("Pipe price is:"+price);
	}
	public int hashCode()
	{
		return 5678;
	}
	
	
}
