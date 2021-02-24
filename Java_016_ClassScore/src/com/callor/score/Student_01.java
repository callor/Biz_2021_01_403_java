package com.callor.score;

import com.callor.score.model.StudentVO;

public class Student_01 {
	
	public static void main(String[] args) {
		
		String[] strNum = new String[100];
		String[] strName = new String[100];
		
		// StudentVO 클래스를 100의 배열로 선언만
		StudentVO[] student = new StudentVO[100];
		
		// 클래스로 선언한 객체 배열은 각각 요소를
		// 클래스의 생성자를 호출하여 인스턴스로
		// 만들어주는 절차가 "반드시" 필요하다
		// 이 절차를 생략하면 NullpointerException이
		//		발생하고 코드 실행이 중단된다.
		student[0] = new StudentVO();
		student[1] = new StudentVO();
		student[2] = new StudentVO();
		
		// 배열로 선언된 객체배열을 사용할 수 있도록
		// 모두 초기화 하기
		for(int i = 0 ; i < student.length ; i++) {
			student[i] = new StudentVO();
		}
		
		student[0].strName = "홍길동";
		student[1].strName = "이몽룡";
		student[2].strName = "성춘향";
		
		
		
		
	}
	

}
