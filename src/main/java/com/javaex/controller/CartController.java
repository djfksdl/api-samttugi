package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.CartService;
import com.javaex.util.JsonResult;
import com.javaex.vo.CartVo;

@RestController
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	
	//수량 수정
	@PostMapping("/api/cart/list")
	public void countUpdate(@RequestBody CartVo cartVo) {
		System.out.println("CartController.countUpdate()");
		
		cartService.exeCountUpdate(cartVo);
		
	}
	
	//삭제
	@DeleteMapping("/api/cart/list")
	public JsonResult cartDelete(@RequestBody CartVo cartVo) {
		System.out.println("CartController.delete()");
		
		System.out.println("cartVo : "+cartVo);
		
		cartService.exeDelete(cartVo);
		
		return JsonResult.success("삭제했습니다.");
	}
	
	//리스트
	@GetMapping("/api/cart/list")
	public JsonResult list(@RequestParam(value="no") int no) {
		System.out.println("CartController.list()");
		
		List<CartVo> cList = cartService.exeList(no);
		System.out.println(cList);
		
		return JsonResult.success(cList);
	}

}
