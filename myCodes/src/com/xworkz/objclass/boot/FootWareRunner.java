package com.xworkz.objclass.boot;
import com.xworkz.objclass.data.FootWare;
import com.xworkz.objclass.data.Tv;

public class FootWareRunner {

	public static void main(String[] args) {
		Object foot=new FootWare();
		System.out.println(foot);
		
		FootWare foot1=new FootWare("Pama", 300, "Slipper");
		
		FootWare foot2=new FootWare("Pama", 300, "Slipper");
		
		
		System.out.println("1");
		boolean equal=foot1.equals(foot2);
		System.out.println("foot1 and foot2 are same:"+equal);
		
		Tv tv1 = new Tv("sony", 40000, 120.5);

		System.out.println("2");
		boolean equal2=foot1.equals(tv1);
		System.out.println("foot1 and foot2 are same:"+equal2);
		
		System.out.println("3");
		boolean equal3=foot1.equals(null);
		System.out.println("foot1 and foot2 are same:"+equal3);
		
		System.out.println("4");
		boolean equal4=foot1.equals(foot2);
		System.out.println("foot1 and foot2 are same:"+equal4);
		
		
		
		
		
	}

}
