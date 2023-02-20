package com.xworkz.objclass.boot;
import com.xworkz.objclass.data.Door;

public class DoorRunner {

	public static void main(String[] args) {
		Object door=new Object();
		System.out.println(door);
		
		Object door1=new Door();
		System.out.println(door1);
		
		Door door2=new Door();
		door2.setwood(null);
		door2.setPrice(2000);
		door2.setLength(15.5D);
		door2.setWidth(5D);
		System.out.println(door2);
		
		Door door3=new Door();
		door3.setwood("beete mara");
		door3.setPrice(4000);
		door3.setLength(10.5D);
		door3.setWidth(6D);
		System.out.println(door3);
		
		System.out.println(door2.equals(door3));
		
	

	}

}
