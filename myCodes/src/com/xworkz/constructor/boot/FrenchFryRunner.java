package com.xworkz.constructor.boot;
import com.xworkz.constructor.data.FrenchFry;


public class FrenchFryRunner {

		public static void main(String[] args) {
			
			
			FrenchFry fries = new FrenchFry("Medium");
			fries.show();
			
			FrenchFry fries1 = new FrenchFry("Large", "Spring");
			fries1.show();
			
			FrenchFry fries2 = new FrenchFry("Large", "Spring","Salty");
			fries2.show();
			
			
			FrenchFry fries3= new FrenchFry("Large", "Spring","Salty","Very Hot");
			fries3.show();
			
			
			FrenchFry fries4 = new FrenchFry("Large", "Spring","Salty","Very Hot",true);
			fries4.show();
			
			
			FrenchFry fries5 = new FrenchFry("Large", "Spring","Salty","Very Hot",true,100);
			fries5.show();
			
			
			FrenchFry fries6 = new FrenchFry("Large", "Spring","Salty","Very Hot",true,100,7.5f);
			fries6.show();
			
			
			FrenchFry fries7 = new FrenchFry("Large", "Spring","Salty","Very Hot",true,100,7.5f,1);
			fries7.show();
			
			
			FrenchFry fries8 = new FrenchFry("Large", "Spring","Salty","Very Hot",true,100,7.5f,1,"Golden Yellow");
			fries8.show();
			
			
			FrenchFry fries9 = new FrenchFry("Large", "Spring","Salty","Very Hot",true,100,7.5f,1,"Golden Yellow",25);
			fries9.show();

		}

	}


