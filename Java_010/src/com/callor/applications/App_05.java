package com.callor.applications;

import com.callor.applications.myclass.MyGuGuDan;

public class App_05 {

	public static void main(String[] args) {
		
		/*
		 * 키보드에서 숫자를 입력받고
		 * 구구단을 출력하기 위하여
		 * MyGuGuDan 클래스를 사용하여
		 * 		myGu 객체를 선언 및 초기화 하고
		 */
		MyGuGuDan myGu = new MyGuGuDan();
		
		/*
		 * while(true) : 무한반복문 내에서
		 * 		gugu() method를 호출하여
		 * 구구단 계산을 무한반복하여 
		 * 		실행하는 효과를 낸다
		 */
		while(true) {
			myGu.gugu();
		}
	}
	
}
