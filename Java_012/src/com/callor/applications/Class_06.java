package com.callor.applications;

import com.callor.applications.service.ClassServiceV4;

public class Class_06 {

	public static void main(String[] args) {
		ClassServiceV4 csV4 = new ClassServiceV4();
		// result() method가 return 한 값을 출력
		System.out.println(csV4.result());
		
		// result() method가 return 한 값을 변수에 저장
		int result = csV4.result();
		System.out.println(result);
		
		
		/*
		 * method의 return type이 void 일경우
		 * 단독으로 호출만 할수 있다.
		 * print() 명령문에 포함하거나
		 * 변수에 값을 할당 할수 없다.
		 * 		= 오른쪽에 있을 수 없다.
		 */
		csV4.print();
		// System.out.println(csV4.print());
		// result = csV4.print();
		
	}
	
}
