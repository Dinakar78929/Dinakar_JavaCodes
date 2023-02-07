package com.xworkz.association.boot;

import com.xworkz.association.data.SunGlass;
import com.xworkz.association.data.Frame;

public class SunGlassRunner {
	public static void main(String[] args) {
		System.out.println("inside main");
		SunGlass sunGlass=new SunGlass("lencart",1500,"round");
		sunGlass.show();
		Frame frame=new Frame("round","orange",1200);
		sunGlass.init(frame);
		sunGlass.show();
		
		System.out.println("outside main");
		


}
}
