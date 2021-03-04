package com.callor.shop;

import com.callor.shop.service.CartService;
import com.callor.shop.service.MenuService;
import com.callor.shop.service.impl.CartServiceImplV1;
import com.callor.shop.service.impl.MenuServiceImplV1;
import com.callor.shop.values.Values;

public class CartEx_01 {

	public static void main(String[] args) {

		// 클래스로 선언, 클래스로 생성
		MenuServiceImplV1 mS = new MenuServiceImplV1();
		
		// 인터페이스로 선언, 클래스로 생성
		// 인터페이스를 implements 하여 작성된 클래스는
		// 인터페이스로 선언을 하자
		// 코드 업그레이드가 조금 쉬워진다
		MenuService mService = new MenuServiceImplV1();
		CartService cService = new CartServiceImplV1();
		
		while(true) {
			Integer menuItem = mService.selectMenu();
			if(menuItem == null) { // 널값 : 아무것도 아닌값
				break;
			} else if (menuItem == Values.MENU_INPUT) {
				// System.out.println("장바구니 추가");
				cService.inputCart();
			} else if (menuItem == Values.MENU_ALL_LIST) {
				// system.out.println("장바구니 리스트 보기");
				cService.printAllCart();
			} else if (menuItem == Values.MENU_USER_LIST) {
				// System.out.println("구매자별 리스트 보기");
				cService.printUserCart();
			}
		}
		System.out.println("업무종료!! 야 퇴근이다!!");
		
		
		
		
	}

}



