package com.callor.oop;

import com.callor.oop.service.impl.CartServiceV1;
import com.callor.oop.service.impl.CartServiceV2;

public class CartEx_01 {

	/*
	 * Cart Project에서 CartServiceV1을 사용하여
	 * cart 기능을 구현했다.
	 * 
	 * Cart Project를 사용하는 중에
	 * 		CartService의 기능을 업그레이드 해야할 일이
	 * 		발생했다
	 * 		CartServiceV1을 그대로 두고
	 * 		CartServiceV2를 새로 만들어
	 * 		기존의 기능을 업그레이드 하려고 한다.
	 */
	public static void main(String[] args) {
		// 1. CartServiceV1 사용
		CartServiceV1 csV1 = new CartServiceV1();
		csV1.input_cart();
		csV1.print_cart();
		
		// 2. CartServiceV2를 사용하자
		//	 CartV1을 사용하다가 CartV2로 업그레이드를하면
		//	 method를 호출하는 부분에서 
		//	 상당히 많은 코드 변경이 수행되어야 한다.
		//	 업그레이드를 위해 많은 코드 변경이 이루어지면
		//	 그 과정에서 오류가 발생할 확률이 매우 높아진다
		CartServiceV2 csV2 = new CartServiceV2();
		csV2.inputCart();
		csV2.printCart();
	}
}



