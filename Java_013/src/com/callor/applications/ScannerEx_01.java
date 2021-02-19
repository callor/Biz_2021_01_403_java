package com.callor.applications;

import java.util.Scanner;

public class ScannerEx_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두개의 정수를 입력하세요");
		System.out.print("숫자1 >> ");
		int num1 = scan.nextInt();
		
		System.out.print("숫자2 >> ");
		int num2 = scan.nextInt();
		scan.nextLine();
		
		System.out.print("이름 >> ");
		String strName = scan.nextLine();

		System.out.println(num1 + num2);
		System.out.println("30" + "40");
		System.out.println(strName);
		
	}
	
}
