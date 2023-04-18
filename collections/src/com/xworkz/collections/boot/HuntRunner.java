package com.xworkz.collections.boot;

import com.xworkz.collections.data.HunterUtil;
import com.xworkz.collections.functional.Hunter;

public class HuntRunner {

	public static void main(String[] args) {

		Hunter hunter = (arg) -> {
			System.out.println("Running hunt method:" + arg);
		};

		HunterUtil.test(hunter);

		HunterUtil.test((arg1) -> {
			System.out.println("Running hunt method:" + arg1);
		});

	}

}
