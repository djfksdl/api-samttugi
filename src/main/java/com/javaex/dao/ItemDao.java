package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.ProductVo;

@Repository
public class ItemDao {
	
	@Autowired
	private SqlSession sqlSession;

	//대분류별 아이템 리스트 불러오기
	public List<ProductVo> selectItemList(int no) {
		System.out.println("ItemDao.selectItemList");
		
		List<ProductVo> ItemList = sqlSession.selectList("item.getItemList", no);
		
		return ItemList;
	}
	
	//대분류별 소분류 목록 불러오기
	public List<ProductVo> selectScList(int no) {
		System.out.println("ItemDao.selectScList");
		
		List<ProductVo> scList = sqlSession.selectList("item.getScList", no);
		
		return scList;
	}
	
	//소분류별 아이템 리스트 불러오기
		public List<ProductVo> selectIList(int no) {
			System.out.println("ItemDao.selectIList");
			
			System.out.println("여기야1:"+ no);
			List<ProductVo> iList = sqlSession.selectList("item.getIList", no);
			
			System.out.println("여기야2:" + iList);
			
			return iList;
		}
}
