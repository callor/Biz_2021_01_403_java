package com.callor.applications;

public class Score_04 {
	
	public static void main(String[] args) {
		
		int intKor_1 = 0;
		int intKor_2 = 0;
		int intKor_3 = 0;
		int intKor_4 = 0;
		int intKor_5 = 0;
		
		// 배열선언하기
		// 변수선언키워드에 [] 표식을 부착한다
		// = new 키워드[개수] 형식으로 개수를 선언한다
		
		// strName 변수를 5개 선언하라 하는 것과 유사
		String[] strName = new String[5];
		// strName[0] 에서
		// [0]의 의미
		// strName 변수 그룹에서 0번째 위치
		// strName[0] = "홍길동"
		//		strName 배열변수의 0번째 주소에
		//		홍길동 문자열을 저장하라
		strName[0] = "홍길동";
		strName[1] = "이몽룡";
		strName[2] = "성춘향";
		strName[3] = "장녹수";
		strName[4] = "임꺽정";
		
		// intKor 변수를 5개 선언하라 하는 것과 유사
		int[] intKor = new int[5];
		intKor[0] = 90;
		intKor[1] = 88;
		intKor[2] = 65;
		intKor[3] = 92;
		intKor[4] = 78;
		
		System.out.printf("%s\t%d\n"
					,strName[0], intKor[0]);
		System.out.printf("%s\t%d\n"
				,strName[1], intKor[1]);
		System.out.printf("%s\t%d\n"
				,strName[2], intKor[2]);
		System.out.printf("%s\t%d\n"
				,strName[3], intKor[3]);
		System.out.printf("%s\t%d\n"
				,strName[4], intKor[4]);
		
		System.out.println("=========================");
		for(int index = 0 ; index < 5 ; index ++) {
			System.out.printf("%s\t%d\n",
					strName[index],
					intKor[index]);			
		}
		
		int[] intEng = new int[5];
		int[] intMath = new int[5];
		int[] intSum = new int[5];
		
	}

}
