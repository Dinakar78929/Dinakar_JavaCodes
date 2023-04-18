package com.xworkz.collections.boot;

import com.xworkz.collections.data.ShooterUtil;
//import com.xworkz.collections.data.ShooterUtil;
import com.xworkz.collections.functional.Shooter;

public class ShooterRunner {

	public static void main(String[] args) {

//		 Shooter shoot=((arg1)->{
//			 System.out.println("GunType is:" + arg1);
//			 return true;
//		 });
		
		System.out.println("returned:" + ShooterUtil.test((arg1) -> {
			System.out.println("GunType is:" + arg1);
			return true;
		}));

		 //System.out.println("returned:"+ShooterUtil.test(shoot));
		
		
		// System.out.println("returned:"+shoot.shoot("Sniper"));

	}

}
