package com.xworkz.constructor.data;

public class Burger {
    public String name;
    public String typeOfBun;
    public String meat;
    public String toppings;
    public String sauce;
    public float cheese;
    public float preparationTime;
    public int onion;
    public String size;
    public int price;
    public boolean availability;
    public float caloric;
    public int tomatoo;
    public int pickel;
    public Burger()
    {
    	
    }
    
    public Burger(String name,String typeOfBun,String meat,String toppings,String sauce,float cheese,float preparationTime,int onion,String size, int price,boolean availability,float caloric,int tomatoo,int pickel)
    {
    	this.name=name;
    	this.typeOfBun=typeOfBun;
    	this.meat=meat;
    	this.toppings=toppings;
    	this.sauce=sauce;
    	this.cheese=cheese;
    	this.preparationTime=preparationTime;
    	this.onion=onion;
    	this.size=size;
    	this.price=price;
    	this.availability=availability;
    	this.caloric=caloric;
    	this.tomatoo=tomatoo;
    	this.pickel=pickel;
    }
    public  void  show() 
    {
    	System.out.println("---------Burger details start-------------- ");
    	System.out.println("Burger name is:"+this.name);
    	System.out.println("type of bun is used:"+this.typeOfBun);
    	System.out.println("meat:"+this.meat);
    	System.out.println("topings:"+this.toppings);
    	System.out.println("Sauce:"+this.sauce);
    	System.out.println("chees in grams:"+this.cheese);
    	System.out.println("Preparation time  :"+this.preparationTime);
    	System.out.println(" Number of onion: "+this.onion);
    	System.out.println(" Size of burger:"+this.size);
    	System.out.println("Price of Burger: "+this.price);
    	System.out.println("Burger is availeble:"+this.availability);
    	System.out.println("Amount of calories: "+this.caloric);
    	System.out.println("number of tomatoo: "+this.tomatoo);
    	System.out.println("number of pickel pack: "+this.pickel);
    	System.out.println("---------Burger details end-------------- ");
    	
    	
    }

}
