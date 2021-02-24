package com.callor.score;

import java.util.Random;

public class Score_011 {

	public static void main(String[] args) {

		String[] strName = {"홍길동","이몽룡","성춘향","장녹수","임꺽정"};
		String[] strSubject = {"국어","영어","수학","음악","미술"};

		// 1차원 배열: 배열을 단순히 나열식으로 만드는 것
		//		연속된 위치에 데이터를 저장하기
		// 2차원 배열 : 배열을 table(표) 형식으로 만들어서
		// 		가로세로 위치에 데이터를 저장하기
		
		// 학생수 만큼 세로방향으로 리스트를 만들고
		// 각 리스트는 과목수만큼 배열을 갖는다
		// int[][] intScore = int[5][4] ;
		int[][] intScore 
			= new int[strName.length][strSubject.length];
		
		Random rnd = new Random();
		for(int na = 0 ; na < strName.length ; na++) {
			for(int sb = 0 ; sb < strSubject.length ; sb ++  ) {
				intScore[na][sb] = rnd.nextInt(100) + 1;
			}
		}
		
		int intSum[] = new int[strName.length];
		
		// 총점구하기
		for(int na = 0 ; na < strName.length ; na++) {
			
			intSum[na] = 0;
			for(int sb = 0 ; sb < strSubject.length ; sb++) {
				intSum[na] += intScore[na][sb];
			}
		}
		
	}

}
