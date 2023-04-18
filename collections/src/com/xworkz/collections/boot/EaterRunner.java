package com.xworkz.collections.boot;

import com.xworkz.collections.data.EaterUtil;
import com.xworkz.collections.functional.Eater;

public class EaterRunner {

	public static void main(String[] args) {
		Eater eat=(arg1,arg2)->{
			String food1=arg1.toUpperCase();
			System.out.println("item name:"+arg1);
			return food1;
		};
		
		Eater eat1=(arg1,arg2)->{
			String food2=arg1.toLowerCase();
			System.out.println("item name:"+arg1);
			return food2;
		};
		
		Eater eat2=(arg1,arg2)->{
			System.out.println("running eat:"+"item="+arg1+" "+"quantity="+arg2);
			return arg1;
		};
		
		
		
		System.out.println("returned item in uppercase:"+EaterUtil.test(eat));
		System.out.println("returned item in lowercase:"+EaterUtil.test(eat1));
		
		System.out.println("returned:"+EaterUtil.test(eat2));

	}

}
