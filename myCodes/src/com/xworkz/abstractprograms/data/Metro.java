package com.xworkz.abstractprograms.data;

public class Metro extends Train123 {
	
	void addCarriage()
	{
		System.out.println("WE can add carriage item in train");
	}
	@Override
	void destination() 
	{
	System.out.println(" the destination is:"+destination);
	}
	@Override
	void color() {
		System.out.println("colour is:"+color);
		
	}
	@Override
	void isMoving() {
		System.out.println(move);
		
	}
	@Override
	void locopiletName() {
		// TODO Auto-generated method stub
		System.out.println("Name of locopilet:"+locoName);
	}
	@Override
	void maxSpeed() {
		// TODO Auto-generated method stub
		System.out.println("Max speed is:"+speed);
	}
	@Override
	void name() {
		// TODO Auto-generated method stub
		System.out.println("Train Name:"+trainName);
	}
	@Override
	void nomberOfCoaches() {
		// TODO Auto-generated method stub
		System.out.println("number of coaches:"+coaches);
	}
	@Override
	void number() {
		// TODO Auto-generated method stub
	System.out.println("Train number:"+trainNumber);	
	}
	@Override
	void removeCarriage() {
		// TODO Auto-generated method stub
	System.out.println("we can remove our carriage");	
	}
	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Train start time:"+startsAt);
	}

	
	

	public static void main(String[] args) {
		
		Train123 tr=new Metro();
		tr.addCarriage();
		tr.color();
		tr.destination();
		tr.isMoving();
		tr.locopiletName();
		tr.maxSpeed();
		tr.name();
		tr.nomberOfCoaches();
		tr.number();
		tr.removeCarriage();
		tr.start();
		
			


	}
}



