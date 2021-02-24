package com.callor.score.service;

public class ScoreServiceV1 {

	/*
	 * 3과목의 점수를 전달받아서
	 * 합산을 하고 결과를 return 하는 method
	 */
	public int scoreSum(int intKor, int intEng, int intMath) {
		int sum = intKor;
		sum += intEng;
		sum += intMath;
		return sum;
	}
	/*
	 * 총점 점수를 전달받고
	 * 과목수(과목수 3개라고 가정)로 나누어 return
	 */
	public float scoreAvg(int intSum) {
		return (float)intSum / 3;
	}
	
	/* 
	 * 한 학생의 성적 데이터를 한줄에 출력
	 */
	public void print(String strName,
						int intKor, 
						int intEng,
						int intMath,
						int intSum,
						float floatAvg) {
		
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.2f\n",
				strName,
				intKor,intEng, intMath, intSum, 
				floatAvg);
	}
	
	/*
	 * 배열을 매개변수로 받는 print() method
	 */
	public void print(
			String[] strName,
			int[] intKor,
			int[] intEng,
			int[] intMath,
			int[] intSum,
			float[] floatAvg) {
		
		System.out.println("===========================");
		System.out.println("이름\t국어..\t총점\t평균");
		System.out.println("---------------------------");
		for(int i = 0 ; i < strName.length ; i++) {
			System.out.printf("%s\t%d..\t%d\t%3.2f\n",
					strName[i],
					intKor[i],
					intSum[i],
					floatAvg[i]);
		}
		
	}
	
	
}








