package com.xworkz.objclass.data;

public class Cake {
	private String flavour;
	private String weight;
	private String shape;
	private int price;

	public Cake() {
		System.out.println("Cake const with no-args");
	}

	public Cake(String flavour, String weight, String shape, int price) {
		this.flavour = flavour;
		this.weight = weight;
		this.shape = shape;
		this.price = price;
	}

	@Override
	public String toString() {
		return "[Flavour:" + flavour + "][weight:" + weight + "][Shape:" + shape + "][Price:" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running properties Cake:" + obj);
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof Cake) {
				System.out.println("Object is Cake type, can compare");
				Cake casted = (Cake) obj;
				Cake cake1 = this;
				Cake cake2 = casted;
				if (cake1.flavour.equals(cake2.flavour) && cake1.weight.equals(cake2.weight)
						&& cake1.shape.equals(cake2.shape) && cake1.price == (cake2.price)) {
					System.out.println("Cake prperties are same");
					return true;
				}

			} else {
				System.err.println("Object is not Cake type, cannot compare");

			}
		} else {
			System.err.println("Object is null");
		}
		return super.equals(obj);
	}

}
