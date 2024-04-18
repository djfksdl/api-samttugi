package com.javaex.vo;

public class OrderVo {

	private int orderNo;
	private int userNo;
	private String payment;
	private String payDay;
	private String request;
	
	
	public OrderVo() {
	}
	
	public OrderVo(int userNo, String payment, String request) {
		this.userNo = userNo;
		this.payment = payment;
		this.request = request;
	}

	public OrderVo(int orderNo, int userNo, String payment, String payDay, String request) {
		this.orderNo = orderNo;
		this.userNo = userNo;
		this.payment = payment;
		this.payDay = payDay;
		this.request = request;
	}

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

	@Override
	public String toString() {
		return "OrderVo [orderNo=" + orderNo + ", userNo=" + userNo + ", payment=" + payment + ", payDay=" + payDay
				+ ", request=" + request + "]";
	}
	
}
