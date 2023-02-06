package com.xworkz.constructor.boot;
import com.xworkz.constructor.data.Xworkz;
import com.xworkz.constructor.data.Trainee;

public class XworkzRunner {
	public static void main(String args[]) {
		Xworkz xworkz = new Xworkz("Xworkz","OM","Bengaluru",2018,90,3,"java",28000,"java");
		xworkz.showXworkz();
		Trainee trainee=new Trainee(3,"om",true);
		trainee.showTrainer();
		 
		
	}

}
