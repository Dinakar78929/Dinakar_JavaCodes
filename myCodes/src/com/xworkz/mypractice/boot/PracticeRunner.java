package com.xworkz.mypractice.boot;
import com.xworkz.mypractice.data.Practice1;


public class PracticeRunner {

	public static void main(String[] args) {
		
		Practice1 ref2=new Practice1();
		System.out.println("name: "+ref2.name);
		
		System.out.println("age: "+ref2.age);
		
		
		Practice1 ref3=new Practice1("dj tillu", 180);
		double high=ref3.getHeight();
		System.out.println("Height: "+high);

		Practice1 ref=new Practice1();
		ref.setName("raju");
		ref.setName();
	}

}
