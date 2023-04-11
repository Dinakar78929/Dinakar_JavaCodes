package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;


public class Whisky {

	public static void main(String[] args) {
		Collection<String> whiskys=new LinkedList<String>();
		whiskys.add("JD");
		whiskys.add("Royal stag");
		whiskys.add("MC");
		whiskys.add("JB");
		whiskys.add("Red Label");
		whiskys.add("Teachers");
		whiskys.add(null);
		whiskys.add("Black and white");
		whiskys.add("IB");
		whiskys.add("Black Dog");
		whiskys.add(null);
		
		for(String whisky:whiskys)
		{
			if(Objects.nonNull(whiskys))
				System.out.println(whisky);
		}
		System.out.println("Total size:"+whiskys.size());
		
		Iterator<String> itr=whiskys.iterator();
		System.out.println("---------After iterator--------");
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
		System.out.println(whiskys);
		System.out.println("Total size:"+whiskys.size());
		
	}
}
		