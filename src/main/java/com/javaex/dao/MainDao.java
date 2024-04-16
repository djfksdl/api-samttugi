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

}
