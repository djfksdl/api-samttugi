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

	// 카테고리 - 대분류
	public List<ProductVo> exeBigCategory() {
		System.out.println("ManagerDao.exeBigCategory()");

		List<ProductVo> bigCategoryList = managerDao.bigCategoryList();

		return bigCategoryList;
	}

	// 카테고리 - 소분류
	public List<ProductVo> exeMiniCategory() {
		System.out.println("ManagerDao.exeMiniCategory()");

		List<ProductVo> miniCategoryList = managerDao.miniCategoryList();

		return miniCategoryList;
	}

}
