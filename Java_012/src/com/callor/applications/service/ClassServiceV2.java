package com.callor.applications.service;

import java.util.Random;
import java.util.Scanner;

public class ClassServiceV2 {
	
	// 클래스 차원에서 선언된 변수
	// 인스턴스 변수
	//		ClassServiceV2 클래스를 사용하여
	//		(어디선가) 객체를 선언하고
	//		초기화 하여
	//		인스턴스화 되었을때 부터
	//		자동으로 생성되는 변수
	
	//	- 현재 클래스의 모든 method에서
	//		공용으로 읽고 쓰기가 가능한 변수들
	private Random rnd = new Random();
	private int sum = 0;
	private Scanner scan = new Scanner(System.in);
	
	public void for_1() {
		
		// sum1 : (메서드) 지역변수
		//  for_1() 메서드가 끝나면 소멸
		int sum1 = 0;
		
		// i : (for반복문) 지역변수
		// for(int...) 명령문이 끝나면 소멸
		for(int i = 0 ; i < 10 ; i++) {
			
			// num : (for반복문) 지역변수
			// for(int...) 명령문이 끝나면 소멸
			int num = i + 1;
			sum1 += num; 
			
		}
		System.out.println(sum1);
	}
	
	public void sum() {
		System.out.println("sum method 에서의 sum = " 
					+ sum);
	}
	// 덧셈
	public void add() {
		int num1 = rnd.nextInt(100);
		int num2 = rnd.nextInt(100);
		sum = num1 + num2;
		System.out.print(num1);
		System.out.print("+");
		System.out.print(num2);
		System.out.print("=");
		System.out.println(sum);
	}
	// 곱셈
	public void times() {
		/*
		 * num1과 num2는 add() method에도 선언되어 있지만
		 * 선언된 method 가 다르므로
		 * 이름만 같을뿐 전혀 다른 변수다
		 */
		int num1 = rnd.nextInt(100) + 1;
		int num2 = rnd.nextInt(100) + 1;
		int result = num1 * num2;
		System.out.print(num1);
		System.out.print("x");
		System.out.print(num2);
		System.out.print("=");
		System.out.println(result);
	}
	public void input() {
		/*
		 * 
		 * Scanner를 지역변수로 선언했을때
		 * 
		 * input() method가 호출될때마다
		 * 키보드 입력을 받기위해
		 * Scanner 클래스를 객체 만들고
		 * 사용이 끝나면 연결을 해제(끊는)하는
		 * 과정이 계속 반복된다
		 * 
		 */
		Scanner scan1 = new Scanner(System.in);
		int num1 = scan1.nextInt();
	}
	
	// 나눗셈
	public void division() {
		/*
		 * Scanner를 scan 인스턴스변수로 선언
		 * 
		 * 현재 클래스(Css..V2)가 객체로 선언되고
		 * 	인스턴스로 만들어질때 1번만 
		 * 	키보드에 연결된다
		 *  필요에 따라 키보드 입력을 기다리는
		 *  nextInt() 메서드를 자유롭게 사용가능하다
		 *  
		 *  비용(Cost)적측면에서 input() method 보다는
		 *  다소 효율적이다
		 * 
		 */
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.print(num1);
		System.out.print(" / ");
		System.out.print(num2);
		System.out.print("=");
		System.out.print(num1 / num2);
	}
	
	// 뺄셈
	public void  substraction() {
	}
	
	
}
