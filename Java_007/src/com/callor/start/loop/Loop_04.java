package com.callor.start.loop;

public class Loop_04 {

	public static void main(String args[]) {
		
		int intStart = 5;
		int intEnd = 75;
		
		int intSum = 0;
		for(int i = intStart ; i < intEnd ; i++) {
			// int num1 = i + 1;
			// intSum += num1;
			intSum += (i + 1);
		}
		System.out.print(intStart + 1);
		System.out.print(" 부터 ");
		System.out.print(intEnd);
		System.out.print(" 까지의 덧셈 : ");
		System.out.println(intSum);
	
	}
	
}
