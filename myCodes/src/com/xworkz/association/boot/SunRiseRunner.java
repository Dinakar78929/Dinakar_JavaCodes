package com.xworkz.association.boot;
import com.xworkz.association.data.SunRise;
import com.xworkz.association.data.Sun;

public class SunRiseRunner {
	public static void main(String[] args) {
		System.out.println("inside main");
		SunRise sunRise=new SunRise("londan","5:30am",true);
		sunRise.show();
		Sun sun=new Sun("round","orange",775688765);
		sunRise.init(sun);
		sunRise.show();
		
		System.out.println("outside main");
		


}
}
