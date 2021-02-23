package com.callor.applications.service;

public class PrimeServiceV1 {

	// 정수 1개를 매개변수로 갖는 prime() method
	public void prime( int num ) {
		
		int pos = 0 ;
		for(pos = 2 ; pos < num ; pos++) {
			if(num % pos == 0 ) {
				break;
			}
		}
		if(pos < num) {
			System.out.println("소수가 아님");
		} else {
			System.out.println("소수");
		}
	}
	
}
