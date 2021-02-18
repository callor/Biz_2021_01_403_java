package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.ClassServiceV7;

public class Class_09 {

	public static void main(String[] args) {
		
		ClassServiceV7 csV7 = new ClassServiceV7();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("2 ~ 9까지 중 정수 1개 입력 >> ");
		int num = scan.nextInt();
				
		csV7.guguDan(num);
		
	}
	
}
