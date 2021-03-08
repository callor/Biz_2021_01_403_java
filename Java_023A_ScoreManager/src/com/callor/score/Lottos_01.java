package com.callor.score;

import java.util.Random;

public class Lottos_01 {

	public static void main(String[] args) {
		
		int[] nums = new int[45];
		for(int i = 0 ; i < 45 ; i++) {
			nums[i] = i + 1;
		}
		
		Random rnd = new Random();
		for(int i = 0 ; i < 1000 ; i++) {
			int num1 = rnd.nextInt(45);
			int num2 = rnd.nextInt(45);
			
			int temp = nums[num1];
			nums[num1] = nums[num2];
			nums[num2] = temp;
		}
		
		int lottos[] = new int[6];
		for(int i = 0 ; i < 6 ;i++) {
			lottos[i] = nums[i];
		}
		for(int n : lottos) {
			System.out.print(n + ","); 
		}
		System.out.println();
		
		for(int i = 0 ; i < lottos.length ; i++) {
			for(int j = i + 1; j < lottos.length ; j++) {
				if(lottos[i] > lottos[j]) {
					int temp = lottos[i];
					lottos[i] = lottos[j];
					lottos[j] = temp;
				}
			}
		}
		for(int n : lottos) {
			System.out.print(n + ",");
		}
		
		
	}
	
	
}
