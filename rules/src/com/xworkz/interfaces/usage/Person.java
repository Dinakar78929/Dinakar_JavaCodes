package com.xworkz.interfaces.usage;
import com.xworkz.interfaces.Delivery;

public class Person {
	private Delivery delivery;
	
	public Person(Delivery delivery) 
	{
		this.delivery=delivery;
	}
	
	public void checkDelivery()
	{
		double totalCharges=this.delivery.charges();
		
		if(totalCharges<60)
		{
			System.out.println("Charges are ok");
		}
		else
		{
			System.out.println("Charges are expensive");
		}
		double totalTimeTaken=this.delivery.timeTaken();
		if(totalTimeTaken<=30)
		{
			System.out.println("OnTime delivery");
		}
		else
		{
			System.out.println("delayed delivery");
		}
		String agentName=this.delivery.agentName(1);
		
	
	
	
	
	
	}	

}
