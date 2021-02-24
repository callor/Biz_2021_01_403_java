package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV2;

public class HomeWork_011 {

	/*
	 * 2 이상의 임의의 정수 100개를 만들고
	 * PrimeServiceV2의 prime() method 호출하여
	 * 임의 정수 100개중 소수인 수들의 리스트를 출력
	 * 소수인 수들의 합
	 */
	public static void main(String[] args) {
		
		/*
		 * java에서는 변수, 객체를 선언할때
		 * 사용하기 직전에 선언및 초기화를 하면된다
		 * 통상적으로 코딩을 할때
		 * 변수, 객체등의 선언 코드는
		 * 가급적 코드의 
		 * 	시작부분(클래스 선언 명령문 아래, method 선언문 아래)에
		 * 	작성한다.
		 */
		Random rnd = new Random();
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		
		int intPrimeSum = 0;
		int intPrimeCount = 0;
		
		// int[] rndNums = new int[100]
		int rndNums[] = new int[100]; 
	
		// 생성된 rndNums 배열에 임의 정수 100개를
		// 저장해 두었다
		// 이처럼 배열을 만들어두면
		// 이후의 코드에서 한번 생성된 임의 정수 100개를
		// 자유롭게 활용할 수 있다.
		for(int i = 0 ; i < rndNums.length ; i++) {
			rndNums[i] = rnd.nextInt(10000) + 2;
		}
		
		// rndNums 배열에 담겨있는 정수들을
		// PsV2.prime() method에게 보내서
		// 소수인가를 검사하자
		
		// 다음처럼 prime() method에 배열을 통째로 전달하여
		// 코드를 수행할수 없는 이유
		// psV2.prime(rndNums);
		// PsV2.prime() method는 매개변수가 (int num)로
		//	선언되어 있다.
		//	즉 이 method는 전달받을 수 있는 값이 정수 1개이다
		//	그런데 배열(100개의 정수)를 한꺼번에 전달하려고
		//	시도하기 때문에 안된다.
		// 그렇다면 PsV2.prime() method를 사용하기 위해서는
		// rndNums의 요소들을 한개씩 전달해야 한다.
		// 결론은 for() 반복문을 사용해야 한다
		for(int i = 0 ; i < rndNums.length ; i++) {
			int num = rndNums[i];
			
			int result = psV2.prime(num);
			if(result > 0) {
				System.out.print(num + ", ");
			}
		}
		
		for(int i = 0 ; i < rndNums.length ; i++) {
			int num = rndNums[i];
			int result = psV2.prime(num);
			if(result > 0) {
				intPrimeSum += num;
			}
		}

		for(int i = 0 ; i < rndNums.length ; i++) {
			int num = rndNums[i];
			int result = psV2.prime(num);
			if(result > 0) {
				intPrimeCount ++;
			}
		}
		System.out.println("합계 : " + intPrimeSum);
		System.out.println("개수 : " + intPrimeCount);
	}

}
