package com.xworkz.constructor.boot;

import com.xworkz.constructor.data.Burger;

public class BurgerRunner {
public static void main(String[] args) {
		
		Burger ref=new Burger();
		ref.show();
		ref=new Burger("Chicken Burger","Round Bun","Chicken","Bechamel","Tomatto sauce",50f,15f,2,"large",280,true,280f,1,3);
		ref.show();
		

}
}
