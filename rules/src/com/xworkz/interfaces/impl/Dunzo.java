package com.xworkz.interfaces.impl;
import com.xworkz.interfaces.Delivery;

public class Dunzo implements Delivery {

	@Override
	public double charges() {
		System.out.println("Running charges in Dunzo");
		return 30;
	}

	@Override
	public double timeTaken() {
		System.out.println("Running timeTaken in Dunzo");
		return 40;
	}

	@Override
	public String agentName(int rating) {
		System.out.println("Running agentName in Dunzo");
		if(rating==1)
		{
			System.out.println("AgentName is Basavarj");
		}
		if(rating==2)
		{
			System.out.println("AgentName is Dinakar");
		}
		if(rating==3)
		{
			System.out.println("AgentName is Sanketh");
		}
		
		return "empty";
	}
	}
