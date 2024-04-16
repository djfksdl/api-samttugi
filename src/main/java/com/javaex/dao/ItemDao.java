package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.javaex.vo.ProductVo;

@Repository
public class ItemDao {
	
	private SqlSession sqlSession;

	//카테고리별 아이템 리스트 불러오기
	public List<ProductVo> selectItemList(int no) {
		System.out.println("ItemDao.selectItemList");
		
		List<ProductVo> ItemList = sqlSession.selectList("item.getItemList", no);
		
		return ItemList;
	}
}
