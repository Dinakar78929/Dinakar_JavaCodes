package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class MobileNumber {

	public static void main(String[] args) {

		Collection<Long> mobileNos = new ArrayList<Long>();
		mobileNos.add(7892966782L);
		mobileNos.add(7022992456L);
		mobileNos.add(3456789075L);
		mobileNos.add(3243536474L);
		mobileNos.add(8748436464L);
		mobileNos.add(7892966782L);
		mobileNos.add(7892966782L);
		
		mobileNos.add(7892966782L);
		mobileNos.add(7022992456L);
		mobileNos.add(3456789075L);
		mobileNos.add(3243536474L);
		mobileNos.add(8748436464L);
		mobileNos.add(7892966782L);
		mobileNos.add(7892966782L);
		
		mobileNos.add(7892966782L);
		mobileNos.add(7022992456L);
		mobileNos.add(3456789075L);
		mobileNos.add(3243536474L);
		mobileNos.add(8748436464L);
		mobileNos.add(7892966782L);
		mobileNos.add(7892966782L);

		for (Long num : mobileNos) {
			System.out.println(num);
		}

		System.out.println("Total numbers are:" + mobileNos.size());
		
		long dinaNos=7892966782L;
		
		Collection<Long> set = new HashSet<Long>(mobileNos);
		System.out.println("-------After hashSet------");
		for (Long num1 : set) {
			System.out.println(num1);
		}
//		System.out.println(mobile);

		System.out.println("Total numbers are:" + set.size() + " occurance");
		
		
		
		for(Long mob:set)
		{
			int occurance=Collections.frequency(mobileNos, mob);
			System.out.println(mob+" "+occurance);
		}
		
		boolean contain=set.contains(dinaNos);
		System.out.println(contain);
		
		boolean remove=set.remove(dinaNos);
		System.out.println(remove);
		
		System.out.println("Total numbers are:" + set.size());
		
		
		
		
	}

}
