package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.OrderCheckService;
import com.javaex.util.JsonResult;
import com.javaex.vo.OrderCheckVo;

@RestController
public class OrderCheckController {
	
	@Autowired
	private OrderCheckService orderCheckService;
	
	//주문조회 정보 전체 리스트 가져오기
	@GetMapping("/api/orderedListByUserNo")
	public JsonResult orderedListByUserNo(@RequestParam(value="no")int no) {
		System.out.println("OrderCheckController.orderedListByUserNo");
		
		List<OrderCheckVo> ocList = orderCheckService.exeGetOrderedList(no);
		
		
		return JsonResult.success(ocList);
	}
}
