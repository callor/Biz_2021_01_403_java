package com.callor.oop.model;

public class ScoreVO {
	
	public String strName;
	private int intKor = -1;
	public int intEng;
	public int intMath;

	public int intSum;
	public float loatAvg;
	
	/*
	 * 국어점수(intKor)를 저장할 인스턴스 변수를
	 * private 로 선언하여 직접 접근할수 없도록 만든다
	 * 
	 * 국어점수(intKor) 인스턴스변수에
	 * 간접적으로 값을 저장하는 setIntKor() method를 선언
	 * 
	 * setIntKor() method는 점수를 문자열로 받아서
	 * 정수로 변경한 다음 범위 검사를 수행하고
	 * 유효성통과(정상적인 점수일경우)를 한 경우만
	 * 국어 인스턴스변수(this.intKor)에 저장한다.
	 * 
	 * 만약 점수가 잘못되어 유효성검사를 통과하지 못하면
	 * 국어점수는 -1로 세팅되어 있을 것이다.
	 */
	public void setIntKor(String strKor) {
		try {
			int intKor = Integer.valueOf(strKor);	
			if(intKor >= 50 && intKor <= 100) {
				this.intKor = intKor;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
}
