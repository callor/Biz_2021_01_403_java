package com.callor.student.values;

public class Values {

	public static String dLine(int nCount) {
		return String.format("%0" + nCount + "d", 0)
				.replace("0", "=");
	}
	public static String sLine(int nCount) {
		return String.format("%0" + nCount + "d", 0)
				.replace("0", "-");
	}
	
}
