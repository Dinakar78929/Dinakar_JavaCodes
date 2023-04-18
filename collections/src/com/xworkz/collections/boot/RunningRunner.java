package com.xworkz.collections.boot;

import com.xworkz.collections.data.RunnerUtil;
import com.xworkz.collections.functional.Runner;

public class RunningRunner {

	public static void main(String[] args) {
		
		Runner run=(arg1)-> {
			System.out.println("Distance is:"+arg1);
			return arg1;
		};
		
		System.out.println("Returned :"+RunnerUtil.test(run));

	}

}
