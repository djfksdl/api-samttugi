package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.CartService;
import com.javaex.util.JsonResult;
import com.javaex.vo.CartVo;

@RestController
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	
	@GetMapping("api/cart/list")
	public JsonResult list() {
		System.out.println("CartController.list()");
		
		List<CartVo> cList = cartService.exeList();
		
		return JsonResult.success(cList);
	}

}
