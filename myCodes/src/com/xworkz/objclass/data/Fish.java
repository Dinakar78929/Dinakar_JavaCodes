package com.xworkz.objclass.data;

public class Fish {
	private String name;
	private String type;
	private String size;
	private int price;
	private boolean alive;
	
	public Fish() {
		System.out.println("Fish constructor with no parameter");
	}
	
	public Fish(String name, String type, String size, int price,boolean alive) {
		this.name = name;
		this.type = type;
		this.size = size;
		this.price = price;
		this.alive = alive;
	}
	
	@Override
	public String toString() {
		return "[Name:"+name+"][Type:"+type+"][size:"+size+"][Price:"+price+"][Is Alive:"+alive;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running properties of Fish"+obj);
		if(obj!=null)
		{
			System.out.println("Object is not null");
			if(obj instanceof Fish)
			{
				System.out.println("Object is a Fish Type,can compare");
				Fish casted=(Fish)obj;
				Fish fish1=this;
				Fish fish2=casted;
				if(fish1.name.equals(fish2.name) &&fish1.type.equals(fish2.type) 
						&&fish1.size.equals(fish2.size)
						&&fish1.price==(fish2.price)
						&&fish1.alive==(fish2.alive))
				{
					System.out.println("Fish properties are same");
				}
				else
				{
					System.out.println("Fish properties are differnt");
				}
			}
			else
			{
				System.err.println("Object is not a Fish Type,cannot compare");
			}
		}
		else
		{
			System.err.println("Object is null");
		}
		return super.equals(obj);
	}
	
	
	

}
