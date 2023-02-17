package com.xworkz.override.boot;
import com.xworkz.override.data.BengalTiger;
import com.xworkz.override.data.Tiger;

public class TigerRunner {

	public static void main(String[] args) {
		Tiger tiger=new BengalTiger();
		tiger.makeMovement();
		tiger.hutAnimals();
	}

}
