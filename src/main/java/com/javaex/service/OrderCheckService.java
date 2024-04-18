package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.OrderCheckDao;
import com.javaex.vo.OrderCheckVo;

@Service
public class OrderCheckService {

	@Autowired
	private OrderCheckDao orderCheckDao;
	
	//주문조회 정보 전체 리스트 가져오기
	public List<OrderCheckVo> exeGetOrderedList(int no) {
		System.out.println("OrderCheckService.exeGetOrderedList");
		
		List<OrderCheckVo> ocList =orderCheckDao.selectOrderList(no);
		
		
		return ocList;
	}
	
	//날짜별로 결제내역 가져오기
	public List<OrderCheckVo> exeGetOrderedListByDate(String payDay) {
		System.out.println("OrderCheckService.exeGetOrderedListByDate");
		
		List<OrderCheckVo> odList =orderCheckDao.selectOrderListByDate(payDay);
		
		
		return odList;
	}
}
