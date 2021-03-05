package com.callor.shop.model;

public class CartVO {
	
	// CartVO vo = new CartVO();
	// vo.userName = "값"
	private String userName;
	private String productName;
	private int qty;
	private int price;
	private int total;
	
	// 매개변수가 있는 생성자를 만들게 되면
	// 매개변수가 없는 "기본생성자"를 반드시 만들어 줘야 한다
	public CartVO() {
	}

	public CartVO(String userName, String pName, int qty, int price) {
		this.userName = userName;
		this.productName = pName;
		this.qty = qty;
		this.price = price;
	}
	
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
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "CartVO [userName=" + userName + ", productName=" + productName + ", qty=" + qty + ", price=" + price
				+ ", total=" + total + "]";
	}

	
	
	
}
