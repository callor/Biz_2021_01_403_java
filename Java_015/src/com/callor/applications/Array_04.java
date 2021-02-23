package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_04 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] intNums = new int[100];
		for(int i = 0 ; i < intNums.length ; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}

		Scanner scan = new Scanner(System.in);
		System.out.println("1 ~ 10까지 정수 입력");
		System.out.print("숫자 >> ");
		int keyNum = scan.nextInt();
		
		/*
		 * 변수는 앞에서 어떤 값을 저장했던 상관없이
		 * 가장 마지막에 저장한 값만 가지고 있다
		 */
		int num = 0;
		num = 100;
		num = 101;
		num = -1;
		num = -10000;
		System.out.println(num);
		
		int lastPos = 0;
		System.out.printf( "값 %d가 마지막으로 나타난 위치!!!\n",keyNum);
		for(int positon = 0 ; positon < intNums.length ; positon++) {
			if(intNums[positon] == keyNum) {
				System.out.println(positon) ;
				// 키보드로 입력한 값이 일치할때마다
				// 그 위치를 lastPos에 저장한다.
				lastPos = positon;
			}
		}
		// 여기 오면 lastPos에 저장된 값은
		// 가장 마지막으로 lastPos = position이 실행된
		// 결과만 담고 있다
		System.out.println(lastPos);
	}
	
}
