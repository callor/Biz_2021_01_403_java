package com.callor.oop.exp;

import com.callor.oop.model.ProductVO;

public class Exception_03 {
	
	public static void main(String[] args) {
		
		ProductVO pVO = null;
		int[] intNums = new int[3];
		try {
			intNums[2] = 100; // exception 처리 완료			
			intNums[2] = Integer.valueOf("3");
			pVO.strDName = "야채참치";
		} catch(NullPointerException ep) {
			System.out.println("객체가 생성되지 않았는데"
					+ "사용하려고 시도함");
		} catch(NumberFormatException en) {
			System.out.println("문자열을 정수로 "
					+ "변환하는 과정에서 문제 발생");
		} catch (ArrayIndexOutOfBoundsException  e) {
			System.out.println("배열의 범위를 벗어났음");
		}
		
		
	}

}
