package com.xworkz.mypractice.data;

public  class Practice1 {
	
	public String name;
	private double height;
	public final int age=21;
	
	public Practice1() {
		this.name="dj Tillu";
		//this.age=67;
		System.out.println("no args constructor");
	}
	
	public Practice1(String name,double height)
	{
		this.name=name;
		this.height=height;
		
		System.out.println("name:"+name);
	}
	public void setHeight(double height)
	{
		this.height=height;
	}
	public  final void setName()
	{
		System.out.println("no argument method");
	}
	public final void setName(String name)
	{
		this.name=name;
		System.out.println(name);
	}
	public double getHeight() 
	{
		return 180d;
	}

	

}
