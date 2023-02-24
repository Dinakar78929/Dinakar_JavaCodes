package com.xworkz.objclass.boot;
import com.xworkz.objclass.data.Engineer;
import com.xworkz.objclass.data.Doctor;


public class EngineerRunner {

	public static void main(String[] args) {
		
		Object eng=new Engineer();
		System.out.println(eng);
		
		Engineer eng1=new Engineer(101, "Sumith",55,"sumith@gmail.com");
		
		Engineer eng2=new Engineer(102, "Basvaraj",44,"basu@gmail.com");
		
		Engineer eng4=new Engineer(102,"Krishna");
		
		
		
		
		
		System.out.println("1");
		boolean equal=eng1.equals(eng2);
		System.out.println(equal);
		System.out.println("hashcode="+eng1.hashCode()+"Original hashCode"+  System.identityHashCode(eng1));
		
		Engineer eng3=new Engineer(101, "Sumith",55,"sumith@gmail.com");
		System.out.println("2");
		boolean equal2=eng1.equals(eng3);
		System.out.println(equal2);
		
		System.out.println("3");
		boolean equal3=eng1.equals(eng4);
		System.out.println(equal3);
		
		Doctor doc1=new Doctor("eye specialist", "Kaashi");
		Doctor doc2=new Doctor("eye specialist", "Kaashi");
		Doctor doc3=new Doctor("skin specialist", "Shashris");
		
		System.out.println("4");
		boolean equal4=doc1.equals(doc3);
		System.out.println(equal4);
		System.out.println("hashcode="+doc1.hashCode()+" "+"Original hashCode"+  System.identityHashCode(doc1));
		
		
		
		

	}

}
