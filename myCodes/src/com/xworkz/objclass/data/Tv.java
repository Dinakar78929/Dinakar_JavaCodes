package com.xworkz.objclass.data;

public class Tv {
	private String brand;
	private int price;
	private double size;
	
	public Tv() {
		System.out.println("Tv constructor with no-args");
	}
	
	public Tv(String brand,int price,double size) {
		this.brand=brand;
		this.price=price;
		this.size=size;
	}
	@Override
	public String toString() {
		return "[Brand:"+brand+"][price:"+price+"][size:"+size+"]";
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in tv:"+obj);
		if(obj!=null)
		{
			System.out.println("Object is not null");
			if(obj instanceof Tv)
			{
				System.out.println("Object is Tv type, can compare ");
				Tv casted=(Tv)obj;
				Tv tv1=this;
				Tv tv2=casted;
				if(tv1.brand.equals(tv2.brand)&& tv1.price==(tv2.price) && tv1.size==(tv2.size)){
					System.out.println("tv1 and tv2 is same");
					return true;
				}
			}else {
				System.err.println("Object is not Tv type, cannot compare ");
			}
		}
		else
		{
			System.err.println("Object is null");
		}
		
		return super.equals(obj);
	}
	

}
