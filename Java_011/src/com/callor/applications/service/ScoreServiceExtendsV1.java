package com.callor.applications.service;

import java.util.Scanner;

/*
 * 클래스의 extends(확장, 상속)
 * 
 * ScoreServiceV4 : Parent(부모) 클래스
 * ScoreServiceExtendsV1 : child(자식) 클래스
 * 
 * 단순한 extends
 * 		부모 클래스에 정의된 모든 method를
 * 		코드한줄 추가, 수정 없이 그대로 사용할수 있다
 * 
 * 추가 extends
 * 		부모 클래스에 정의된 method와
 * 		새롭게 추가된 method가 있는
 * 		확장된 클래스의 생성
 */
public class ScoreServiceExtendsV1 
				extends ScoreServiceV4 {
	
	/*
	 * 문자열형변수 1개를 매개변수로 갖는 input() method
	 */
	public int input(String subject) {
		
		Scanner scan = new Scanner(System.in);
		
		int intScore = 0;
		while(true) {
			System.out.print( subject + " 점수 입력 >> ");
			intScore = scan.nextInt();
			
			if(intScore < 0 || intScore > 100) {
				System.out.println(subject + " 점수는 0 ~ 100 까지 입력");
			} else {
				break;
			}
			
			if(intScore < 0) {
				System.out.println(subject + " 점수는 0점 이상입력 !!");
			} else if(intScore > 100) {
				System.out.println(subject + " 점수는 100점 이하 입력!!");
			} else {
				break;
			}
		}
		// System.out.println("입력한 점수 : " + intScore);
		return intScore;
		
		
		// 호출한 코드에서
		// return 30; ==> int intKor에 30을 담아라
		// return 100; ==> int intKor에 100을 담아라
		
 		
	}
	
}




