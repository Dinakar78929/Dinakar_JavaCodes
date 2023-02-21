package com.xworkz.objclass.boot;
import com.xworkz.objclass.data.FootWare;
import com.xworkz.objclass.data.Fridge;

public class FidgeRunner {

	public static void main(String[] args) {
		Object fridge=new Fridge();
		System.out.println(fridge);
		
		Fridge fridge1=new Fridge("whirlpool", 4567, "Blue", "Fibre plastic", "push and pull", "10C", "-10C", 1,5, true);
		
		Fridge fridge2=new Fridge("Gorej", 4444, "Red", "Fibre plastic", "push and pull", "10C", "-10C", 2,10, false);
		

		System.out.println("1");
		boolean equal=fridge1.equals(fridge2);
		System.out.println("fridge1 and fridge2 are same:"+equal);
		
		Fridge fridge3=new Fridge("Gorej", 4444, "Red", "Fibre plastic", "push and pull", "10C", "-10C", 2,10, false);
		System.out.println("2");
		boolean equal2=fridge2.equals(fridge3);
		System.out.println("fridge1 and fridge2 are same:"+equal2);
		
		FootWare foot2=new FootWare("Pama", 300, "Slipper");
		System.out.println("3");
		boolean equal3=fridge2.equals(foot2);
		System.out.println("fridge1 and fridge2 are same:"+equal3);
		
		System.out.println("4");
		boolean equal4=fridge2.equals(null);
		System.out.println("fridge1 and fridge2 are same:"+equal4);
		
		
	}

}
