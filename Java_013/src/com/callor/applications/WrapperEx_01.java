package com.callor.applications;

public class WrapperEx_01 {

	public static void main(String[] args) {

		/*
		 * wrapper class
		 * 변수를 선언하는 기본 키워드가 있는데
		 * 		int, long, float, double, boolean. char
		 * 초기에 java를 만들때 값을 저장하는 최소한의
		 * 		기능만을 구현했다
		 * 이후에 필요에 의해서 기능들을 추가해야 하는데
		 * 		기본 키워드의 기능을 변경하기에는
		 * 		어려움 있었다
		 * 그래서 자바에서는 기본 키워드 기능을 확하는
		 * 		클래스들을 만들어서 JDK에 포함했다
		 */
		int intNum1 = 0;
		Integer intNum2 = 0;
		
		float floatNum1 = 30.2F;
		Float floatNum2 = 30.2F;
		
		long longNum1 = 300L;
		Long longNum2 = 300L;
		
		double doNum1 = 300.0;
		Double doNum2 = 300.0;
				doNum2 = doNum1;
		
		String str1 = "대한민국";
		String str2 = new String("우리나라");
		
		// 정수 30을 float형으로 변환하여 저장
		float floatNum3 = Float.valueOf(30);
		floatNum3 = (float)30;
		
		// 정수 50을 Float형으로 변환하여 저장
		Float floatNum4 = Float.valueOf(50);
		// 다시 Float형 50을 정수형으로 변환하여 저장
		int intNum4 = floatNum4.intValue();
		
	}
}
