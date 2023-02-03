package com.xworkz.constructor.data;

public class Umbrella {
	  public String typeOfUmbrella;
	    public String material;
	    public int size;
	    public String color;
	    public String brand;
	    public float price;
	    public int numberOfPanels;
	    public int durability;
	    public String waterResistant;
	    public boolean uVProtection;
	    
	    public Umbrella(String typeOfUmbrella,String material,int size,String color,String brand,float price,int numberOfPanels,int durability,String waterResistant,boolean uVProtection) {
	    	 this.typeOfUmbrella=typeOfUmbrella;
	    	 this.material=material;
	    	 this.size=size;
	    	 this.color=color;
	    	 this.brand=brand;
	    	 this.price=price;
	    	 this.numberOfPanels=numberOfPanels;
	    	 this.durability=durability;
	    	 this.waterResistant=waterResistant;
	    	 this.uVProtection=uVProtection;
	    	
	    }
	    public void OpenUmbrella() {
	    	System.out.println("Umbrella type "+this.typeOfUmbrella);
	    	System.out.println("Umbrella material "+this.material);
	    	System.out.println("Umbrella size "+this.size);
	    	System.out.println("Umbrella color "+this.color);
	    	System.out.println("Umbrella brand "+this.brand);
	    	System.out.println("Umbrella price "+this.price);
	    	System.out.println("Umbrella number of panels "+this.numberOfPanels);
	    	System.out.println("Umbrella durability "+this.durability+" years");
	    	System.out.println("Umbrella water-resistant "+this.waterResistant);
	    	System.out.println("Umbrella UV protction "+this.uVProtection);
	    }


}
