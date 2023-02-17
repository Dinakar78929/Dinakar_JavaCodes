package com.xworkz.override.data;

public class DigitalClock extends Clock{
	public DigitalClock() {
		System.out.println("DigitalClock constructor with no parameter");
	}
	@Override
	public String makeSound(String sound)
	{
		System.out.println("Digital clock does not sounds");
		return sound;
	}


}
