package com.callor.start;

public class Multiple_01 {

	public static void main(String[] args) {
		
		int int3M = 0 ;
		
		// 7 ~ 106
		for(int i = 0 ; i < 100; i++) {
			
			int num = i + 7;
			boolean bYes = num % 3 == 0;

			// if(num % 3 == 0) {
			// if(bYes == true)
			if(bYes) {
				int3M += num;
				System.out.println(num + "는 3의배수");
			}
		} // for end
		System.out.println("3의 배수합 : " + int3M);
	}
}
