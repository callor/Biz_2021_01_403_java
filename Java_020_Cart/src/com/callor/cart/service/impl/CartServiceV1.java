package com.callor.cart.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.cart.model.CartVO;
import com.callor.cart.service.CartService;

public class CartServiceV1 implements CartService{

	private List<CartVO> cartList;
	private Scanner scan;
	public CartServiceV1() {
		cartList = new ArrayList<CartVO>();
		scan = new Scanner(System.in);
	}
	
	@Override
	public void inputCart() {
		System.out.println("====================");
		System.out.println("장바구니에 넣기");
		System.out.println("--------------------");
		System.out.print("구매자>> ");
		String strUserName = scan.nextLine();
		
		int intQty = 0;
		while(true) {
			System.out.print("수량>> ");
			String strQty = scan.nextLine();
			try {
				intQty = Integer.valueOf(strQty);
				if(intQty < 1) {
					System.out.println("수량은 1이상");
				} else {
					break;	
				}
			} catch (Exception e) {
				System.out.println("수량은 숫자로만!!!");
			}
		}
		CartVO cartVO = new CartVO();
		cartVO.setUserName(strUserName);
		cartVO.setQty(intQty);
		
		cartList.add(cartVO);
	}

	@Override
	public void printCart() {
		int nSize = cartList.size();
		for(int i = 0 ; i < nSize ; i++) {
			System.out.println(cartList.get(i).toString());
		}
	}
	
	

}
