package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.PrimeServiceV2;

public class Prime_03 {

	public static void main(String[] args) {
		
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		System.out.println(psV2.prime(2));
		
		Scanner scan = new Scanner(System.in);
		System.out.println("2 이상의 정수 입력");
		System.out.print(">> ");
		int num = scan.nextInt();
		
		
		
		
		
		int result = psV2.prime(num);
		if(result < 0) {
			System.out.println(num + "는 소수가 아님");
		} else {
			System.out.println(num  + "는 수수");
		}
	}
	
}
