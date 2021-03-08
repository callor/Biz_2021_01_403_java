package com.callor.score;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sort_03 {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		Random rnd = new Random();
		
		for(int i = 0 ; i < 10 ; i++) {
			Integer num = rnd.nextInt(100) + 1;
			intList.add(num);
		}
		System.out.println(intList.toString());
		int nSize = intList.size();
		for(int i = 0 ; i < nSize ; i++) {
			for(int j = i + 1; j < nSize ; j++) {
				if(intList.get(i) > intList.get(j)) {
					Integer temp = intList.get(i);
					intList.set(i, intList.get(j));
					intList.set(j, temp);
				}
			}
		}
		System.out.println(intList.toString());
		
		
		
		
		
		
		
	}
	
}
