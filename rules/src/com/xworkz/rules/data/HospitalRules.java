package com.xworkz.rules.data;

import com.xworkz.rules.interfaces.Hospital;

public class HospitalRules implements Hospital{
	
	public HospitalRules()
	{
		System.out.println("no-args constructor");
	}
	@Override
	public int visitorsLimit() {
		System.out.println("Running visitorsLimit");
		return 2;
	}

	@Override
	public boolean noSmoking() {
		System.out.println("Running noSmoking method");
		return true;
	}

	@Override
	public double visitingHours() {
		System.out.println("Running visitingHours method");
		return 2;
	}

	@Override
	public boolean noWeapon() {
		System.out.println("Running noWeapon method");
		return true;
	}

	@Override
	public boolean noiceRestriction() {
		System.out.println("Running noiceRestriction method");
		return true;
	}

	@Override
	public double openTime() {
		System.out.println("Running openTime method");
		return 6.30;
	}

	@Override
	public double closeTime() {
		System.out.println("Running closeTime method");
		return 10.00;
	}

	@Override
	public int noOfDayOpen() {
		System.out.println("Running noOfDayOpen method");
		return 7;
	}

	@Override
	public boolean maintainData() {
		System.out.println("Running maintainData method");
		return true;
	}
	
	

}
