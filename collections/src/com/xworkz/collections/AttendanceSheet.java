package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class AttendanceSheet {

	public static void main(String[] args) {
		Collection<String> collections= new ArrayList<String>();
		collections.add("Jayanth");
		collections.add("Basavaraj");
		collections.add("Darshan");
		collections.add("Rocky");
		collections.add(null);
		collections.add("Kavana");
		collections.add("Lokesh");
		collections.add("Kishor");
		collections.add("Jhon");
		collections.add("james");
		collections.add("Annesh");
		collections.add("Shivu");
	

		for (String name : collections) {
			if (Objects.nonNull(name))
				System.out.println(name);
		}

		System.out.println("Total size:" + collections.size());

		Iterator<String> i = collections.iterator();
		System.out.println("---------After Iterator----------");
		while (i.hasNext()) {
			String ref = i.next();
			if(Objects.isNull(ref))
			{
				i.remove();
			}
			
		}
		System.out.println(collections);
		System.out.println("Total size:"+collections.size());

	}

}
