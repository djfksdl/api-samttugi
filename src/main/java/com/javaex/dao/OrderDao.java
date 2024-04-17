package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.CartVo;
import com.javaex.vo.UsersVo;

@Repository
public class OrderDao {

	@Autowired
	private SqlSession sqlSession;
	
	public UsersVo selectUserInfo(int no) {
		System.out.println("OrderDao.selectUserInfo()");

		UsersVo userVo = sqlSession.selectOne("users.OrderSelectUserInfo", no);
		
		return userVo;
	}
	
	//주문결제 리스트
	public List<CartVo> orderList(int no) {
		System.out.println("CartDao.orderList()");
		
		List<CartVo> orderList = sqlSession.selectList("cart.selectOrderList", no);
		
		return orderList;
	}
	
}
