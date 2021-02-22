package com.callor.applications;

import com.callor.applications.service.ScoreServiceV1;

public class Score_07 {
	
	public static void main(String[] args) {
		
		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		ssV1.makeNamesAndArrayInit();
		ssV1.makeScore();
		ssV1.makeSum();
		ssV1.makeAvg();
		ssV1.print();
		
	}

}
