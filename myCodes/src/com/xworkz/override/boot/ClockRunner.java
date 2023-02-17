package com.xworkz.override.boot;
import com.xworkz.override.data.DigitalClock;
import com.xworkz.override.data.Clock;

public class ClockRunner {

	public static void main(String[] args) {
		Clock clock=new DigitalClock();
		
		String val=clock.makeSound(null);
		
		System.out.println("Digital clock make sound:"+val);

}
}
