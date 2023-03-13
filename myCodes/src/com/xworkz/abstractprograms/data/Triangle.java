package com.xworkz.abstractprograms.data;

class Triangle extends Shape{
	 void calculateArea(){
			System.out.println("Area of Triangle is: "+(0.5*length*height));
		}
	 void calculatePerimeter(){
			System.out.println("Perimiter of Triangle is: "+(a+b+c));
		}
	 void drawShape(){
			System.out.println("draw  trangle shape ");
		}
	
	public static void main(String[] args) 
	{
		Shape shape=new Triangle();
		shape.calculateArea();
		shape.calculatePerimeter();
		shape.drawShape();
		 
		
		
		
		

	}
}
