package com.callor.hello;

public class HelloPrint {

	public static void main(String[] args) {

		/*
		 * 컴파일(소스코드 -> 기계어코드)
		 * 숫자 30을 기억장치(메모리) 어딘가에 보관
		 * 숫자 40을 기억장치 어딘가에 보관 
		 * 어딘가 보관된 숫자 30을 CPU로 이동
		 * 어딘가 보관된 숫자 40을 CPU로 이동
		 * CPU의 연산장치를 통해 30과 40을 덧셈
		 * 결과 70을 어딘가에 보관
		 * 어딘가에 보관된 결과 70을
		 * 운영체제(System)를 통하여 Console에
		 * 출력(out.println)하라
		 */
		System.out.println(30 + 40);
		
		/*
		 * 어딘가에 문자열 개수만큼
		 * 기억장치를 예약하고
		 * 그곳에 우,리,나,라 문자를
		 * 한글자씩 보관한다.
		 * 문자 '우'가 저장된 주소를
		 * System.ount.println()에게 알려준다
		 * java는 운영체제에게
		 * 각각 문자 한개씩을 읽어서 전달하고
		 * Console에 표시하도록 한다. 
		 */
		System.out.println("우리나라");
		
		

	}

}
