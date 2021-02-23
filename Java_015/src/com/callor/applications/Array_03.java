package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_03 {

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
		
		System.out.printf( "값 %d가 최초로 나타난 위치!!!\n",keyNum);
		for(int positon = 0 ; positon < intNums.length ; positon++) {
			if(intNums[positon] == keyNum) {
				System.out.println(positon) ;
				break;
			}
		}
	}
	
}
