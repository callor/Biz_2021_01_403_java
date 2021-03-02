package com.callor.oop.model;

/*
 * 카트정보를 담아 App에서 사용할
 * Value Object 클래스
 * 구매자, 상품명, 규격, 
 * 날짜, 시각, 수량, 
 * 구매단가, 구매금액
 */
public class CartVO {

	private String userName;
	private String productName;
	private String standard;
	private String date;
	private String time;
	private String qty;
	private String price;
	private String total;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "CartVO [userName=" + userName + ", productName=" + productName + ", standard=" + standard + ", date="
				+ date + ", time=" + time + ", qty=" + qty + ", price=" + price + ", total=" + total + "]";
	}
	
	
}
