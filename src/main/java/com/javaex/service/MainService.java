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

	// 리스트 가져오기
	public List<ProductVo> exeProductList2() {
		System.out.println("MainService.exeGuestList2()");

		List<ProductVo> productList2 = mainDao.prodcutSelectList2();
		System.out.println(productList2);
		return productList2;
	}

	// 리스트 가져오기
	public List<ProductVo> exeProductList3() {
		System.out.println("MainService.exeGuestList3()");

		List<ProductVo> productList3 = mainDao.prodcutSelectList3();
		System.out.println(productList3);
		return productList3;
	}

}
