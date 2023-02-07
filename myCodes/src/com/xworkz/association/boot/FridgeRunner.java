package com.xworkz.association.boot;

import com.xworkz.association.data.Fridge;
import com.xworkz.association.data.CoolDrinks;

public class FridgeRunner {
	public static void main(String args[]) {
		System.out.println("inside main");
		Fridge fridge=new Fridge(5.5f,10,"10kg",true,5.6f);
		fridge.show();
		CoolDrinks commens=new CoolDrinks("pepsi",45,"yash");
		fridge.init(commens);
		fridge.show();
		System.out.println("outside main");
		
		
}

}
