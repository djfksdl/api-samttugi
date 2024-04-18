package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.OrderDao;
import com.javaex.vo.CartVo;
import com.javaex.vo.OrderInfoVo;
import com.javaex.vo.OrderVo;
import com.javaex.vo.UsersVo;

@Service
public class OrderService {

	@Autowired
	private OrderDao orderDao;
	
	//주문내용 넣기 - orders
	public void exeInsertOrders(OrderInfoVo orderInfoVo, int no) {
		System.out.println("OrderService.exeInsertOrders()");
		System.out.println("userNo = " + no);
		
		OrderVo orderVo = orderInfoVo.getOrderVo();
		
		//orders db에 저장 후 orderNo 가져오기
		int orderNo = orderDao.insertOrders(orderVo);
		
		//orderNo로 orderList db에 주문한 상품정보 등록하기
		List<CartVo> cartList = orderInfoVo.getOrderList();
		System.out.println(cartList);
		
		for(int i=0; i<cartList.size(); i++){
			cartList.get(i).setOrderNo(orderNo);
			orderDao.insertOrderList(cartList.get(i));
		}
		
		//cart 삭제하기
		orderDao.deleteCart(no);
		
	}
	
	//주문자정보 가져오기
	public UsersVo exeUserInfo(int no) {
		System.out.println("OrderService.exeUserInfo()");
		
		UsersVo userVo = orderDao.selectUserInfo(no);
		
		return userVo;
	}
	
	//주문상품 가져오기
	public List<CartVo> exeProductList(int no) {
		System.out.println("OrderService.exeProductList()");
		
		List<CartVo> orderList = orderDao.orderList(no);
		
		return orderList;
	}
	
}
