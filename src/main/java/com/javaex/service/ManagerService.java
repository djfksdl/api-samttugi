package com.javaex.service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.javaex.dao.ManagerDao;
import com.javaex.vo.AttachVo;
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
	public List<ProductVo> exeMiniCategory(int no) {
		System.out.println("ManagerDao.exeMiniCategory()");

		List<ProductVo> miniCategoryList = managerDao.miniCategoryList(no);

		return miniCategoryList;
	}

	// 등록
	public int exeWrite(ProductVo productVo) {
		System.out.println("ManagerDao.exeWrite");


		int count = managerDao.productInsert(productVo);

		return count;
	}

}
