package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.OrderDao;
import com.javaex.vo.CartVo;
import com.javaex.vo.UsersVo;

@Service
public class OrderService {

	@Autowired
	private OrderDao orderDao;
	
	public UsersVo exeUserInfo(int no) {
		System.out.println("OrderService.exeUserInfo()");
		
		UsersVo userVo = orderDao.selectUserInfo(no);
		
		return userVo;
	}
	
	public List<CartVo> exeProductList(int no) {
		System.out.println("OrderService.exeProductList()");
		
		List<CartVo> orderList = orderDao.orderList(no);
		
		return orderList;
	}
	
}
