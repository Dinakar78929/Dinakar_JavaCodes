package com.xworkz.override.data;

public class TubeLight extends Light {
	public TubeLight()
	{
		System.out.println("TubeLight constructor with no parameter");
	}
	
	public int glow()
	{
		System.out.println("Light can Bright depends on its watts");
		return 9;
	}

}
