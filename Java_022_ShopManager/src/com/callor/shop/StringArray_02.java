package com.callor.shop;

public class StringArray_02 {

	public static void main(String[] args) {
		
		String strCart ="홍길동:초코파이:10:1000";
		
		/*
		 * 원래문자열.split(구분자문자열)
		 * 
		 * 	원래문자열을 구분자문자열을 기준으로 나누고
		 * 	문자열 배열로 만들어 return 한다
		 */
		String[] cartList = strCart.split(":");// {"홍길동","초코파이"}
		
		for(String s : cartList) {
			System.out.println(s);
		}
		
		/*
		 * strCart 에 담긴 문자열을
		 * 글자 단위로 잘라서 배열에 담아 달라
		 */
		cartList = strCart.split("");
		for(String s : cartList) {
			System.out.println(s);
		}
		
		// 지정된 형식(폼)으로 문자열을 만들어서
		// return 해 주는 method
		strCart = String.format("%d:%d:%d", 10,20,30);
		System.out.println(strCart);
		
		// strCart변수에 담긴 문자열중에
		// 20 이라는 문자열이 있으면
		// 대한민국 이라는 문자열로 바꾸어서 
		// return
		strCart = strCart.replace("20", "대한민국");
		
		System.out.println(strCart);
		
		String strName = "홍 길동   ";
		System.out.println(strName);
		
		// 문자열중에 공백을 모두 제거하기
		strName = strName.replace(" ","");
		System.out.println(strName);
		
		strName = "나는 자랑스러운 태극기 앞에";
		String strFlag = strName.substring(9);
		
		System.out.println(strFlag);
		
		strFlag = strName.substring(9,12);
		System.out.println(strFlag);
		
		
		
		
		
		
	}
}
