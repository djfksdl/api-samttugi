package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.HeaderVo;

@Repository
public class HeaderDao {
	
	@Autowired
	private SqlSession sqlSession;

	//카테고리 가져오기
	public List<HeaderVo> selectCategory() {
		System.out.println("HeaderDao.selectCategory");
		
		List<HeaderVo> categoryList = sqlSession.selectList("header.selectCategory");
		
		return categoryList;
		
	}
}
