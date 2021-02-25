package com.callor.oop.exp;

public class Exception_03 {
	
	public static void main(String[] args) {
		
		int[] intNums = new int[3];
		try {
			intNums[3] = 100;			
		} catch (ArrayIndexOutOfBoundsException   e) {
			System.out.println("배열의 범위를 벗어났음");
		}
		
		
	}

}
