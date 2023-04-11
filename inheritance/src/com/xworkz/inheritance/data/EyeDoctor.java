package com.xworkz.inheritance.data;

public class EyeDoctor extends Doctor{
	
	public String name;
	public int reg;
	public String course;

	public EyeDoctor(String name,int reg,String course) {
		super(name,reg);
		this.course = course;
	}
	
	
	
	
//	public int hashCode() {
//		System.out.println("returnning hascode");
//		return 2334553;
//	}

}
