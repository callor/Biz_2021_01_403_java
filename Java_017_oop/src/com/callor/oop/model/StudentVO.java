package com.callor.oop.model;

/*
 * 정보의 은닉과 캡슐화
 * 	클래스의 인스턴스 변수에 직접 접근하지 못하도록 하고
 * 	getter, setter method를 통하여 접근하도록 만드는
 * 	클래스 설계이론
 * 
 */
public class StudentVO {

	private String strNum;
	private String strName;
	private String strDept;
	private String strTel;
	private String strAddr;
	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public String getStrDept() {
		return strDept;
	}
	public void setStrDept(String strDept) {
		this.strDept = strDept;
	}
	public String getStrTel() {
		return strTel;
	}
	public void setStrTel(String strTel) {
		this.strTel = strTel;
	}
	public String getStrAddr() {
		return strAddr;
	}
	public void setStrAddr(String strAddr) {
		this.strAddr = strAddr;
	}

	
	
	
	
	
}
