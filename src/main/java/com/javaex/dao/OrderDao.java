package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.CartVo;
import com.javaex.vo.OrderVo;
import com.javaex.vo.UsersVo;

@Repository
public class OrderDao {

	@Autowired
	private SqlSession sqlSession;
	
	
	//cart 삭제하기
	public void deleteCart(int no) {
		System.out.println("OrderDao.deleteCart()");
		
		sqlSession.delete("cart.deleteOrder", no);
	}
	
	//주문내용 넣기 - orderList
	public void insertOrderList(CartVo cartVo) {
		System.out.println("OrderDao.insertOrderList()");
		System.out.println(cartVo);
		
		sqlSession.insert("orderList.insert", cartVo);
		
	}
	
	//주문내용 넣기 - orders
	public int insertOrders(OrderVo orderVo) {
		System.out.println("OrderDao.insertOrders()");
		
		sqlSession.insert("orders.insertOrders", orderVo);
		System.out.println("orderNo : "+orderVo.getOrderNo());
		
		int orderNo = orderVo.getOrderNo();
		
		return orderNo;
	}
	
	//주문자정보 가져오기
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
