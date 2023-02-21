package com.xworkz.objclass.boot;
import com.xworkz.objclass.data.Park;
import com.xworkz.objclass.data.PoliceStation;

public class PoliceStationRunner {

	public static void main(String[] args) {
		
		Object police=new PoliceStation();
		System.out.println(police);
		
		PoliceStation police1=new PoliceStation("kempegowda police station","Mejastic", 20,"Vikram","Fahad Fassil",100L,"Murder",7,100,1000 );
		
		PoliceStation police2=new PoliceStation("Sangolli rayanna","Bijapur", 15,"VijayKumar","Vijay",112L,"Crime branch",5,50,500 );
		System.out.println("1");
		boolean equal=police1.equals(police2);
		System.out.println("pilice1 and police2:"+equal);
		
		PoliceStation police3=new PoliceStation("Sangolli rayanna","Bijapur", 15,"VijayKumar","Vijay",112L,"Crime branch",5,50,500 );
		System.out.println("2");
		boolean equal1=police2.equals(police3);
		System.out.println("pilice2 and police3:"+equal1);
		
		Park park2=new Park("Cubban_Park", "Bengaluru", 10000, 2000, 3000, 0);
		System.out.println("3");
		boolean equal2=police2.equals(park2);
		System.out.println("pilice2 and police3:"+equal2);
		
		System.out.println("4");
		boolean equal3=police2.equals(null);
		System.out.println("pilice2 and police3:"+equal3);
	}

}
