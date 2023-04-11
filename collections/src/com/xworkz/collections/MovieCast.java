package com.xworkz.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

public class MovieCast {
	public static void main(String[] args) {
		Collection<String> casts=new LinkedList<String>();
		casts.add("Kamal hassan");
		casts.add("VJS");
		casts.add("Surya");
		casts.add("Arjun das");
		casts.add("Karthi");
		casts.add("Lokesh");
		casts.add("Fiaz");
		casts.add("jack");
		casts.add("anbarivu");
		casts.add("jhony");
		casts.add(null);
		casts.add(null);
		casts.add(null);
		
		
		
		for(String cast:casts)
		{
			if(Objects.nonNull(casts))
			{
				System.out.println(cast);
			}
		}
		System.out.println("Total size:"+casts.size());
		
		Iterator<String> itr=casts.iterator();
		System.out.println("------after iterator-----");
		while(itr.hasNext())
		{
			if(Objects.nonNull(itr))
			{
				String ref=itr.next();
				{
					if(Objects.isNull(ref))
					{
						itr.remove();
					}
				}
			}
		}
		System.out.println(casts);
		System.out.println("Total size:"+casts.size());
	}

}
