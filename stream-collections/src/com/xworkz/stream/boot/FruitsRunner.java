package com.xworkz.stream.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class FruitsRunner {

	public static void main(String[] args) {

		Collection<String> fruites = new ArrayList<String>();
		fruites.add("Apple");
		fruites.add("Banana");
		fruites.add("ButterFruit");
		fruites.add("DragonFruit");
		fruites.add("JackFruit");
		fruites.add("Mango");
		fruites.add("Orange");
		fruites.add("Apricot");
		fruites.add("Atemoya");
		fruites.add("Avocados");
		fruites.add("Blueberry");
		fruites.add("Blackcurrant");
		fruites.add("Ackee");
		fruites.add("Cranberry");
		fruites.add("Dates");
		fruites.add("Coconut");
		fruites.add("Grapefruit");
		fruites.add("Fig");
		fruites.add("HoneyBerry");
		fruites.add("Cherimoya");
		fruites.add("Hazelnut");
		fruites.add("Horned");
		fruites.add("Durian");
		fruites.add("gooseberry");
		fruites.add("Sappota");
		
		System.out.println("------------Printning all fruits in UpperCase--------");
		Collection<String> covertedFruites=new ArrayList<String>();
		for (String string : fruites) {
			covertedFruites.add(string.toUpperCase());
			
		}
		for (String string : covertedFruites) {
			System.out.println(string);
		}
		
//		System.out.println("------------Printning all fruits in UpperCase--------");
//		fruites.stream().map(ref -> ref.toUpperCase()).collect(Collectors.toList())
//				.forEach(element -> System.out.println(element));

		System.out.println("------------Printning all fruits less than size 5--------");
		fruites.stream().filter(ref -> ref.length() < 5).collect(Collectors.toList())
				.forEach(element -> System.out.println(element));
		
		System.out.println("------------Printning all fruits greater than size 5--------");
		fruites.stream().filter(ref -> ref.length() > 5).collect(Collectors.toList())
				.forEach(element -> System.out.println(element));
		
		System.out.println("------------Printning all fruits greater than size 10 And less than size 15--------");
		fruites.stream().filter(ref -> ref.length() > 10 && ref.length()<15).collect(Collectors.toList())
				.forEach(element -> System.out.println(element));
	}

}
