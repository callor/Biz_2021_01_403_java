package com.callor.start.loop;

public class While_02 {

	public static void main(String[] args) {
		
		int count = 0;
		
		while(++count < 10) {
			System.out.println(count);
		}
		
		count = 0;
		while(count < 10) {
			System.out.println(++count);
		}
		
		// 1
		System.out.println(count++);
		// 풀어쓰면
		System.out.println(count);
		count += 1;
		
		// 2
		System.out.println(++count);
		// 풀어쓰면
		count++;
		System.out.println(count);
		
		
		
	}
	
}
