package com.callor.oop;

import java.util.ArrayList;
import java.util.List;

import com.callor.oop.model.CartVO;

public class CartList_01 {

	public static void main(String[] args) {

		// CartVO 를 여러개 list로 담을 객체 생성 
		List<CartVO> cartList = new ArrayList<CartVO>();
		
		// cart를 1개 생성하고 데이터 저장
		CartVO cartVO = new CartVO();
		cartVO.setCartUserName("홍길동");
		cartVO.setCartPName("초코파이");
		cartVO.setCartPrice(1000);
		cartVO.setCartQty(10);

		// 카트리스트에 추가
		cartList.add(cartVO);
		
		// 또 하나의 상품을 준비
		cartVO = new CartVO();
		cartVO.setCartPName("홍길동");
		cartVO.setCartPName("칠성사이다");
		cartVO.setCartPrice(2500);
		cartVO.setCartQty(1);
		
		// 준비된 상품 카트리스테 추가
		cartList.add(cartVO);
		
		//== 카트에 2개 상품을 저장
		// 카트 리스트를 출력
		System.out.println("===================");
		System.out.println("장바구니");
		System.out.println("-------------------");
		
		cartVO = cartList.get(0);
		System.out.printf("%s\t%s\t%d\t%d\n",
				cartVO.getCartPName(),
				cartVO.getCartPName(),
				cartVO.getCartPrice(),
				cartVO.getCartQty());

		cartVO = cartList.get(1);
		System.out.printf("%s\t%s\t%d\t%d\n",
				cartVO.getCartPName(),
				cartVO.getCartPName(),
				cartVO.getCartPrice(),
				cartVO.getCartQty());
		
		for(int i = 0; i < 2 ; i++) {
			cartVO = cartList.get(i);
			System.out.printf("%s\t%s\t%d\t%d\n",
					cartVO.getCartPName(),
					cartVO.getCartPName(),
					cartVO.getCartPrice(),
					cartVO.getCartQty());
		}

	
	}

}
