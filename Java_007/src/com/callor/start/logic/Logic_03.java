package com.callor.start.logic;

/*
 * 논리연산은
 * 코드가 실행되는 과정에서
 * 중간에 연산 등을 통해 생성된 값(변수에 저장된)에 따라
 * 코드의 흐름을 달리, 전환하는
 * 코드 흐름변경
 */

public class Logic_03 {

	public static void main(String[] args) {
		
		/*
		 *  boolean
		 *  true, false 의 값을 갖는 데이터형
		 *  boolean type, 블린형(타입)
		 */
		int num1 = 3;
		
		// boolean 값에 따라 코드의 흐름을 제어(변경 등)
		// 명령어
		
		// 만약 num1 변수에 담긴 값이
		// 10보다 크면
		// {  }의 코드를 실행하고
		// 그렇지 않으면 무시하라
		if(num1 > 10) {
			System.out.println(num1 + " 은 10보다 크다");
		}
		
		if(num1 * 5 > 10 ) {
			System.out.println(num1 * 5 + " 는 10보다 크다");
		}
		
		
		
	}
	
}
