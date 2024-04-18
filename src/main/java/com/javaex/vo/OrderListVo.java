package com.javaex.vo;

public class OrderListVo {

	private int oderListNo;
	private int orderNo;
	private int productNo;
	private int oCount;
	private int oPrice;
	
	public OrderListVo() {
		super();
	}
	
	public OrderListVo(int orderNo, int productNo, int oCount, int oPrice) {
		this.orderNo = orderNo;
		this.productNo = productNo;
		this.oCount = oCount;
		this.oPrice = oPrice;
	}

	public OrderListVo(int oderListNo, int orderNo, int productNo, int oCount, int oPrice) {
		this.oderListNo = oderListNo;
		this.orderNo = orderNo;
		this.productNo = productNo;
		this.oCount = oCount;
		this.oPrice = oPrice;
	}

	
	public int getOderListNo() {
		return oderListNo;
	}

	public void setOderListNo(int oderListNo) {
		this.oderListNo = oderListNo;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public int getoCount() {
		return oCount;
	}

	public void setoCount(int oCount) {
		this.oCount = oCount;
	}

	public int getoPrice() {
		return oPrice;
	}

	public void setoPrice(int oPrice) {
		this.oPrice = oPrice;
	}

	
	@Override
	public String toString() {
		return "OrderListVo [oderListNo=" + oderListNo + ", orderNo=" + orderNo + ", productNo=" + productNo
				+ ", oCount=" + oCount + ", oPrice=" + oPrice + "]";
	}
	
}
