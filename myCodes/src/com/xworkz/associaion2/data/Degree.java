package com.xworkz.associaion2.data;

public class Degree {
	public String name;
	public int duration;
	public boolean pursuing;
	public double percentage;
	public String branch;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setDuration(int duration)
	{
		this.duration=duration;
	}
	
	
	public  void setPursuing(boolean pursuing) {
		this.pursuing = pursuing;
	}
	
	
	
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public void show()

		{
			System.out.println("Degree :"+name);
			System.out.println("duration:"+duration);
			System.out.println("prusuing:"+pursuing);
			System.out.println("percentage:"+percentage);
			System.out.println("branch:"+branch);
			
		}
}



