package com.callor.applications;

import java.util.Scanner;

public class Array_03 {

	public static void main(String[] args) {
		
		/*
		 * 문자열 배열 strSub를 선언하고
		 * 문자열 "국어","영어","수학"을 저장(할당)하면서
		 * 배열 자동으로 개수를 생성하라
		 * 
		 * 배열에 저장될 데이터(값들)이 이미 정해져 있는 경우
		 * 
		 */
		String[] strSub = new String[] {"국어","영어","수학"};
		int[] intNum = new int[] {33,87,55,5,6,3,4,5, //5
				4,3,23,34,33,24,5,5}; // 10
		
		int sum = 0;
		for(int i = 0 ; i < intNum.length ; i++) {
			sum += intNum[i];
		}
		System.out.println("전체 배열의 개수 : " + intNum.length);
		System.out.println("합계:" + sum);
		
		Scanner scan = new Scanner(System.in);
		for(int i = 0 ; i < strSub.length ; i++) {
			System.out.print(strSub[i] + " 점수 >> ");
			int score = scan.nextInt();
			System.out.println("입력한 점수 : " + score);
		}
	}
	
	
}
