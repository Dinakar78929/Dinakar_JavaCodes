package com.xworkz.associaion2.data;

public class Scientist {
	public String name;
	public String designation;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setDesignation(String designation)
	{
		this.designation=designation;
	}
	
	public void show()

		{
			System.out.println("Scientist name:"+name);
			System.out.println("Scientist name:"+designation);
		}
}
