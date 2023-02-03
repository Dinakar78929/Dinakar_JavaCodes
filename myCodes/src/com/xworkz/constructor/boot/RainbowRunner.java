package com.xworkz.constructor.boot;

import com.xworkz.constructor.data.Rainbow;

public class RainbowRunner {
public static void main(String[] args) {
		
		Rainbow ref=new Rainbow();
		ref.show();
		ref=new Rainbow("Violet","indigo","blue","green","yellow","Orange","red");
		ref.show();
}
}
