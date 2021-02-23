package com.callor.applications.service;

public class PrimeServiceV2 {
	
	public int prime(int num) {

		// num 값이 소수이면 return num
		// 아니면 return -1
		
		// if(소수이면) return num;
		// else return -1;
		for(int i = 2 ; i < num ; i++) {
			// true 이면 소수가 아니다
			if(num % i == 0) {
				// prime() method 실행을 중단하고
				// main() method에게 -1을 되돌려줘라
				return -1;
			}
		}
		// num값이 소수이어서 for() 반복문을 모두 수행하고
		// 여기에 다다르면 num값을 그대로 return 하라
		return num;
	}
}
