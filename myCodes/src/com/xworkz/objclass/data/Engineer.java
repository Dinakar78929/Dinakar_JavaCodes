package com.xworkz.objclass.data;

public class Engineer extends Person{
	
	public Engineer() {
		System.out.println("Engineer const with no-args");
	}	
	
	public Engineer(int id,String name) {
		super(id,name);
	}
	
	public Engineer(int id,String name,String email) {
		super(id,name,email);
	}
	public Engineer(int id,String name,int age,String email) {
		super(id,name,age,email);
	}
	@Override
	public String toString() {
		return "[id:"+id+"][Name:"+name+"][Age:"+age+"][Email:"+email+"]";
	}
	
		

}
