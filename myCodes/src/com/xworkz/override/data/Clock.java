package com.xworkz.override.data;

public class Clock {
	public Clock() {
		System.out.println("clock constructor with no argument");
	}

public String showTime(String time)
{
	System.out.println("clock shows time");
	return time;
}
public String makeSound(String sound)
{
	System.out.println("clock make sound");
	return sound;
}
}
