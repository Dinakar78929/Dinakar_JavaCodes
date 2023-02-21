package com.xworkz.objclass.data;

public class WaterFall {
	private String name;
	private double height;
	private String location;
	
	public WaterFall() {
		System.out.println("WaterFall const with no-args");
	}

	public WaterFall(String name ,double height ,String location) {
		this.name=name;
		this.height=height;
		this.location=location;
	}
	
	@Override
	public String toString() {
		return "[Name:"+name+"][Height:"+height+"][Location:"+location+"]";
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running properties WaterFall:"+obj);
		if(obj!=null)
		{
			System.out.println("Object is not null");
			if(obj instanceof WaterFall)
			{
				System.out.println("Object is WaterFall type, can compare");
				WaterFall casted=(WaterFall)obj;
				WaterFall water2=this;
				WaterFall water3=casted;
				if(water2.name.equals(water3.name) && water2.height==(water3.height) && water2.location.equals(water3.location))
				{
					System.out.println("WaterFall prperties are same");
					return true;
				}
				
			}
			else {
				System.err.println("Object is not WaterFall type, cannot compare");
				
			}
		}
		else
		{
			System.err.println("Object is null");
		}
		return super.equals(obj);
	}

}


