package com.xworkz.rules.boot;


import com.xworkz.rules.interfaces.Hospital;

public class HospitalRulesRunner {

	public static void main(String[] args) {	
		
		Hospital obj=new Hospital() {

			@Override
			public int visitorsLimit() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean noSmoking() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public double visitingHours() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean noWeapon() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean noiceRestriction() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public double openTime() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public double closeTime() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int noOfDayOpen() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean maintainData() {
				// TODO Auto-generated method stub
				return false;
			}
			
			
			
			
		
		

}
}
