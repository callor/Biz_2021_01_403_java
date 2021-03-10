package com.callor.student;

public class Ex_05 {
	
	public static void main(String[] args) {
		
		int num1 = 100;
		int num2 = 200;
		
		// 1. Call 클래스가 없어서 발생하는 오류
		Call call = new Call();
		
		// 2. add() method가 없어서 발생하는 오류
		// 3. 매개변수 설정이 없어서 발생하는 오류
		// 4. return type void 이어서 발생하는 오류
		// 5. method의 return 명령문이 없어서 발생하는 오류
		int sum = call.add(num1, num2);
		System.out.println(sum);
		
	}

}
