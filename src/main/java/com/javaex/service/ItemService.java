package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.ItemDao;
import com.javaex.vo.CartVo;
import com.javaex.vo.ProductVo;

@Service
public class ItemService {
	
	@Autowired
	private ItemDao itemDao;
	
	//대분류별 소분류 목록 불러오기 
		public List<ProductVo> getScList(int no) {
			System.out.println("ItemService.getScList");
			
			List<ProductVo> scList = itemDao.selectScList(no);
			
			return scList;
		}
	
		
	//소분류별 아이템 리스트 받기 
	public List<ProductVo> getIList(ProductVo cNoVo) {
		System.out.println("ItemService.getIList");
		
		List<ProductVo> iList = itemDao.selectIList(cNoVo);
		
		return iList;
	}
	
	//전체 눌렀을때 아이템 리스트 받기
	public List<ProductVo> getAllIList(int no) {
		System.out.println("ItemService.getAllIList");
		
		List<ProductVo> iList = itemDao.selectAllIList(no);
		
		return iList;
	}
		
	//한 아이템 선택해서 아이템 정보 받기
	public ProductVo getItemInfo(int no) {
		System.out.println("ItemService.getItemInfo");
		
		ProductVo pVo =itemDao.selectItem(no);
		
		return pVo;
	}
	
	//장바구니로 보내기
	public void exeGoCart(CartVo cartVo) {
		System.out.println("ItemService.exeGoCart");
		
		itemDao.insertItemtoCart(cartVo);
		
	}
	
}
