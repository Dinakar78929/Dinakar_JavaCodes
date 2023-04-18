package com.xworkz.collections.boot;

import com.xworkz.collections.data.GamblerUtil;
import com.xworkz.collections.functional.Gambler;

public class GamblerRunner {

	public static void main(String[] args) {
		
		Gambler game1=(arg1)->{
			System.out.println("Principle amount:"+arg1);
			if(arg1>500 && arg1<1000)
			{
				System.out.println("Principle amount greater than 500 and  less than 1000");
				return 0;
			}
			else if(arg1>1000)
			{
				System.out.println("principle amount is greater than 1000");
			}
			return 100;
			
		};
		
		double r=GamblerUtil.test(game1);
		System.out.println("returned:"+r);
	}

}
