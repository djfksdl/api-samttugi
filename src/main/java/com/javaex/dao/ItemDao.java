package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.CartVo;
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
		//대분류 no로 name가져오기
		public String selectMcName(int no) {
			System.out.println("ItemDao.selectMcName");
			
			String mcName = sqlSession.selectOne("item.getMcName", no);
			
			return mcName;
		}
	
	
	
		//소분류별 아이템 리스트 불러오기
		public List<ProductVo> selectIList(ProductVo cNoVo) {
			System.out.println("ItemDao.selectIList");
			
			System.out.println("여기야1:" + cNoVo);
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
		
		//한 아이템 선택해서 아이템 정보 받기
		public ProductVo selectItem(int no) {
			System.out.println("ItemDao.selectItem");
			
			ProductVo pVo = sqlSession.selectOne("item.selectOne", no);
			
			return pVo;
		}
		//장바구니로 보내기
		public void insertItemtoCart(CartVo cartVo) {
			System.out.println("ItemDao.insertItemtoCart");
			
			sqlSession.insert("item.insertToCart", cartVo);
			
		}
}
