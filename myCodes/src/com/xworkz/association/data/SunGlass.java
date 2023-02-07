package com.xworkz.association.data;

public class SunGlass {
	public String name;
	public int price;
	public String shape;
	public Frame frame;
	
	public SunGlass()
	{
		
	}

	public SunGlass(String name, int price, String shape) {
		this.name = name;
		this.price = price;
		this.shape = shape;
	}
	public void init(String name, int price, String shape) {
		this.name = name;
		this.price = price;
		this.shape = shape;
	}
	public void init(Frame frame)
	{
		this.frame=frame;
	}
	public void show()
	{
		System.out.println("SunGlass details are:");
		System.out.println("SunGlass name:"+name);
		System.out.println("price:"+price);
		System.out.println("shape:"+shape);
		if(this.frame!=null) {
			this.frame.showFrame();
	}
	else
	{
		System.err.println("this.frame is not pointing to frame");
		
	}

	

}

}
