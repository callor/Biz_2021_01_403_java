package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartList_02 {

	public static void main(String[] args) {
		
		CartVO cartVO = new CartVO();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("======================");
		System.out.println("쇼핑카트 테스트");
		System.out.println("----------------------");
		
		System.out.print("구매자>> ");
		String userName = scan.nextLine();
		cartVO.setCartUserName(userName);
				
		System.out.print("상품>> ");
		String pName = scan.nextLine();
		cartVO.setCartPName(pName);
		
		System.out.print("가격>> ");
		
		// 3000 이라고 입력하면 "3000"으로 입력되어
		// 문자열이다
		String price = scan.nextLine();

		// "3000" 문자열형 숫자를 정수 3000으로 변경하여
		// intPrice 변수에 저장
		int intPrice = Integer.valueOf(price);
		cartVO.setCartPrice(intPrice);
		
		String strPName = "홍길동";
		
		// cartVO를 cartList에 추가
	}
}
