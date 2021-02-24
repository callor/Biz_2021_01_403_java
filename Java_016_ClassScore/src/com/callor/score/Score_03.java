package com.callor.score;

import java.util.Random;

import com.callor.score.model.ScoreVO;

public class Score_03 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		ScoreVO 홍길동성적 = new ScoreVO();
		홍길동성적.strName = "홍길동";
		홍길동성적.intKor = 90;
		홍길동성적.intEng = 88;
		홍길동성적.intMath = 100;
		
		ScoreVO 이몽룡성적 = new ScoreVO();
		이몽룡성적.strName = "이몽룡";
		이몽룡성적.intKor = 70;
		이몽룡성적.intEng = 60;
		이몽룡성적.intMath = 75;
		
		홍길동성적.intSum =
				홍길동성적.intKor
				+ 홍길동성적.intEng
				+ 홍길동성적.intMath;
		
		홍길동성적.floatAvg = (float)홍길동성적.intSum / 3;
		

		// 홍길동과 이몽롱 성적의 총점을 출력하라
		System.out.println(홍길동성적.intSum);
		System.out.println(이몽룡성적.intSum);
		
		int intKor1 = 90;
		int intKor2 = 100;
		int intKor3 = 88;
		
		// System.out.println(성춘향성적.intSum);
		
		/*
		 * ScoreVO(Value Object, VO 클래스)
		 * 정보처리를 수행하는 데이터들을
		 * 서로 그룹으로 묶어서 한꺼번에
		 * 관리할수 있도록 만들어 놓은 클래스
		 * 
		 * 객체 : 정보처리를 수행하는 최소한의 데이터 그룹
		 * 학생이름, 국어, 영어, 수학, 총점, 평균 데이터를
		 * 하나의 그룹을 묶어서 처리하겠다
		 * 
		 */
		
		
		
		
		
	}
	

}
