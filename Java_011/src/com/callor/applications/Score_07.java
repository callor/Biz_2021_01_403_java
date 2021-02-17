package com.callor.applications;

import com.callor.applications.service.ScoreServiceExtendsV1;

public class Score_07 {

	public static void main(String[] args) {

		ScoreServiceExtendsV1 scExV1 
				= new ScoreServiceExtendsV1();

//		int intKor = 99;
//		int intEng = 87;
//		int intMath = 66;
//		scExV1.print(intKor, intEng, intMath);
//		scExV1.input();
		
		System.out.println("=========================");
		System.out.println("빛고을 고교 성적처리 V1");
		System.out.println("-------------------------");
		
		/*
		 * 
		 * Random 클래스의 nextInt() method에게
		 * 정수 100을 파라메터로 전달하고
		 * 결과값을 num에 저장하라
		 * int num = random.nextInt(100);
		 */
		/*
		 * Score...Ext...V1 클래스의 input() method에게
		 * 국어 문자열을 파라메터로 전달하고
		 * 연산(??)을 수행한 후
		 * return 된 값을 intKor 변수에 저장하라
		 */
		int intKor = scExV1.input("국어");
//		int intEng = scExV1.input("영어");
//		int intMath = scExV1.input("수학");
		
		
	}

}
