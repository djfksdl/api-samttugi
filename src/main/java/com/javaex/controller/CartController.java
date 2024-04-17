package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.CartService;
import com.javaex.util.JsonResult;
import com.javaex.vo.CartVo;

@RestController
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	
	//삭제
	@DeleteMapping("/api/cart/delete")
	public JsonResult cartDelete(@RequestBody CartVo cartVo) {
		System.out.println("CartController.delete()");
		
		System.out.println("cartVo : "+cartVo);
		
		cartService.exeDelete(cartVo);
		
		return JsonResult.success("삭제했습니다.");
	}
	
	//리스트
	@GetMapping("/api/cart/list")
	public JsonResult list() {
		System.out.println("CartController.list()");
		
		List<CartVo> cList = cartService.exeList();
		System.out.println(cList);
		
		return JsonResult.success(cList);
	}

}
