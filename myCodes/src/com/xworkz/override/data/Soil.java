package com.xworkz.override.data;

public class Soil {
	
	public Soil()
	{
		System.out.println("Soil constructor with no parameter");
	}
	public void smell()
	{
		System.out.println("Soil has its own smell");
	}
	public String colour()
	{
		System.out.println("Soil has different colour");
		return null;
	}
}
