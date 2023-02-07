package com.xworkz.association.data;

public class Sun {
	public String  shape;
	public String colour;
	public long distance;
	
	public Sun()
	{
		
	}

	public Sun(String shape, String colour, long distance) {
		this.shape = shape;
		this.colour = colour;
		this.distance = distance;
	}



	public void showSun()
	{
		System.out.println("Sun shape:"+shape);
		System.out.println("colour:"+colour);
		System.out.println("distance:"+distance);
		

}
}
