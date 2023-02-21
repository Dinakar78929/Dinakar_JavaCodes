package com.xworkz.objclass.boot;
import com.xworkz.objclass.data.FootWare;
import com.xworkz.objclass.data.Tv;

public class TvRunner {

	public static void main(String[] args) {
		Object tv=new Tv();
		System.out.println(tv);
		
		Tv tv1=new Tv("sony", 40000, 120.5);
				
		Tv tv2=new Tv("Redmi", 35000, 14.5);
		System.out.println("1");
		boolean equal=tv2.equals(tv1);
		System.out.println("tv1 and tv2 is same:"+equal);
		
		Tv tv3=new Tv("Redmi", 35000, 14.5);
		System.out.println("2");
		boolean equal1=tv2.equals(tv3);
		System.out.println("tv2 and tv3 is same:"+equal1);
		
		FootWare foot2=new FootWare("Pama", 300, "Slipper");
		System.out.println("3");
		boolean equal2=tv2.equals(foot2);
		System.out.println("tv2 and tv3 is same:"+equal2);
		
		System.out.println("4");
		boolean equal3=tv2.equals(null);
		System.out.println("tv2 and tv3 is same:"+equal3);
		
	
		
		
		}

}
