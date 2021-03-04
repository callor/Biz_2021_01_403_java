package com.callor.shop.service;

public interface CartServiceV2 extends CartService {

	public void saveCartToFile();
	public void loadCartFromFile();
	
}
