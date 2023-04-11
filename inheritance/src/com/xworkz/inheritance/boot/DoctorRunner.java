package com.xworkz.inheritance.boot;
import com.xworkz.inheritance.data.Doctor;
import com.xworkz.inheritance.data.EyeDoctor;
//import com.xworkz.inheritance.data.EyeDoctor;

public class DoctorRunner {

	public static void main(String[] args) {
		
		Doctor doc= new Doctor("Shivu",67);
		String nm=doc.name;
		System.out.println(nm);
		
		EyeDoctor doc1=new EyeDoctor(nm, 55, nm);
	
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		Doctor doc1= new Doctor(nm, 123);
//		int val=doc1.reg;
//		System.out.println(val);
//		
//		Doctor doc2= new Doctor(nm, 123,"BCA");
//		String cr=doc2.course;
//		System.out.println(cr);
		
		
		
		
		

}
}
