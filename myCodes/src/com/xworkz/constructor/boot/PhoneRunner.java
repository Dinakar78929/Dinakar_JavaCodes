package com.xworkz.constructor.boot;

import com.xworkz.constructor.data.Phone;



public class PhoneRunner {
	public static void main(String args[])
	{
		Phone phone=new Phone("vivo","v20","Android","15*20","octacore",8,256,5000,3,true);
		phone.showPhone();
		
	}

}
