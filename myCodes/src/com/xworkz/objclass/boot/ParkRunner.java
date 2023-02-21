package com.xworkz.objclass.boot;

import com.xworkz.objclass.data.Alcohol;
import com.xworkz.objclass.data.Park;

public class ParkRunner {

	public static void main(String[] args) {
		Object park=new Park();
		System.out.println(park);
		
		Park park1=new Park("Gandhi_Park", "Shivamogga", 1000, 2010, 300, 20);
		
		Park park2=new Park("Cubban_Park", "Bengaluru", 10000, 2000, 3000, 0);
		
		System.out.println("1");
		boolean equal=park1.equals(park2);
		System.out.println("park1 and park2 are same:"+equal);
		
		Park park3=new Park("Cubban_Park", "Bengaluru", 10000, 2000, 3000, 0);
		System.out.println("2");
		boolean equal2=park2.equals(park3);
		System.out.println("park1 and park2 are same:"+equal2);
		
		Alcohol alcohol2 = new Alcohol("Kingfisher", 8, 180, "Beer");
		System.out.println("3");
		boolean equal3=park2.equals(alcohol2);
		System.out.println("park1 and park2 are same:"+equal3);
		
		System.out.println("4");
		boolean equal4=park2.equals(null);
		System.out.println("park1 and park2 are same:"+equal4);
		
		
	}

}
