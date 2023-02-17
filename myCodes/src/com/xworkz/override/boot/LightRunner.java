package com.xworkz.override.boot;
import com.xworkz.override.data.TubeLight;
import com.xworkz.override.data.Light;

public class LightRunner {
	public static void main(String args[])
	{
		Light current=new TubeLight();
		int watt=current.glow();
		System.out.println("number of watts in light:"+watt);
		current.glow();
		current.produceHeat();
		
	}
}
