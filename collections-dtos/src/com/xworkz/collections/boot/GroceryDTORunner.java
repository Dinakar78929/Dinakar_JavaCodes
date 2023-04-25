package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.xworkz.collections.dto.GroceryDTO;

public class GroceryDTORunner {

	public static void main(String[] args) {
		
		List<GroceryDTO> groceries=new LinkedList<>();
		groceries.add(new GroceryDTO(1,"Oil",90.5, 5));
		groceries.add(new GroceryDTO(2, "Wheet", 34, 4));
		groceries.add(new GroceryDTO(3,"peas", 30, 10));
		groceries.add(new GroceryDTO(4,"Masala Powder", 10, 20));
		groceries.add(new GroceryDTO(5, "Chinnamon",50 , 1));
		groceries.add(new GroceryDTO(6, "Wheet", 34, 4));
		
		groceries.forEach(e->System.out.println(e));
		
		System.out.println("---------------------------------------------");
		groceries.forEach(System.out::println);
		System.out.println("-----------sorting----------------");
		
		groceries.stream().sorted((arg1,arg2)->arg1.getName().compareTo(arg2.getName())).forEach(System.out::println);
		//groceries.stream().sorted((arg1,arg2)->arg1.getName().compareToIgnoreCase(arg2.getName())).forEach(System.out::println);
//		groceries.sort(GroceryDTO::compareTo);
//		
//		groceries.forEach(System.out::println);
//		List<Integer> numbers=new ArrayList<Integer>();
//		numbers.add(1);
//		numbers.add(20);
//		numbers.add(5);
//		numbers.add(15);
//		
//		//numbers.forEach(System.out::println);
//		
//		System.out.println("---------------------------------");
//		numbers.sort((agr1,ar2)->arg2.);
//		numbers.sort(Integer::compareTo);
//		
//		numbers.forEach(System.out::println);
		System.out.println("------------------------------------");
		
		List<GroceryDTO> newGroceries=new ArrayList<>(groceries);
		
		groceries.stream().collect(Collectors.toList()).forEach(element->System.out.println(element));
		
		newGroceries.add(new GroceryDTO(7,"jam", 15, 0));
		
		System.out.println("---------------------");
		newGroceries.forEach(e->System.out.println(e));
		
		
		newGroceries.set(0,new GroceryDTO(10,"BUN", 100, 55));
		
		System.out.println("---------------------");
		newGroceries.forEach(e->System.out.println(e));
		
		System.out.println("----------------------");
		
		newGroceries.remove(0);
		newGroceries.forEach(e->System.out.println(e));
		
		System.out.println("----------------------");
		
		newGroceries.addAll(1, groceries);
		newGroceries.forEach(e->System.out.println(e));
		
		System.out.println("----Iterator reverse---");
		
		
		
		
		
		
	}

}
