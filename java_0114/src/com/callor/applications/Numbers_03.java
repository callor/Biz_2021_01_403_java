package com.callor.applications;

import java.util.Random;

public class Numbers_03 {

	public static void main(String[] args) {
		
		// 정수형배열 45개를 선언하고
		// 1 ~ 45까지 정수를 저장
		int[] intNums = new int[45];
		for(int i = 0 ; i < intNums.length ; i++) {
			intNums[i] = i + 1;
		}
		for(int i = 0 ; i < intNums.length ; i++) {
			System.out.print(intNums[i] + ",  ");
		}

		Random rnd = new Random();
		
		// 0 ~ 44까지 임의 숫자 2개를 만들고
		// intNums의 주소에 대입한 후
		// 실제 저장된 값을 출력
		for(int i = 0 ; i < 10 ; i++) {
			int num1 = rnd.nextInt(45);
			int num2 = rnd.nextInt(45);
			
			System.out.printf("%d, %d\n",
					intNums[num1], 
					intNums[num2]);
		}
		System.out.println("==============================");
		for(int i = 0 ; i < 1000 ; i++) {
			int num1 = rnd.nextInt(intNums.length);
			int num2 = rnd.nextInt(intNums.length);
			
			int temp = intNums[num1];
			intNums[num1] = intNums[num2];
			intNums[num2] = temp;
		}
		
		for(int i = 0 ; i< intNums.length ; i++ ) {
			System.out.printf("%d, ", intNums[i]);
		}
		System.out.println();
		
		System.out.println("=========================");
		System.out.println("행운의 숫자");
		System.out.println("-------------------------");
		
		for(int i = 0 ; i < 6 ; i++) {
			System.out.printf("%d\t",intNums[i]);
		}
		System.out.println();
		System.out.println("=========================");
		
	}
	
}
