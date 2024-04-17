package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.CartDao;
import com.javaex.vo.CartVo;

@Service
public class CartService {
	
	@Autowired
	private CartDao cartDao;

	
	//수량 수정
	public void exeCountUpdate(CartVo cartVo) {
		System.out.println("CartService.exeCountUpdate()");
		
		cartDao.countUpdate(cartVo);
		
	}
	
	//삭제
	public void exeDelete(CartVo cartVo) {
		System.out.println("CartService.exeDelete()");
		
		cartDao.cartDelete(cartVo);
	}
	
	
	//리스트
	public List<CartVo> exeList() {
		System.out.println("CartService.exeList()");
		
		List<CartVo> cList = cartDao.selectList();
	
		return cList;
	}
	
}
