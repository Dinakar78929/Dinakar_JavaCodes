package com.xworkz.objclass.boot;
import com.xworkz.objclass.data.WaterFall;
import com.xworkz.objclass.data.Tv;

public class WaterFallRunner {
   public static void main(String[] args) {
	   Object water=new WaterFall();
	   System.out.println(water);
	   
	   WaterFall water2=new WaterFall("Joga",600,"Sagara");
	   
	   WaterFall water3=new WaterFall("Hebbe",200,"Chickmagalur");
	   
	   System.out.println("1");
	   boolean equal=water2.equals(water3);
	   System.out.println("water2 and water3 are same:"+equal);
	   
	   System.out.println("2");
	   boolean equal2=water2.equals(water2);
	   System.out.println("water2 and water3 are same:"+equal2);
	   
	   WaterFall water4=new WaterFall("Joga",600,"Sagara");
	   
	   System.out.println("3");
	   boolean equal3=water2.equals(water4);
	   System.out.println("water2 and water3 are same:"+equal3);
	   
		Tv tv1 = new Tv("sony", 40000, 120.5);
	 
		System.out.println("4");
	   boolean equal4=water2.equals(tv1);
		System.out.println("foot1 and foot2 are same:"+equal4);
		
		System.out.println("5");
		boolean equal5=water2.equals(null);
		System.out.println("foot1 and foot2 are same:"+equal5);
	   
	   
	   
	   
	   
	   
	
}

}
