package com.xworkz.inheritance.data;

public class Camera extends Device {

private String name;

public Camera()
{
	System.out.println("no argument constructor");
}
public Camera(String name) {
	super();
	this.name = name;
	System.out.println("name of camera is nikon");
}



public void capture(String name)
{
	
	System.out.println("name of camera is nikon");

}
public String getName()
{
	return name;
}
}
