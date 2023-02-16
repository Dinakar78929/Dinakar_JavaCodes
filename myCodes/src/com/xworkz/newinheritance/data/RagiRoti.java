package com.xworkz.newinheritance.data;

public class RagiRoti extends Roti {
	private double calories;
	

	public void setCalories(double calories)
	{
	this.calories=calories;
		System.out.println(" Ragiroti calories ");
	}
	
	public double getCalories()
	{
		return calories;
	}

}
