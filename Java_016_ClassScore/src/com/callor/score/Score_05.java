package com.callor.score;

import com.callor.score.model.ScoreVO;

public class Score_05 {
	
	public static void main(String[] args) {
		
		int num ;
		// 선언만 된 변수는 읽기 불가능하다
		// 숫자일경우 최소한 0 값이라도 저장해야 한다.
		num = 0;
		System.out.println(num);
		
		// ScoreVO 클래스를 사용하여 
		// 		scoreVO 객체(인스턴스) 생성
		ScoreVO scoreVO = new ScoreVO();
		
		System.out.println(scoreVO.intKor);
		
		// VO 클래스를 사용하여 객체를 생성하면
		// VO 클래스에 선언된 public 인스턴스 변수들이
		// 자동으로 선언 및 생성되어 사용할 준비가 된다
		scoreVO.strName = "홍길동";
		scoreVO.intKor = 90;
		scoreVO.intEng = 100;
		scoreVO.intMath = 88;
		
		/*
		 * 클래스로 객체를 선언만 한 상태에서는
		 * 아무런 것도 사용할수 없다.
		 * 반드시 생성을 해 주어야 한다.
		 */
		ScoreVO scoreVO1;
		scoreVO1 = new ScoreVO();
		scoreVO1.intKor = 100;
		
		// ScoreVO 클래스를 사용하여 scoreVO2 객체 선언
		//			        객체를 인스턴스로 생성(초기화)
		// java에서는 new ScoreVO() 코드를
		//		클래스의 "생성자 (method) 호출" 
		//		이라고 부른다
		// ScoreVO 클래스를 scoreVO2 객체로 선언하고
		// 		생성자를 호출하여 인스턴스로 만들었다
		ScoreVO  scoreVO2 = new ScoreVO();
		
		
		
	}

}
