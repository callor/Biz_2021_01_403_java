package com.callor.start.logic;

public class Logic_04 {

	public static void main(String[] args) {
		
		for(int i = 0 ; i < 10 ; i++) {
			boolean bYes = i % 2 == 0;
			if(bYes) {
				System.out.println(i + "는 짝수!!");
			}
		}
		
		int num = 0;
		// num값이 어떤 연산결과를 저장하는 코드
		boolean bYes = num % 2 == 0;
		if(bYes) {
			System.out.println(num + "는 짝수");
		}
		
		
		
		
	}
	
}
