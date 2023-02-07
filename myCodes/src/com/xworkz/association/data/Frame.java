package com.xworkz.association.data;

public class Frame {
	public String  shape;
	public String colour;
	public int price;
	
	public Frame()
	{
		
	}

	public Frame(String shape, String colour, int price) {
		this.shape = shape;
		this.colour = colour;
		this.price = price;
	}



	public void showFrame()
	{
		System.out.println("frame shape:"+shape);
		System.out.println("colour:"+colour);
		System.out.println("price:"+price);
		

}

}
