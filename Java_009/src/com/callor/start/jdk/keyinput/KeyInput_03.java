package com.callor.start.jdk.keyinput;

import java.util.Random;
import java.util.Scanner;

public class KeyInput_03 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		
		int num1 = rnd.nextInt(100) + 1;
		
		System.out.print("숫자입력 >> ");
		int keyNum = scan.nextInt();
		
		// 1. keyNum > num1 이냐?
		//		맞으면 "큰값" 표시하고 종료
		if(keyNum > num1) {
			System.out.println("큰값");
			
		// 2. 그렇지 않으면 keyNum < num1 이냐?
		//  	맞으면 "작은값" 표시하고 죵료
		} else if(keyNum < num1) {
			System.out.println("작은값");
			
		// 3. 그렇지 않으면 KeyNum == num1 이냐?
		// 		맞으면 "같다" 표시하고 종료
		} else if(keyNum == num1) {
			System.out.println("같음");
		}
		
		
		
		
		
	}

}
