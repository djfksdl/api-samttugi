package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.OrderService;
import com.javaex.util.JsonResult;
import com.javaex.vo.CartVo;
import com.javaex.vo.OrderInfoVo;
import com.javaex.vo.UsersVo;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	
	//주문 - orders
	@PostMapping("/api/order/orders")
	public void order(@RequestBody OrderInfoVo orderInfoVo, @RequestParam(value="no") int no) {
		System.out.println("OrderController.order()");
		
		orderService.exeInsertOrders(orderInfoVo, no);
		
	}
	
	//유저 정보
	@GetMapping("/api/order/userinfo")
	public JsonResult userInfo(@RequestParam(value="no") int no) {
		System.out.println("OrderController.userInfo()");

		UsersVo userVo = orderService.exeUserInfo(no);
		System.out.println(userVo);
		
		return JsonResult.success(userVo);
	}
	
	//상품 리스트
	@GetMapping("/api/order/list")
	public JsonResult productList(@RequestParam(value="no") int no) {
		System.out.println("OrderController.productList()");
		
		List<CartVo> orderList = orderService.exeProductList(no);
		System.out.println(orderList);
		
		return JsonResult.success(orderList);
	}

}
