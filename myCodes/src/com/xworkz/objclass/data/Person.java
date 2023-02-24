package com.xworkz.objclass.data;

public class Person {
	protected int id;
	protected String name;
	protected int age;
	protected String email;
	protected String specialist;
	protected String hospitalName;
	
	public Person() 
	{
		System.out.println("person const with no-args");
	}
	
	public Person(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public Person(int id,String name,String email)
	{
		this(id,name);
		this.email=email;
	}
	public Person(int id,String name,int age,String email)
	{
		this(id,name,email);
		this.age=age;
	}
	
	
	@Override
	public int hashCode() {
		
		return 12345;
	}
	@Override
	public boolean equals(Object obj) {
	System.out.println("Running Engineering object"+obj);
	
	if(obj!=null)
	{
		System.out.println("Object is not null");
		if(obj instanceof Person)
		{
			System.out.println("Object is a type person,can comapre");
			Person casted=(Person)obj;
			Person eng1=this;
			Person eng2=casted;
			
			if(eng1.id==(eng2.id) &&eng1.name.equals(eng2.name)&& eng1.age==(eng2.age) 
					&&eng1.specialist.equals(eng2.specialist)&& eng1.hospitalName.equals(eng2.hospitalName) )
			{
				System.out.println("person1 and person1 are same");
				return true;
			}
			else
			{
				System.out.println("person1 and person2 are different");
			}
		}
		else
		{
			System.out.println("Object is  naot a type person,can comapre");
		}
	}
	else
	{
		System.out.println("Object is null");
	}
	return super.equals(obj);
	}
}

