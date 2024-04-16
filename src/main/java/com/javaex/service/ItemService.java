package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.ItemDao;
import com.javaex.vo.ProductVo;

@Service
public class ItemService {
	
	@Autowired
	private ItemDao itemDao;
	
	//카테고리별 아이템 리스트 불러오기
	public List<ProductVo> getItemList(int no) {
		System.out.println("ItemService.getItemList");
		
		List<ProductVo> ItemList = itemDao.selectItemList(no);
		
		return ItemList;
	}
	
}
