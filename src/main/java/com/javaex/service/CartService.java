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

	public List<CartVo> exeList() {
		System.out.println("CartService.exeList()");
		
		List<CartVo> cList = cartDao.selectList();
	
		return cList;
	}
	
}
