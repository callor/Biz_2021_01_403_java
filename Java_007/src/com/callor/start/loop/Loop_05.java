package com.callor.start.loop;

public class Loop_05 {
	public static void main(String[] args) {

		int intSum = 0;
		for(int i = 0 ; i < 10 ; i += 2) {
			intSum += (i + 1);
		}
		System.out.println("0 ~ 10까지 중 홀수의 합 : " + intSum);
		
		// intSum을 clear하지않으면
		// 이후의 계산 결과가 엉뚱한 값이 나온다
		intSum = 0; 
		// 1,3,5,7,9
		for(int i = 1 ; i <  10 ; i += 2) {
			// 2,4,6,8,10
			intSum += (i + 1);
		}
		System.out.println(intSum);
		
		intSum = 0;
		// 0,2,4,6,8
		for(int i = 0 ; i < 10 ; i += 2) {
			intSum += i;
		}
		System.out.println(intSum);
	
	}
	

}
