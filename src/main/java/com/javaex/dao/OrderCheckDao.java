package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.OrderCheckVo;

@Repository
public class OrderCheckDao {
	@Autowired
	private SqlSession sqlSession;
	
	//주문조회 정보 전체 리스트 가져오기
		public List<OrderCheckVo> selectOrderList(int no) {
			System.out.println("orderCheckDao.selectOrderList");
			
			List<OrderCheckVo> ocList =sqlSession.selectList("orderlist.orderCheckList",no);
			
			
			return ocList;
		}

}
