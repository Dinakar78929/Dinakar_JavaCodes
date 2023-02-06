package com.xworkz.constructor.data;

public class Phone {
	public String brand; 
	public String model; 
	public String os; 
	public String  screenSize;
	public String processor;
	public int ram;
	public int storage;
	public int battery;
	public int numberOfRear;
	public boolean fingerprintsensor;
	public  Camera camera  = new Camera("2X",5,2,true,1080);
	
	public Phone(String brand, String model, String os, String screenSize, String processor, int ram, int storage,int battery, int numberOfRear, boolean fingerprintsensor) 
	{
		this.brand = brand;
		this.model = model;
		this.os = os;
		this.screenSize = screenSize;
		this.ram = ram;
		this.processor=processor;
		this.storage = storage;
		this.battery = battery;
		this.numberOfRear = numberOfRear;
		this.fingerprintsensor = fingerprintsensor;
		this.camera.showCamera();
	}
	public void showPhone()
	{
		System.out.println("\n-----------");
		System.out.println("class phone details:");
		System.out.println("phone brand:"+brand);
		System.out.println("phone model:"+model);
		System.out.println("Operating System:"+os);
		System.out.println("ScreenSize:"+screenSize);
		System.out.println("processor:"+processor);
		System.out.println("RAM:"+ram);
		System.out.println("Storage:"+storage);
		System.out.println("Battery:"+battery);
		System.out.println("no of camera:"+numberOfRear);
		System.out.println("phone has fingersenser:"+fingerprintsensor);
	}
	
	
	
	
}
