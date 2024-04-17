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
	
	//대분류별 소분류 목록 불러오기
		public List<ProductVo> selectScList(int no) {
			System.out.println("ItemDao.selectScList");
			
			List<ProductVo> scList = sqlSession.selectList("item.getScList", no);
			
			return scList;
		}
	
	
	
	//소분류별 아이템 리스트 불러오기
		public List<ProductVo> selectIList(ProductVo cNoVo) {
			System.out.println("ItemDao.selectIList");
			
			List<ProductVo> iList = sqlSession.selectList("item.getIList", cNoVo);
			
			System.out.println("여기야2:" + iList);
			
			return iList;
		}
		
	//전체 눌렀을때 아이템 리스트 받기
		public List<ProductVo> selectAllIList(int no) {
			System.out.println("ItemDao.selectAllIList");
			
			List<ProductVo> iList = sqlSession.selectList("item.getAllIList", no);
			
			return iList;
		}
}
