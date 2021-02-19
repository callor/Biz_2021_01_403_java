package com.callor.applications;

import java.util.Scanner;

public class ScannerEx_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("과목 >> ");
		String strSub = scan.nextLine();
		System.out.print("점수 >> ");
		int intScore = scan.nextInt();
		System.out.printf("%s  : %d \n",strSub,intScore);
		
		scan.nextLine();
		System.out.print("과목 >> ");
		strSub = scan.nextLine();
		System.out.print("점수 >> ");
		intScore = scan.nextInt();
		System.out.printf("%s  : %d \n",strSub,intScore);

		scan.nextLine();
		System.out.print("과목 >> ");
		strSub = scan.nextLine();
		System.out.print("점수 >> ");
		intScore = scan.nextInt();
		System.out.printf("%s  : %d \n",strSub,intScore);

		
	}
	
}
