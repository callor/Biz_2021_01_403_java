package com.callor.applications;

/*
 * System.out.print**() method
 */
public class Class_05 {

	public static void main(String[] args) {
		
		/*
		 * ()안의 값, 변수값, 연산식의결과를 Console에 출력
		 * 출력한 후 자동 줄바꿈을 하여 이후 출력되는
		 * 		결과가 다음줄에 출력되로록 하는 기능
		 * ()안에 아무것도 없으면 빈줄만 출력
		 */
		System.out.println();
		System.out.println(30 + 40);
		System.out.println("대한민국");
		
		/*
		 * ()안의 값, 변수값, 연산식 등을 Console에 표시
		 * 단, 출력후 줄바꿈을 하지 않아
		 * 이후 출력되는 결과가 이어서(옆으로) 출력
		 * 또한, ()안의 내용을 생략할 수 없다.
		 */
		System.out.print(30 + 40);
		System.out.print("대한민국");
		
		/*
		 * print formatting
		 * 문자열을 형식(양식)에 맞추어 출력하고 할때
		 * %d : 정수숫자
		 * %s : 문자열
		 * %f : 실수형
		 * \t : tab 특수문자( 8칸 간격 띄우기 )
		 * \n : 줄바꿈 특수문자( println과 유사한 효과 )
		 */
		System.out.printf(" %d \t%s \t%f \n",
				30,
				"대한민국",
				30.245F);
		
		// %d위치에 숫자값을 넣어서 출력형식 만들기
		System.out.printf("숫자 : %d\n",3);
		System.out.printf("숫자 : %d\n",300);
		System.out.printf("숫자 : %d\n",3000);
		System.out.printf("숫자 : %d\n",30000);
		System.out.println("=====================");
		
		// 일단 15개짜리 빈 공간을 만들고 숫자를 오른쪽정렬
		System.out.printf("숫자 : %15d\n",3);
		System.out.printf("숫자 : %15d\n",300);
		System.out.printf("숫자 : %15d\n",3000);
		System.out.printf("숫자 : %15d\n",30000);
		System.out.println("=====================");
		
		// 일단 15개짜리 빈 공간을 만들고
		//		숫자를 왼쪽정렬
		System.out.printf("숫자 : %-15d\n",3);
		System.out.printf("숫자 : %-15d\n",300);
		System.out.printf("숫자 : %-15d\n",3000);
		System.out.printf("숫자 : %-15d\n",30000);
		System.out.println("=====================");

		// %s 대신 문자열을 채워서 출력 형식 만들기
		// 단 문자열이 한글일 경우 형식이 어긋난다
		System.out.printf("%30s 우리나라\n","대한");
		System.out.printf("%30s 우리나라\n","대한민");
		System.out.printf("%30s 우리나라\n","대한민국");
		
		// %d일경우 값보다 자릿수가 부족할경우
		// 형식이 어긋난다
		System.out.printf("숫자 : %3d\n",3);
		System.out.printf("숫자 : %3d\n",300);
		System.out.printf("숫자 : %3d\n",3000);
		System.out.printf("숫자 : %3d\n",30000);
		System.out.println("=====================");
		
		System.out.printf("%s 우리나라\n","대한민국");
		System.out.println("=====================");

		System.out.printf("%30s 우리나라\n","대한민국");
		System.out.println("=====================");

		System.out.printf("%30s 우리나라\n","대한");
		System.out.printf("%30s 우리나라\n","대한민");
		System.out.printf("%30s 우리나라\n","대한민국");

		System.out.printf("%-30s 우리나라\n","KO");
		System.out.printf("%-30s 우리나라\n","KOR");
		System.out.printf("%-30s 우리나라\n","Republic");
		
		// 실수 표현 : %f
		// 정수 부분 3자리
		// 소수점 부분 2자리(3번째에서 반올림)
		System.out.printf("%3.2f\n",30.6666);
		
		int dan = 7;
		for(int i = 1; i < 10 ; i ++) {
			System.out.printf("%d x %d =%3d\n",
							dan,
							i,
							dan*i);
		}
		
		
		
	}
}
