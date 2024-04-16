package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class ItemDao {
	
	private SqlSession sqlSession;

	//카테고리별 아이템 리스트 불러오기
	public void selectItemList(int no) {
		System.out.println("ItemDao.selectItemList");
		
		List<>sqlSession.selectList("item.getItemList", no);
	}
}
