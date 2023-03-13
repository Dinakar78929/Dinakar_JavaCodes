package com.xworkz.abstractprograms.data;

public abstract class Train123 {
	
	public String destination="Tarikere";
	public String color="Blue"; 
	public boolean move=false;
	public String startsAt="12:30 AM";
	public String locoName="Mr.Kumar";
	public String trainName="JanShatabdi";
	public int speed=100;
	public int trainNumber=56748;
	public int coaches=30;
	
	
	abstract void addCarriage();
	abstract void removeCarriage();
	abstract void maxSpeed();
	abstract void destination();
	abstract void start();
	abstract void isMoving();
	abstract void name();
	abstract void number();
	abstract void color();
	abstract void nomberOfCoaches();
	abstract void locopiletName();
	
	

}
