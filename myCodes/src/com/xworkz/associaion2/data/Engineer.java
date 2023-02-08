package com.xworkz.associaion2.data;

public class Engineer {
	public String name;
	public double salary;
	public String[] skills;
	public Degree[] degrees;
	
	public Engineer()
	{
		
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	
	public  void setSkills(String[] skills) {
		this.skills = skills;
	}
	public void setDegree(Degree[] degrees) {
		this.degrees=degrees;
	}
	public void display()
	{
		System.out.println("Engineer name:"+this.name);
		System.out.println("Engineer salary:"+this.salary);
			if(this.skills!=null) {
			for(int seq=0;seq<this.skills.length;seq++) {
				String element=this.skills[seq];
				System.out.println("skills:"+element+" at index "+seq);
			}
		}
		else {
			System.err.println("this.skills is null");
		}
			

		if(this.degrees!=null) {
			for(int seq=0;seq<this.degrees.length;seq++) {
				Degree element=this.degrees[seq];
				System.out.println("Degree at index:"+seq);
				element.show();
			}
		}
		else {
			System.err.println("this.degree is null");
		}
		System.out.println("------------");
		
}
}
