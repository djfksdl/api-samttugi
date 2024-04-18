package com.javaex.vo;

public class OrderCheckVo {

	//생성자
	private int orderNo ;
	private int userNo;
	private String payment;
	private String payDay;
	private String request;
	private int oderListNo;
	
	//필드
	public OrderCheckVo() {
		super();
	}

	public OrderCheckVo(int orderNo, int userNo, String payment, String payDay, String request, int oderListNo) {
		super();
		this.orderNo = orderNo;
		this.userNo = userNo;
		this.payment = payment;
		this.payDay = payDay;
		this.request = request;
		this.oderListNo = oderListNo;
	}
	
	//메소드-gs
	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getPayDay() {
		return payDay;
	}

	public void setPayDay(String payDay) {
		this.payDay = payDay;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public int getOderListNo() {
		return oderListNo;
	}

	public void setOderListNo(int oderListNo) {
		this.oderListNo = oderListNo;
	}
	
	
	//메소드-일반
	@Override
	public String toString() {
		return "OrderCheckVo [orderNo=" + orderNo + ", userNo=" + userNo + ", payment=" + payment + ", payDay=" + payDay
				+ ", request=" + request + ", oderListNo=" + oderListNo + "]";
	}
	

	
}
