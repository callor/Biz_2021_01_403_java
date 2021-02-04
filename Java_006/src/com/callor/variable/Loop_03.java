package com.callor.variable;

public class Loop_03 {

	public static void main(String[] args) {
		
		int num1 = 0;
		for( ; num1 < 10   ; ) {
			num1 += 1;
			System.out.println(num1);
		}
		System.out.println("나는 for 이후의 코드");
		
		num1 = 0;
		for( ; num1 < 100 ; ) {
			num1 += 1;
			System.out.println(num1);
		}
		
	}
}


