package com.xworkz.override.boot;
import com.xworkz.override.data.Soil;
import com.xworkz.override.data.RedSoil;

public class SoilRunner {

	public static void main(String[] args) {
		Soil soil=new RedSoil();
		soil.colour();
		String clr=soil.colour();
		System.out.println("returned colour is:"+clr);
		soil.colour();
		soil.colour();
		soil.smell();
		
		
	}

}
