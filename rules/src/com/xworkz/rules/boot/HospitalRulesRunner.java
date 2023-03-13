package com.xworkz.rules.boot;

import com.xworkz.rules.data.HospitalRules;
import com.xworkz.rules.interfaces.Hospital;

public class HospitalRulesRunner {

	public static void main(String[] args) {	
		
		Hospital hospital=new HospitalRules();
		
		HospitalRules  hospital2=new HospitalRules();
		hospital2.closeTime();
		hospital2.noSmoking();
		hospital2.noOfDayOpen();
		hospital2.maintainData();
		hospital2.noWeapon();
		hospital2.visitingHours();
		hospital2.visitorsLimit();
		hospital2.openTime();
		hospital2.noiceRestriction();
		hospital2.equals(hospital);
		hospital2.hashCode();
		hospital2.getClass();
		hospital2.notify();
		hospital2.notifyAll();
		hospital2.toString();
		//hospital2.wait();
		//hospital2.wait(2345678654);
		//hospital2.wait(456, 5678);
		
		
		

	}

}
