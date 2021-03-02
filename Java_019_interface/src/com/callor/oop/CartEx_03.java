package com.callor.oop;

import com.callor.oop.service.CartService;
import com.callor.oop.service.impl.CartServiceImplV2;

public class CartEx_03 {
	
	public static void main(String[] args) {
		
		CartService cServ = new CartServiceImplV2();
		cServ.inputCart();
		cServ.printCart();
		
	}

}
