package com.callor.score.values;

public class Values {
	
	public static final String dLine;
	public static final String sLine;
	
	// static final 변수 생성하기
	static {
		// ======================
		dLine = String
				.format("%050d", 0)
				.replace("0", "=");
		sLine = String
				.format("%050d", 0)
				.replace("0", "-");
	}
	
	
	

}
