package com.callor.oop;

import com.callor.oop.service.CartService;
import com.callor.oop.service.MenuService;
import com.callor.oop.service.impl.CartServiceImplV4;
import com.callor.oop.service.impl.MenuServiceImplV3;

public class CartEx_07 {

	public static void main(String[] args) {
		
		MenuService mService = new MenuServiceImplV3();
		CartService cService = new CartServiceImplV4();
		
		while(true) {
			mService.selectMenu();
			Integer menuItem = ((MenuServiceImplV3)mService).menuItem;
			if(menuItem == null) {
				break;
			} else if (menuItem == 1) {
				cService.inputCart();
			} else if(menuItem == 3) {
				cService.printCart();
			}
		}
		System.out.println("업무종료 야 퇴근이다!!!");
	}
	
}
