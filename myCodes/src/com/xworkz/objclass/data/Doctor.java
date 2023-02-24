package com.xworkz.objclass.data;

public class Doctor extends Person{
	
	
	public Doctor() {
		System.out.println("Person const with no-args");
	}
	
	public Doctor(int id,String name,int age,String email,String specialist,String hospitalName) {
		super(id,name,age,email);
		this.specialist=specialist;
		this.hospitalName=hospitalName;
	}
	@Override
	public int hashCode() {
		
		return 98765;
	}
	
	@Override
	public String toString() {
		return "[id:"+id+"][Name:"+name+"][Age:"+age+"][Email:"+email+"][Specialist:"+specialist+"][Hospital Name:"+hospitalName+"]";
	}

}

