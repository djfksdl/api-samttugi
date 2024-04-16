package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.ProductVo;

@Repository
public class ManagerDao {

	@Autowired
	private SqlSession sqlSession;
	
	// 카테고리 - 대분류
	public List<ProductVo> bigCategoryList() {
		System.out.println("ManagerDao.bigCategoryList()");

		List<ProductVo> bigCategoryList = sqlSession.selectList("manager.bigCategoryList");

		return bigCategoryList;
	}
	
	// 카테고리 - 소분류
		public List<ProductVo> miniCategoryList() {
			System.out.println("ManagerDao.miniCategoryList()");

			List<ProductVo> miniCategoryList = sqlSession.selectList("manager.miniCategoryList");
			System.out.println(miniCategoryList);

			return miniCategoryList;
		}
	
}
