package com.callor.score.model;

/*
 * 학적부(학생정보)를 정보처리 하기 위해
 * 학생정보 데이터를 저장하기 위한 StudentVO 클래스 설계
 * 
 * 학생과 관련된 데이터는 종류가 매우 많다
 * 	학번, 이름, 전화번호, 주소, 학과, 학년, 반, 번호
 * 	부모님, 담임, 교실위치, 키, 몸무게, 종합성적, 
 * 	품행
 * 
 * 이 중에서 현재 프로젝트에서 꼭 필요한 데이터만 찾는다면
 * 	학번, 이름, 전화번호, 주소, 학과, 학년 만 필요하다
 * 	나머지도 있으면 좋겠지만 꼭 필요한 정보는 아닐것 같다
 * 
 */

public class StudentVO {
	// 추상화
	// 학생정보를 정보처리 하기 위해 꼭 필요한 데이터 목록을
	// 인스턴스 변수로 선언했다
	public String strNum;
	public String strName;
	public String strTel;
	public String strAddr;
	public String strDept;
	public int intGrade;

}




