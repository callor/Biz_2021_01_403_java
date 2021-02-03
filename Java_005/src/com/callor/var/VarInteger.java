package com.callor.var;

/*
 * java에서 정수를 표현하는 키워드
 * 		Integer, int
 * 		Long, long
 * 
 * 실수를 표현한 키워드
 * 단정도 실수 : Float, float
 * 배정도 실수 : Double, double
 * 
 *  var, Integer는 java의 키워드(명령어)이다
 *  이런 단어는 단독으로 class 명으로 사용 불가
 *  키워드를 연상하는 클래스를 만들고 싶을때는
 *  두개 이상의 단어를 조합하여 이름을 만든다
 *  
 */
public class VarInteger {
	
	public static void main(String args[]) {

		/*
		 * 정수형 변수 num1을 선언하고
		 * 		값 25를 저장하라
		 * 
		 * 정수 25를 기억장소의 
		 * 		어딘가에 저장(보관)하라
		 * 그리고, 그 저장소에
		 * 		num1이라고 이름표를 붙여라
		 * 단, 그 저장소에는
		 * 		정수 숫자만 저장할수 있도록 하라
		 */
		int num1 = 25;
		int num2 = 55;
		
		// int num3 = 30.0;
		
		System.out.println(num1 + num2);
		System.out.println(num1 * num2);
		System.out.println(num2 / num1);
		System.out.println(num2 - num1);
		System.out.println(num2 % num1);
	
	}

}
