package com.callor.applications;

import java.util.Scanner;

public class App_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자입력(2 ~ 9) >> ");
		int num = scan.nextInt();
		
		System.out.println("======================");
		System.out.println("구구단 " + num + " 단");
		System.out.println("----------------------");
		
		for(int i = 0 ; i < 8 ; i++) {
			int num1 = i + 2;
			System.out.print( num );
			System.out.print( " x ");
			System.out.print( num1 );
			System.out.print( " = ");
			System.out.println( num * num1 );
		}
		System.out.println("======================");
		
		
		
	}

}
