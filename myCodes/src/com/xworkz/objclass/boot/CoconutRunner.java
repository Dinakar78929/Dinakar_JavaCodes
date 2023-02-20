package com.xworkz.objclass.boot;
import  com.xworkz.objclass.data.Coconut;
public class CoconutRunner {
	public static void main(String args[])
	{
		Object coco=new Coconut();
		System.out.println(coco);
		
		Coconut coco1=new Coconut();
		coco1.setPrice(0);
		coco1.isBig(true);
		coco1.setSize("big");
		coco1.isWater(false);
		System.out.println(coco1);
		
		Coconut coco2=new Coconut();
		coco2.setPrice(100);
		coco2.isBig(true);
		coco2.setSize("medium");
		coco2.isWater(true);
		System.out.println(coco2);
		System.out.println(coco1.equals(coco2));
	}

}
