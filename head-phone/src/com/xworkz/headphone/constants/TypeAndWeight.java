package com.xworkz.headphone.constants;

public enum TypeAndWeight {
	ON_EAR(50),OVER_HEAD(150),NECK_BAND(45);
	
	private final double weight;

	private TypeAndWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}
	
	
	
	

}
