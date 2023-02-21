package com.xworkz.objclass.boot;

import com.xworkz.objclass.data.Cake;

import com.xworkz.objclass.data.Tv;

public class CakeRunner {

	public static void main(String[] args) {
		Object cake = new Cake();
		System.out.println(cake);

		Cake cake1 = new Cake("Venilla", "1kg", "Round", 210);

		Cake cake2 = new Cake("Chacolate", "2kg", "Heart", 500);
		
		
		System.out.println("1");

		boolean equal = cake1.equals(cake2);
		System.out.println("cake1 and cake2 are same:" + equal);

		Cake cake3 = new Cake("Venilla", "1kg", "Round", 210);
		
		System.out.println("2");
		boolean equal2 = cake3.equals(cake1);
		System.out.println("cake1 and cake2 are same:" + equal2);
		
		System.out.println("3");
		boolean equal3 = cake3.equals(null);
		System.out.println("cake1 and cake2 are same:" + equal3);

		Tv tv1 = new Tv("sony", 40000, 120.5);
		
		System.out.println("4");
		boolean equal4 = cake3.equals(tv1);
		System.out.println("cake1 and cake2 are same:" + equal4);

	}

}
