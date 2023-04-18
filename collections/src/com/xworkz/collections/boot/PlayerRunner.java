package com.xworkz.collections.boot;

import com.xworkz.collections.data.HunterUtil;
import com.xworkz.collections.data.PlayerUtil;
import com.xworkz.collections.functional.Player;

public class PlayerRunner {

	public static void main(String[] args) {
		
		Player play1=(arg1,arg2)->{
			String name=arg1.toUpperCase();
//			System.out.println("Player Name:"+name);
			return name;
		};
		
		Player play2=(arg1,arg2)->{
			String state=arg2.toLowerCase();
//			System.out.println("Player State:"+state);
			return state;
		};
		
		Player play3=(arg1,arg2)->{
//			System.out.println("Name="+arg1+" State="+arg2);
			return arg1+arg2;
		};
		
		System.out.println(PlayerUtil.test(play1));
		System.out.println();;
		PlayerUtil.test(play3);
		
		
		
		

	}

}
