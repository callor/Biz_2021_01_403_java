package com.callor.var;

public class Var_02 {

	public static void main(String[] args) {
		
		// 코드가 번역되어 실행되는 순서에 의해
		// 아직 intNum1변수가 선언되지 않았는데
		// 읽으려고 시도했기 때문에 오류 발생
		// System.out.println(intNum1);
		
		// 변수가 선언되기 전에 변수에 
		// 값을 저장하려고 시도했기 때문에
		// 오류 발생
		// intNum1 = 0;
		
		int intNum1 = 30;
		System.out.println("int intNum1 = 30; " + intNum1);   
		
		intNum1 = 50;
		System.out.println("intNum1 = 50; " + intNum1);
		
		// 숫자(정수,실수)형 변수에
		// 0을 저장하는 것은 변수를 clear 하라는 것이다
		intNum1 = 0;
		System.out.println("intNum1 = 0; " + intNum1);     
		
		// 정수형변수 intNum2를 선언 "만" 하라
		int intNum2;
		intNum2 = 30;
		
		// 만약 25번 코드가 없이
		// 24번 코드에서 선언만된 변수를 읽으려고 시도하면
		// 오류가 발생한다.
		// 선언만 된 변수에는 어떤 값이 저장되어 있는지
		// 알수 없기 때문에 보안에 매우 취약해진다
		System.out.println(intNum2);
		
		/*
		 * 만약 아직 변수에 저장될 값이 정해지지 않은경우
		 * 변수를 선언하고 clear값을 저장해 두자
		 * 
		 * 변수의 clear
		 * 선언할때 = 0 : 초기화라고 한다
		 * 저장할때 = 0 : 변수를 clear 한다 라고 한다
		 */
		int intNum3 = 0;
		
		/*
		 * num1 = 30
		 * num2 = 40
		 * 
		 * numl = 50
		 * 
		 * print(num1 + num2)
		 *
		 * 
		 * 
		 * int num1 = 30
		 * int num2 = 40
		 * 
		 * numl = 50
		 * 
		 * print(num1 + num2)
		 * 
		 * 
		 */
		
		
		
		
	
	}
	
}
