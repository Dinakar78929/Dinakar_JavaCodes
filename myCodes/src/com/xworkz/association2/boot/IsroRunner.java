package com.xworkz.association2.boot;

import com.xworkz.associaion2.data.Isro;
import com.xworkz.associaion2.data.Scientist;

public class IsroRunner {
	public static void main(String args[]) {
		
		Isro isro=new Isro();
		String[] locs= {"Hydrabad","Mumbai","Delhi"};
		isro.setLocations(locs);
		int[] snum= {13,20,30,49};
		isro.setSateliteNos(snum);
		isro.display();
	
		Scientist scientist1=new Scientist();
		Scientist scientist2=new Scientist();
		
		scientist1.setName("Abdul kalam");
		scientist1.setDesignation("director");
		
		scientist2.setName("Nambi");
		scientist2.setDesignation("senior scientist");
		
		Scientist[] scientists= {scientist1,scientist2};
		isro.setScientist(scientists);
		isro.display();
		
		
		
		
		
		
		
}
}


