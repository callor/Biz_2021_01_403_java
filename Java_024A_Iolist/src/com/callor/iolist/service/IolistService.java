package com.callor.iolist.service;

/*
 * 파일을 읽어서 iolist에 담기
 * 
 * iolist에 담긴 데이터를 "구분"값을 기준으로
 * 		매입금액과 판매금액을 계산하자
 * 
 * iolist에 담긴 데이터를 출력하기
 */
public interface IolistService {
	
	public void loadDataFromFile() ;
	public void iolistSum();
	public void printIolist();

}




