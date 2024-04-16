package com.javaex.vo;

public class CartVo {

	private int userNo;
	private int productNo;
	private int cCount;
	
	
	public CartVo() {
	}
	
	public CartVo(int userNo, int productNo, int cCount) {
		this.userNo = userNo;
		this.productNo = productNo;
		this.cCount = cCount;
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
	
	
	@Override
	public String toString() {
		return "CartVo [userNo=" + userNo + ", productNo=" + productNo + ", cCount=" + cCount + "]";
	}
	
	
	
}
