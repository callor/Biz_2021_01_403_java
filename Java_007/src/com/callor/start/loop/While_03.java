package com.callor.start.loop;

public class While_03 {

	public static void main(String[] args) {
		
		int index = 0;
		while(true) {
			// 매우 불편한 코드
			if(index % 3 > 0) {
				System.out.println("3의 배수가 아님");
			}
			
			// 정상적인 코드
			if(++index % 3 == 0) {
				System.out.println(index + "는 3의 배수");
			} else {
				System.out.println(index + "는 3의 배수 아님");
			}
			
			if(index > 1000) {
				break;
			}
			
		}
		
	}
}
