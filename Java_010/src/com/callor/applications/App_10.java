package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.myclass.MyGuGuDan;

public class App_10 {

	public static void main(String[] args) {
		
		MyGuGuDan myDan = new MyGuGuDan();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("숫자(2 ~ 9) >> ");
			int num = scan.nextInt();
			
			if(num < 2 || num > 10) {
				System.out.println("어허 그게아니야!!");
				System.out.println("2 ~ 9 까지만 구구단 "
						+ "출력할수 있어");
				System.out.println("다시 입력해 줄래 !!!");
			} else {
				myDan.print(num);
			}
		}
		
		
		
		
		
		
	}
	
}
