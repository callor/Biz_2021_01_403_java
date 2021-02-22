package com.callor.applications;

import java.util.Scanner;

public class App_03_A {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자입력(2 ~ 9) >> ");
			int num1 = scan.nextInt();
			
			boolean bYes2 = num1 >= 2;
			boolean bYes9 = num1 <= 9;
			if(bYes2 && bYes9) {
				// 구구단 출력
				System.out.println("=====================");
				System.out.println("구구단 " + num1 + "단");
				System.out.println("---------------------");
				for(int i = 0 ; i < 8 ; i++) {
					int num2 = i + 2;
					System.out.print(num1);
					System.out.print(" x ");
					System.out.print(num2);
					System.out.print(" = ");
					System.out.println(num1 * num2);
				}
				System.out.println("========================");
			} else {
				System.out.println("입력한 숫자 : " + num1);
				System.out.println("값은 2 ~ 9까지만 입력하세요");
			}
		}
	}
	
}
