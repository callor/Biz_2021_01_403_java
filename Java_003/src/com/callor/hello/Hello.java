package com.callor.hello;

public class Hello {
	/*
	 * main() method 라고 부른다
	 * Run(eclipse)를 했을때 꼭 필요한 코드
	 * 
	 * eclipse에서 Run을 했을때 발생하는 상황
	 * Hello.java 파일을 컴파일 : javac Hello.java
	 * Hello.class 파일이 생성되면
	 * java Hello 명령을 실행하여 코드를 컴퓨터에
	 * 주입하고 결과를 Console에 출력
	 * 
	 */
	public static void main(String args[]) {
		System.out.println("30 + 40 = " + (30+40));
		System.out.println("30 x 40 = " + 30 * 40);
		System.out.println("40 - 30 = " + (40 - 30));
		System.out.println("40 / 20 = " + 40 / 20);
		System.out.println("여러분 반갑습니다");
	
	}

}
