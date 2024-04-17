package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.CartVo;

@Repository
public class CartDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	//삭제
	public void cartDelete(CartVo cartVo) {
		System.out.println("CartDao.cartDelete()");
		
		sqlSession.delete("cart.cartDelete", cartVo);
	}
	
	
	//리스트
	public List<CartVo> selectList() {
		System.out.println("CartDao.selectList()");
		
		List<CartVo> cList = sqlSession.selectList("cart.selectList");
		
		return cList;
	}

}
