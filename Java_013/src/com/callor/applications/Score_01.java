package com.callor.applications;

import com.callor.applications.service.ScoreServiceV1;

public class Score_01 {

	public static void main(String[] args) {

		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		
		// method return값을 변수에 담기(저장)하려면
		// method return type이 void가 아니어야 한다.
		// Score_S_V1의 input() method는 
		// return type이 void(형, type) 이다
		// 따라서 아래 코드처럼 사용할수 없다
		// int num = ssV1.input();
		ssV1.input();
				
		ssV1.sum();
		ssV1.avg();
		
		ssV1.print();
		
	}

}
