package com.javaex.vo;

import java.util.List;

public class OrderInfoVo {
	
	private OrderVo orderVo;
	private List<CartVo> orderList;
	
	
	public OrderInfoVo() {
	}
	
	public OrderInfoVo(OrderVo orderVo, List<CartVo> orderList) {
		this.orderVo = orderVo;
		this.orderList = orderList;
	}
	
	
	public OrderVo getOrderVo() {
		return orderVo;
	}
	public void setOrderVo(OrderVo orderVo) {
		this.orderVo = orderVo;
	}
	public List<CartVo> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<CartVo> orderList) {
		this.orderList = orderList;
	}
	
	
	@Override
	public String toString() {
		return "OrderInfoVo [orderVo=" + orderVo + ", orderList=" + orderList + "]";
	}
	
	

}
