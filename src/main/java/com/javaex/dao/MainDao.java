package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.ProductVo;

@Repository
public class MainDao {

	@Autowired
	private SqlSession sqlSession;

	// 전체리스트
	public List<ProductVo> prodcutSelectList() {
		System.out.println("MainDao.prodcutSelectList()");

		List<ProductVo> productList = sqlSession.selectList("main.prodcutSelectList");
		System.out.println(productList);

		return productList;
	}

	// 전체리스트
	public List<ProductVo> prodcutSelectList2() {
		System.out.println("MainDao.prodcutSelectList2()");

		List<ProductVo> productList2 = sqlSession.selectList("main.prodcutSelectList2");
		System.out.println(productList2);

		return productList2;
	}

	// 전체리스트
	public List<ProductVo> prodcutSelectList3() {
		System.out.println("MainDao.prodcutSelectList3()");

		List<ProductVo> productList3 = sqlSession.selectList("main.prodcutSelectList3");
		System.out.println(productList3);

		return productList3;
	}
}
