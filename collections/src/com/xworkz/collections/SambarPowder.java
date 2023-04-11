package com.xworkz.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

public class SambarPowder {

	public static void main(String[] args) {
		Collection<String> powders=new LinkedList<String>();
		powders.add("MTR");
		powders.add("RGB");
		powders.add("Iyengar");
		powders.add("Achi");
		powders.add(null);
		powders.add("Shivam");
		powders.add("MDH");
		powders.add("Catch");
		
		System.out.println(powders);
		System.out.println("Total size:"+powders.size());
		
		for(String powder:powders)
		{
			if(Objects.nonNull(powders))
			{
				System.out.println(powder);
			}
		}
		System.out.println(powders.size());
		
		Iterator<String> itr=powders.iterator();
		System.out.println("--------After iterator-------");
		while(itr.hasNext())
		{
			if(Objects.nonNull(itr))
			{
				String ref=itr.next();
				if(Objects.isNull(ref))
				{
					itr.remove();
				}
			}
		}
		System.out.println(powders);
		System.out.println("Total size:"+powders.size());

	}

}
