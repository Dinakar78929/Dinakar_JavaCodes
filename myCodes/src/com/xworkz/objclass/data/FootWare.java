package com.xworkz.objclass.data;

public class FootWare {
	private String brand;
	private double size;
	private String type;
	

	public FootWare() {
		System.out.println("footware const with no-args");
	}

	public FootWare(String brand ,double size ,String type) {
		this.brand=brand;
		this.size=size;
		this.type=type;
	}
	
	
	
	@Override
	public String toString() {
		return "[Brand:"+brand+"][Size:"+size+"][Type:"+type+"]";
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running properties Footware:"+obj);
		if(obj!=null)
		{
			System.out.println("Object is not null");
			if(obj instanceof FootWare)
			{
				System.out.println("Object is Footware type, can compare");
				FootWare casted=(FootWare)obj;
				FootWare foot1=this;
				FootWare foot2=casted;
				if(foot1.brand.equals(foot2.brand) && foot1.size==(foot2.size) && foot1.type.equals(foot2.type))
				{
					System.out.println("FootWare prperties are same");
					return true;
				}
				
			}
			else {
				System.err.println("Object is not Footware type, cannot compare");
				
			}
		}
		else
		{
			System.err.println("Object is null");
		}
		return super.equals(obj);
	}

}
