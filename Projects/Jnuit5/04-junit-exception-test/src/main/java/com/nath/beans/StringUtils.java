package com.nath.beans;

public class StringUtils {
	
	public static Integer convertedToString(String str) {
		if(str == null || str.trim().length() ==0) {
			throw new IllegalArgumentException("String must not be empty");
			
		}
		return Integer.valueOf(str);
	}

}
