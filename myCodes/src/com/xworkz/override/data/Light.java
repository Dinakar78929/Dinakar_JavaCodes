package com.xworkz.override.data;

public class Light {
	public Light()
	{
		System.out.println("Light constructor with no parameter");
	}
	public int glow()
	{
		System.out.println("Light can Bright depends on its watts");
		return 10;
	}
	public void produceHeat() 
	{
		System.out.println("Light can produce heat");
	}
	}
