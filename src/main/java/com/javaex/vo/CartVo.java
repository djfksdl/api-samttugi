package com.javaex.vo;

public class CartVo {

	private int userNo;
	private int productNo;
	private int cCount;
	private String saveName;
	private String productName;
	private int price;
	
	
	public CartVo() {
	}

	public CartVo(int productNo) {
		this.productNo = productNo;
	}

	public CartVo(int userNo, int productNo, int cCount) {
		this.userNo = userNo;
		this.productNo = productNo;
		this.cCount = cCount;
	}


	public CartVo(int cCount, String saveName, String productName, int price) {
		this.cCount = cCount;
		this.saveName = saveName;
		this.productName = productName;
		this.price = price;
	}
	
	public CartVo(int productNo, int cCount, String saveName, String productName, int price) {
		super();
		this.productNo = productNo;
		this.cCount = cCount;
		this.saveName = saveName;
		this.productName = productName;
		this.price = price;
	}

	public CartVo(int userNo, int productNo, int cCount, String saveName, String productName, int price) {
		this.userNo = userNo;
		this.productNo = productNo;
		this.cCount = cCount;
		this.saveName = saveName;
		this.productName = productName;
		this.price = price;
	}


	public int getUserNo() {
		return userNo;
	}


	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}


	public int getProductNo() {
		return productNo;
	}


	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}


	public int getcCount() {
		return cCount;
	}


	public void setcCount(int cCount) {
		this.cCount = cCount;
	}


	public String getSaveName() {
		return saveName;
	}


	public void setSaveName(String saveName) {
		this.saveName = saveName;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "CartVo [userNo=" + userNo + ", productNo=" + productNo + ", cCount=" + cCount + ", saveName=" + saveName
				+ ", productName=" + productName + ", price=" + price + "]";
	}
	
	
	
	
}
