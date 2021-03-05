package com.callor.shop.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RndServiceImplV2 {
	
	// makeRnd()와 saveFileRnd() method가 공용으로
	// 사용할 객체이므로 인스턴스 객체변수로 선언
	private List<Integer> intList;
	private String fileName;

	/*
	 * 매개변수가 없는 생성자와
	 * 파일이름을 매개변수로 전달받아야 하는 생성자를
	 * 선언했다.
	 * 
	 * 매개변수가 없는 생성자를 호출하여 객체를 생성하면
	 * 	( = new RndServiceImplV2() 라고 하면)
	 * 파일이름을 매개변수를 전달하면서
	 * 	다시 매개변수가 있는 생성자를 호출한다
	 */
	public RndServiceImplV2() {
		this("src/com/callor/shop/files/nums_rnd.txt");
	}
	/*
	 * 매개변수가 있는 생성자는 객체를 생성할때
	 * 반드시 파일이름을 전달받아야만 한다
	 * 
	 * = new RndServiceImplV2(파일이름);
	 * 
	 */
	public RndServiceImplV2(String fileName) {
		intList = new ArrayList<Integer>();
		this.fileName = fileName;
	}
	
	// Random 수를 생성하여 List에 담을 method
	public void makeRnd() {
		Random rnd = new Random();
		for(int i = 0 ; i < 100 ; i++) {
			Integer num = rnd.nextInt(1000) + 1;
			intList.add(num);
		}
	}
	
	public void saveFileRnd() {
		this.saveFileRnd("src/com/callor/shop/files/nums_rnd.txt");
	}
	
	
	// List에 담긴 숫자들을 파일에 저장하는 method
	// 저장할 파일 이름을 코드에 포함하지 않고
	// saveFileRnd() method를 호출하는 곳에서
	//	파일이름을 전달해 주도록 코드를 변경
	public void saveFileRnd(String fileName) {

		FileWriter fileWriter = null;
		PrintWriter printer = null;
		
		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);
			
			int nCount = 0;
			for(Integer n : intList) {
				printer.print(n + ":");
				if(++nCount % 5 == 0) {
					printer.println();
				}
			}
			printer.close();
			fileWriter.close();
			System.out.println("파일 저장 완료");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * 
	 */
	public void loadFileRnd() {
		
	}
	
	
	
	
	
	
}
