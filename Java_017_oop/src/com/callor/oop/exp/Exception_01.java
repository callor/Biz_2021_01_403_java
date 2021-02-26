package com.callor.oop.exp;

import java.util.Scanner;

public class Exception_01 {

	public static void main(String[] args) {
		
		
		Integer.valueOf("3");

		// try catch : 예외처리
		try {
			Integer.valueOf("");	
		} catch (NumberFormatException e) {
			System.out.println("null 값은 숫자로 변환할 수 없음");
			// TODO: handle exception
		}

		//	boolean bYes = 3 == "3";
		//	if(3 == "3") {} 
		Scanner scan = new Scanner(System.in);
		System.out.println("0 이상의 정수를 입력하세요");
		System.out.print(">> ");
		String strNum = scan.nextLine();
		
		try {
			int intNum = Integer.valueOf(strNum);
			if(intNum < 0) {
				System.out.println("정수 0 이상 입력하세요!!!");
			} else {
				System.out.println("입력한 정수 : " + intNum);
			}
		} catch (Exception e) {
			System.out.println("반드시 숫자로 입력해 주세요");
			// TODO: handle exception
		}
		
		
		
		
	}
	
}
