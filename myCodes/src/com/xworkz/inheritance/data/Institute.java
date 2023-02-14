package com.xworkz.inheritance.data;

public class Institute {
	public Institute()
	{
		System.out.println("cunstructor with no argument");
	}
	public Institute(String name)
	{
		System.out.println("name of institute:"+name);
	}
	public Institute(String name,String address)
	{
		System.out.println("name of institute:"+name);
		System.out.println("address:"+address);
	}
	public Institute(String name,String address,String course)
	{
		System.out.println("name of institute:"+name);
		System.out.println("address:"+address);
		System.out.println("course:"+course);
	}
	public Institute(String name,String address,String course,String owner)
	{
		System.out.println("name of institute:"+name);
		System.out.println("address:"+address);
		System.out.println("course:"+course);
		System.out.println("owner:"+owner);
	}
}
