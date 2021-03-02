package com.callor.oop;

import com.callor.oop.service.CartService;
import com.callor.oop.service.impl.CartServiceImplV3;

public class CartEx_04 {
	
	public static void main(String[] args) {
		CartService cService = new CartServiceImplV3();
		cService.inputCart();
		cService.printCart();
	}

}






