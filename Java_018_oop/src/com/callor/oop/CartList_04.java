package com.callor.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartList_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<CartVO> cartList = new ArrayList<CartVO>();
		CartVO cartVO;
		
		for(int i = 0 ; i < 3 ; i++) {
			System.out.print("구매자이름 >> ");
			String strName = scan.nextLine();
			/*
			 * VO 객체에 데이터를 담아서 List에 추가할때는
			 * 반드시 VO 객체를 
			 * 		그때그때 다시 생성해 주어야 한다
			 * 
			 * VO 객체를 다시 생성하지 않고 리스트를 추하면
			 * 	가장 마지막에 저장한 데이터로 모든 리스트가
			 * 	같아져 버린다.
			 */
			cartVO = new CartVO();
			cartVO.setCartUserName(strName);
			cartList.add(cartVO);
		}
	}
	
}
