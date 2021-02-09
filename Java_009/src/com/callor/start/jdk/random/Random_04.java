package com.callor.start.jdk.random;

import java.util.Random;

public class Random_04 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int num = rnd.nextInt(100) + 1;

		if(num % 2 == 0) {
			System.out.println(num + "은(는) 짝수");
		}else {
			System.out.println(num +"은(는) 짝수가 아님");
		}
		
	}
	
}
