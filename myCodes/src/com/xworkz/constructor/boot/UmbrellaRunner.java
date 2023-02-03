package com.xworkz.constructor.boot;
import com.xworkz.constructor.data.Umbrella;

public class UmbrellaRunner {
	public static void main(String[] args) {
		Umbrella umbrella = new Umbrella("Automatic", "Nylon", 5, "White", "Totes", 700, 4, 5, "Yes", false);
		umbrella.OpenUmbrella();

	}
}
