package com.callor.start.bool;


/*
 * Boolean algebra
 * 
 * (3x * 3) + (4x * 2) + (5x * 3)
 * A          B          C
 * A + B + C
 */
public class BoolAlge_01 {
	
	public static void main(String[] args) {
		
		boolean bYes = true; 	// 1
		boolean bNo = false; 	// 0
		
		// && : AND
		System.out.println(bYes && bNo);
		// ||(filter 기호) : OR
		System.out.println(bYes || bNo);
		
		// bYes1 OR bYes2
		// 1     +  0		= 1
		// 0	 +  1		= 1
		// 0	 +  0 		= 0
		// 1	 +  1		= 2(1이상은 무조건 true)
		
		// true  OR  true  == true
		// true  OR  false == true
		// false OR  true  == true
		// false OR  false == false
		
		// 1    *    1    == 1
		// true AND  true == true
		
		// 1    *   0
		// true AND false  == false
		
		// 0     *   1
		// false AND true  == false
		
		// 0     *   0
		// false AND false  == false

		System.out.println("====================");
		System.out.println("t && t : " + (true && true));
		System.out.println("t && f : " + (true && false));
		System.out.println("f && t : " + (false && true));
		System.out.println("f && f : " + (false && false));
		System.out.println("====================");
		System.out.println("t || t : " + (true || true));
		System.out.println("t || f : " + (true || false));
		System.out.println("f || t : " + (false || true));
		System.out.println("f || f : " + (false || false));
		System.out.println("====================");
		System.out.println("t && t : " + (true && true && true && true && true));
		
		
	}
	
	
	
	
	

}
