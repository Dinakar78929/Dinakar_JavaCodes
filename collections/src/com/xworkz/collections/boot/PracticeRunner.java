package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PracticeRunner {

	public static void main(String[] args) {
	
		List<String> names=new ArrayList<>();
		
		names.add("Dinakar");
		names.add("Abhi");
		names.add("Bhanu");
		names.add("Zahir");
		names.add("Khan");
		
		names.forEach(System.out::println);
		System.out.println("--------------------");
		names.sort(String::compareTo);
		//names.forEach(System.out::println);
		  names.forEach(e->System.out.println(e));

	}

}
