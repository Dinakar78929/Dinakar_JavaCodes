package com.xworkz.shoes.util;

import com.xworkz.shoes.constants.Type;

public class ValidateUtil {

	public static boolean validString(String value) {
		if (value != null && !value.isEmpty() && value.length() > 2 && value.length() < 30) {
			return true;
		}
		return false;
	}

	public static boolean validType(Type value) {
		if (value != null) {
			return true;
		}
		return false;
	}

	public static boolean validInt(int value) {
		if (value > 0) {
			return true;
		}
		return false;
	}

	public static boolean validDouble(double value) {
		if (value > 0) {
			return true;
		}
		return false;
	}
	
	public static boolean validBoolean(boolean value) {
		if(value==true) {
			return true;
		}
		return false;
	}
	
	public static boolean validFlag(boolean...flag)
	{
		for(int index=0;index<flag.length; index++)
		{
			boolean element =flag[index];
			if(!element)
			{
				return false;
			}
			
		}
		return true;
	}

}
