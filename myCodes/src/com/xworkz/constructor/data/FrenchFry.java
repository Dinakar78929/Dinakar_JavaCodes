package com.xworkz.constructor.data;

public class FrenchFry {
	    public String size;
	    public String shape;
	    public String flavor;
	    public String temperature;
	    public boolean cooked;
	    public int weight;
	    public float lengthOfFry;
	    public int thicknessOfFry;
	    public String color;
	    public int numberOfPieces;
	    
	    public FrenchFry() {
	    	
	    }
	    
	    public FrenchFry(String s) {
	    	size = s;
	    }
	    public FrenchFry(String s,String sp) {
	    	size = s;
	    	shape=sp;
	    }
	    public FrenchFry(String s,String sp,String f) {
	    	size = s;
	    	shape=sp;
	    	flavor = f;
	    }
	    public FrenchFry(String s,String sp,String f,String t) {
	    	size = s;
	    	shape=sp;
	    	flavor = f;
	    	temperature = t;
	    	
	    }
	    public FrenchFry(String s,String sp,String f,String t,boolean c) {
	    	size = s;
	    	shape=sp;
	    	flavor = f;
	    	temperature = t;
	    	cooked = c;
	    }
	    public FrenchFry(String s,String sp,String f,String t,boolean c,int w) {
	    	size = s;
	    	shape=sp;
	    	flavor = f;
	    	temperature = t;
	    	cooked = c;
	    	weight = w;
	    }
	    public FrenchFry(String s,String sp,String f,String t,boolean c,int w,float l) {
	    	size = s;
	    	shape=sp;
	    	flavor = f;
	    	temperature = t;
	    	cooked = c;
	    	weight = w;
	    	lengthOfFry = l;
	    }
	    public FrenchFry(String s,String sp,String f,String t,boolean c,int w,float l,int tF) {
	    	size = s;
	    	shape=sp;
	    	flavor = f;
	    	temperature = t;
	    	cooked = c;
	    	weight = w;
	    	lengthOfFry = l;
	    	thicknessOfFry=tF;
	    }
	    public FrenchFry(String s,String sp,String f,String t,boolean c,int w,float l,int tF,String cr) {
	    	size = s;
	    	shape=sp;
	    	flavor = f;
	    	temperature = t;
	    	cooked = c;
	    	weight = w;
	    	lengthOfFry = l;
	    	thicknessOfFry=tF;
	    	color =  cr;
	    }
	    public FrenchFry(String s,String sp,String f,String t,boolean c,int w,float l,int tF,String cr,int nP) {
	    	size = s;
	    	shape=sp;
	    	flavor = f;
	    	temperature = t;
	    	cooked = c;
	    	weight = w;
	    	lengthOfFry = l;
	    	thicknessOfFry=tF;
	    	color =  cr;
	    	numberOfPieces=nP;
	    }
	    
	    public void show() {
	    	System.out.println("--------------French Fries detail start----------");
	    	
	    	System.out.println("French Fries Size "+size);
	    	System.out.println("French Fries shape "+shape);
	    	System.out.println("French Fries flavor "+flavor);
	    	System.out.println("French Fries temperature "+temperature);
	    	System.out.println("French Fries cooked "+cooked);
	    	System.out.println("French Fries weight "+weight+" gms");
	    	System.out.println("French Fries length Of Fry "+lengthOfFry+" cm");
	    	System.out.println("French Fries thickness Of Fry "+thicknessOfFry+" cm");
	    	System.out.println("French Fries color "+color);
	    	System.out.println("French Fries number Of Pieces "+numberOfPieces);
	    	System.out.println("--------------French Fries detail end----------");
	    }
	}


