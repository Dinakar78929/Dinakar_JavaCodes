package com.xworkz.headphone.util;

import java.time.LocalDate;

public class ValidateUtil {

	private ValidateUtil() {
		System.out.println("No args constructor");
	}

	public static boolean validString(String value) {
		if (value != null && !value.isEmpty() && value.length() > 3 && value.length() < 30) {
			return true;
		}
		return false;
	}

	public static boolean validInt(int num) {
		if (num > 0) {
			return true;
		}
		return false;

	}

	public static boolean validNumber(int num) {
		if (num > 0 && num < 100) {
			return true;
		}
		return false;
	}

	public static boolean validFlag(boolean... flags) {
		for (int index = 0; index < flags.length; index++) {
			boolean element = flags[index];
			if (!element) {
				return false;
			}
		}
		return true;
	}

//	public static boolean validPrice(double cost)
//	{
//		if(cost>100 && cost<2000)
//		{
//			return true;
//		}
//		return false;
//	}
//	

//	
//	public static boolean validDate(LocalDate first, LocalDate pastDate)
//	{
//		LocalDate tomorrow=LocalDate.now().plusDays(1);
//		
//		if(first!=null  && !first.isAfter(tomorrow) && first.isAfter(pastDate))
//		{
//			return true;
//		}
//		return false;
//	}

}
