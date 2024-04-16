package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.MainDao;
import com.javaex.vo.ProductVo;

@Service
public class MainService {
	
	@Autowired
	private MainDao mainDao;

	// 리스트 가져오기
	public List<ProductVo> exeProductList() {
		System.out.println("MainService.exeGuestList()");

		List<ProductVo> productList = mainDao.prodcutSelectList();
		System.out.println(productList);
		return productList;
	}

}
