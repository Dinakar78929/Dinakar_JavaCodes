package com.xworkz.constructor.boot;
import com.xworkz.constructor.data.Biryani;
public class BiryaniRunner {
	public static void main(String[] args) {
		
		Biryani ref=new Biryani();
		ref.show();
		ref=new Biryani("chicken biriyani");
		ref.show();
		ref=new Biryani("chicken biriyani",40);
		ref.show();
		ref=new Biryani("chicken biriyani",40,"1kg");
		ref.show();
		ref=new Biryani("chicken biriyani",40,"1kg",360,65.9f);
		ref.show();
		ref=new Biryani("chicken biriyani",40,"1kg",360,65.9f,55.5f);
		ref.show();
		ref=new Biryani("chicken biriyani",40,"1kg",360,65.9f,55.5f,28.8f);
		ref.show();
		ref=new Biryani("chicken biriyani",40,"1kg",360,65.9f,55.5f,28.8f,10);
		ref.show();
		ref=new Biryani("chicken biriyani",40,"1kg",360,65.9f,55.5f,28.8f,10,20);
		ref.show();
		ref=new Biryani("chicken biriyani",40,"1kg",360,65.9f,55.5f,28.8f,10,20,30);
		ref.show();
		ref=new Biryani("chicken biriyani",40,"1kg",360,65.9f,55.5f,28.8f,10,20,30,20.5f);
		ref.show();
		ref=new Biryani("chicken biriyani",40,"1kg",360,65.9f,55.5f,28.8f,10,20,30,20.5f,50f);
		ref.show();
		ref=new Biryani("chicken biriyani",40,"1kg",360,65.9f,55.5f,28.8f,10,20,30,20.5f,50f,5);
		ref.show();
		ref=new Biryani("chicken biriyani",40,"1kg",360,65.9f,55.5f,28.8f,10,20,30,20.5f,50f,5,"10 piece");
		ref.show();
		ref=new Biryani("chicken biriyani",40,"1kg",360,65.9f,55.5f,28.8f,10,20,30,20.5f,50f,5,"10 piece",5);
		ref.show();

	}

}
