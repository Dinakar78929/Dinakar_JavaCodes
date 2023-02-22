package com.xworkz.objclass.data;

public class Fridge {
	private String brand;
	private int model;
	private String color;
	private String material;
	private String door_type;
	private String maxTemp;
	private String minTemp;
	private int noOfDoors;
	private int noOfSelf;
	private boolean freezerZone;

	public Fridge() {
		System.out.println("Fidge constructor with no parameter");
	}

	public Fridge(String brand, int model, String color, String material, String door_type, String maxTemp,
			String minTemp, int noOfDoors, int noOfSelf, boolean freezerZone) {
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.material = material;
		this.door_type = door_type;
		this.maxTemp = maxTemp;
		this.minTemp = minTemp;
		this.noOfDoors = noOfDoors;
		this.noOfSelf = noOfSelf;
		this.freezerZone = freezerZone;
	}

	@Override
	public String toString() {
		return "[Brand:"+brand+"][model:"+model+"][color:"+color+"][material:"+material+
				"][door_type:"+door_type+"][maxTemp:"+maxTemp+"][minTemp:"+minTemp+
				"][noOfDoors:"+noOfDoors+"][noOfSelf:"+noOfSelf+"][freezerZone:"+freezerZone+"]";
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running proreties of Fridge:"+obj);
		if(obj!=null)
		{
			System.out.println("Object is not null");
			if(obj instanceof Fridge)
			{
				System.out.println("Object is a type of Fridge,can compare");
				Fridge casted=(Fridge)obj;
				Fridge fridge1=this;
				Fridge fridge2=casted;
				if(fridge1.brand.equals(fridge2.brand)&&fridge1.model==(fridge2.model)
						&&fridge1.color.equals(fridge2.color)&&fridge1.material.equals(fridge2.material)
						&&fridge1.door_type.equals(fridge2.door_type)&&fridge1.maxTemp.equals(fridge2.maxTemp)
						&&fridge1.minTemp.equals(fridge2.minTemp)&&fridge1.noOfDoors==(fridge2.noOfDoors)
								&&fridge1.noOfSelf==(fridge2.noOfSelf)&&fridge1.freezerZone==(fridge2.freezerZone)){
					System.out.println("Fridge properties are same ");
					return true;
				}
			
		
			}
			else
			{
				System.err.println("Object is not a type of Fridge,can compare");
			}
		}
		else
		{
			System.err.println("Object is not null");
		}
		return super.equals(obj);
	}


}
