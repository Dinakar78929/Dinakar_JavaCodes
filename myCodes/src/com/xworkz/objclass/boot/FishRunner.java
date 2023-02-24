package com.xworkz.objclass.boot;
import com.xworkz.objclass.data.Fish;
import com.xworkz.objclass.data.Tv;


public class FishRunner {

	public static void main(String[] args) {
		Object fish=new Fish();
		System.out.println(fish);
		
		Fish fish1=new Fish("Pomplet","sea water fish", "medium", 400, true);
		
		Fish fish2=new Fish("Gowri","Fresh water fish", "small", 200, false);
		
		System.out.println("1");
		boolean equal=fish1.equals(fish2);
		System.out.println("fish1 and fish2 are same:"+equal);
		
		Fish fish3=new Fish("Gowri","Fresh water fish", "small", 200, false);
		
		System.out.println("2");
		boolean equal2=fish2.equals(fish3);
		System.out.println("fish1 and fish2 are same:"+equal2);
		
		Tv tv2=new Tv("Redmi", 35000, 14.5);
		
		System.out.println("3");
		boolean equal3=fish2.equals(tv2);
		System.out.println("fish1 and fish2 are same:"+equal3);
		
		System.out.println("4");
		boolean equal4=fish2.equals(null);
		System.out.println("fish1 and fish2 are same:"+equal4);
		
		
		
		
		
		
		
	}

}
