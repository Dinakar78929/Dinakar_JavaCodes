package com.xworkz.override.data;

public class RedSoil extends Soil {
	public RedSoil()
	{
		System.out.println("Soil constructor with no parameter");
	}
	public String colour()
	{
		System.out.println("soil colour is red");
		return "red";
	}


}
