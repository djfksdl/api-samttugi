package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.ItemDao;

@Service
public class ItemService {
	
	@Autowired
	private ItemDao itemDao;
	
	//카테고리별 아이템 리스트 불러오기
	public void getItemList(int no) {
		System.out.println("ItemService.getItemList");
		
		itemDao.selectItemList(no);
	}
	
}
