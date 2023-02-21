package com.xworkz.objclass.data;

public class Alcohol {
	private String brand;
	private int percentage;
	private int price;
	private String type;

	public Alcohol() {
		System.out.println("alcohol const with no argument");
	}

	public Alcohol(String brand, int percentage, int price, String type) {
		this.brand = brand;
		this.percentage = percentage;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "[Brand:" + brand + "][Percentage:" + percentage + "][Price:" + price + "][Type:" + type + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running properties alcohol:" + obj);
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof Alcohol) {
				System.out.println("Object is Alcohol type, can compare");
				Alcohol casted = (Alcohol) obj;
				Alcohol alcohol2 = this;
				Alcohol alcohol3 = casted;
				if (alcohol2.brand.equals(alcohol3.brand) && alcohol2.percentage == (alcohol3.percentage)
						&& alcohol2.price == (alcohol3.price) && alcohol2.type.equals(alcohol3.type)) {
					System.out.println("Alcohol prperties are same");
					return true;
				}

			} else {
				System.err.println("Object is not Alcohol type, cannot compare");

			}
		} else {
			System.err.println("Object is null");
		}
		return super.equals(obj);
	}

}
