package com.callor.applications;

import com.callor.applications.service.ScoreServiceV1;

public class Score_06 {

	public static void main(String[] args) {
		
		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		ssV1.init();
		ssV1.inputNames();
		ssV1.inputScore();
		ssV1.print();
		
	}
	
}
