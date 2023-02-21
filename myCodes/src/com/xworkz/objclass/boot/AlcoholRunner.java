package com.xworkz.objclass.boot;

import com.xworkz.objclass.data.Alcohol;
import com.xworkz.objclass.data.WaterFall;

public class AlcoholRunner {

	public static void main(String[] args) {
		Object alcohol = new Alcohol();
		System.out.println(alcohol);

		Alcohol alcohol2 = new Alcohol("Kingfisher", 8, 180, "Beer");
		Alcohol alcohol3 = new Alcohol("MC Dowels", 8, 180, "whisky");

		boolean equal = alcohol3.equals(alcohol2);
		System.out.println("alocohol1 and alcohol2 are same:" + equal);

		Alcohol alcohol4 = new Alcohol("MC Dowels", 8, 180, "whisky");
		boolean equal1 = alcohol3.equals(alcohol4);
		System.out.println("alocohol1 and alcohol2 are same:" + equal1);

		WaterFall water2 = new WaterFall("Joga", 600, "Sagara");
		boolean equal3 = alcohol2.equals(water2);
		System.out.println("alocohol1 and water2 are same:" + equal3);
		
		boolean equal2 = alcohol3.equals(null);
		
		
		
		

	}

}
