package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.ItemService;
import com.javaex.util.JsonResult;
import com.javaex.vo.ProductVo;

@RestController
public class ItemController {
	
	@Autowired
	private ItemService Itemservice;
	
	//카테고리별 아이템 리스트 불러오기
	@GetMapping("/api/itemlist")
	public JsonResult getItemList(@RequestParam(value="no")int no) {
		System.out.println("ItemController.getItemList");
		
		List<ProductVo> ItemList = Itemservice.getItemList(no);
		
		return JsonResult.success(ItemList);
	}
}
