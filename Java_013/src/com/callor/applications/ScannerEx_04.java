package com.callor.applications;

import java.util.Scanner;
/*
 * Scanner 클래스를 사용하여 키보드의 입력을 받아
 * 연산을 수행하려고 할때
 * 문자열과 숫자(정수, 실수)를 병행하여 입력받으려 하면
 * nextInt(), nextLine()을 같이 사용한다.
 * 그런데, 이 두개의 메서드를 사용하는 과정에서
 * 입력을 건너뛰는 bug가 발생한다.
 * 해결책으로 특정한 부분에 nextLine() 한번더 적용하여
 * 사용하는 방법 있지만
 * 
 * 더 좋은 솔루션은
 * 문자열이든, 숫자이든 모든 값을 nextLine()로 받고
 * 숫자가 필요한 부분에서는 
 * 		문자열형숫자를 숫자(정수, 실수)로
 * 바꾸어 사용하는 것이 좋다
 */
public class ScannerEx_04 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		System.out.print("국어 >> ");
		String strKor = scan.nextLine();
		
		System.out.print("영어 >> ");
		String strEng = scan.nextLine();
		
		int intKor = Integer.valueOf(strKor);
		int intEng = Integer.valueOf(strEng);
		
		System.out.println("합계 : " 
					+ (intKor + intEng));
		
		
		
		
	}

}
