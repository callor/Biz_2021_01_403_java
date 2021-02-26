package com.callor.start;

public class Odd_Even_02 {
	public static void main(String[] args) {
		
		int intSumEven = 0;
		for(int i = 0 ; i < 100 ; i++) {
			int num = i + 1;
			boolean bYes = num % 2 == 0;
			if(bYes) {
				intSumEven += num;
			}
		}
		System.out.println("짝수합 : " + intSumEven);
		
		int intSumOdd = 0;
		for(int i = 0 ; i < 100; i++) {
			int num = i + 1;
			boolean bYes = num % 2 == 1;
			if(bYes) {
				intSumOdd += num;
			}
		}
		System.out.println("홀수의 합 : " + intSumOdd);
		
		// 위에서 선언하고 사용했던 변수를 "재 사용"하기
		// 반드시 초기화(clear) 해야 한다.
		intSumOdd = 0;
		for(int i = 0 ; i < 100 ; i++) {
			int num = i + 1;
			boolean bYes = num % 2 == 0;
			
			// if( bYes == false) {
			
			// bYes가 true가 아니면
			if( !bYes ) {
				intSumOdd += num;	
			}
		}
		System.out.println("홀수의합 : " + intSumOdd);
		
		
		
	}
}
