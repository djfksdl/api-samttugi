package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.ManagerDao;
import com.javaex.vo.ProductVo;

@Service
public class ManagerService {

	@Autowired
	private ManagerDao managerDao;

	// 카테고리 가져오기
	public List<ProductVo> getCategory() {
		System.out.println("ManagerDao.getCategory");

		List<ProductVo> categoryList = managerDao.selectCategory();

		return categoryList;
	}
	


	// 리스트 가져오기
	public List<ProductVo> exeProductList() {
		System.out.println("ManagerDao.exeGuestList()");

		List<ProductVo> productList = managerDao.prodcutSelectList();
		System.out.println(productList);
		return productList;
	}

	// 카테고리 - 대분류
	public List<ProductVo> exeBigCategory() {
		System.out.println("ManagerDao.exeBigCategory()");

		List<ProductVo> bigCategoryList = managerDao.bigCategoryList();

		return bigCategoryList;
	}

	// 카테고리 - 소분류
	public List<ProductVo> exeMiniCategory(int no) {
		System.out.println("ManagerDao.exeMiniCategory()");

		List<ProductVo> miniCategoryList = managerDao.miniCategoryList(no);

		return miniCategoryList;
	}

}
