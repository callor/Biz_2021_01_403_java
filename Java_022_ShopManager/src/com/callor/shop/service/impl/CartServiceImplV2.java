package com.callor.shop.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.CartServiceV2;

/*
 * CartServiceImplV1을 
 * 		extends(확장), 상속 받아 V2를 생성
 */
public class CartServiceImplV2 
			extends CartServiceImplV1 
			implements CartServiceV2 {

	/*
	 * CartServiceImplV2는 인스턴스 객체와
	 * 생성자 만 있는 상태
	 */
	private final Scanner scan;
	private String cartFileName;
	
	public CartServiceImplV2() {
		scan = new Scanner(System.in);
		cartList = new ArrayList<CartVO>();
		cartFileName 
			= "src/com/callor/shop/test.txt";
	}
	
	/*
	 * cartList에 저장된 상품리스트를 
	 * ".../cartlist.txt" 파일에 저장
	 * 
	 * 어떤 데이터를 파일에 저장하기
	 * 1. 파일이름(경로포함)을 결정하고
	 * 2. 파일을 생성
	 * 3. 모든데이터를 문자열로 만들고
	 * 4. 파일에 기록한다.
	 * 5. 파일을 연결을 정상적으로 종료한다
	 * 
	 * 
	 */
	@Override
	public void saveCartToFile() {
		
		//1. 데이터를 저장할 파일을 생성하기위하여
		//	FileWriter 클래스를 사용하여 객체선언
		FileWriter fileWriter = null;
		//2. FileWriter에 데이터를 전송하기 위하여
		//	PrintWriter 클래스를 사용하여 객체선언
		PrintWriter printer = null;
		
		/*
		 * 3. fileWriter 객체를 생성하면서 
		 *		데이터를 저장할 파일 정보를 전달
		 * => 운영체제와 통신을 하여 파일에 저장할 
		 * 		준비를 한다.
		 *    이때, 운영체제와 통신을 시작하는
		 *    아주 짧은 시간동안
		 *    생성하고자 하는 파일의 각종 정보들에
		 *    문제가 발생하여 exception이 발생할 수 있다
		 *    
		 *    아무리 코드를 견고하게 작성하여도
		 *    이 exception은 완전하게 피할수 없다
		 *    
		 *    Java에서는 이처럼 도저히 완전하게 
		 *    exception을 피할수 없는 경우는
		 *    코드를 "반드시 try 예외처리"를 하도록
		 *    강제한다.
		 *    따라서 FiltWriter 객체를
		 *    생성할때는 반드시 try...catch로 묶어야한다
		 */
		
		try {
			fileWriter = new FileWriter(cartFileName);
			
			// 여기까지 코드가 정상 수행되면
			// fileWriter는 System.in 처럼 파일과
			//	java 코드간에 연결하는 통로를 형성한다
			
			// 4. fileWriter 객체를 전달하면서
			//	PrintWriter 객체를 생성한다
			printer = new PrintWriter(fileWriter);
			
			// printer.println("대한민국");
			// printer.println("우리나라");
			// printer.println("Republic of Korea");
			
			int nSize = cartList.size();
			System.out.println(nSize);
			for(int i = 0 ; i < nSize ; i++) {
				CartVO cartVO = cartList.get(i);
				printer.printf("%s,%s,%d,%d,%d\n",
						cartVO.getUserName(),
						cartVO.getProductName(),
						cartVO.getQty(),
						cartVO.getPrice(),
						cartVO.getTotal());
			}
			printer.close();
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void loadCartFromFile() {
	}
}
