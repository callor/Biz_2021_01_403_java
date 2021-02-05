package com.callor.start.logic;

/*
 * 화폐매수 계산
 * 
 * 4789800
 * 오만원권 : 95매
 * 만원권 	: 3매 : 오만원 / 5
 * 5천원 	: 1매 : 만원  / 2
 * 천원 	: 4매 : 5천원 / 5
 * 오백원 	: 1개 : 천원  /2
 * 백원 	: 3개 : 오백원 / 5
 */
public class Logic_05 {

	public static void main(String[] args) {
		
		// 5만원권 계산
		int pay = 4_789_800;
		int paper = 50_000;
		
		// 정수를 정수로 나누는 연산을 했을 경우
		// 결과도 정수(몫)으로 나타는 연산 규칙을
		// 활용한 결과
		int count = pay / paper;
		System.out.println( paper + "원권 : "+count );
		
		// 1만원권 계산
		// pay 에서 5만원권 금액만큼 제외하고
		// 1만원권 매수를 계산한다.
		pay -= (paper * count); // 5만원권 제외금액
		paper = paper / 5;
		count = pay / paper;
		System.out.println(paper + "원권 : " + count);
		
		// 5천원권 계산
		// pay에서 1만원 금액을 제외한 금액
		pay -= (paper * count);
		paper /= 2;
		count = pay / paper;
		System.out.println(paper + "원권 : " + count);
		
		
	}
	
	
	
	
}
