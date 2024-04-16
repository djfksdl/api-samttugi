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
	
	//대분류별 아이템 리스트 불러오기
	@GetMapping("/api/itemlist")
	public JsonResult getItemList(@RequestParam(value="no")int no) {
		System.out.println("ItemController.getItemList");
		
		List<ProductVo> ItemList = Itemservice.getItemList(no);
		
		return JsonResult.success(ItemList);
	}
	
	//대분류별 소분류 목록불러오기 
	@GetMapping("/api/sclist")
	public JsonResult getScList(@RequestParam(value="no")int no) {
		System.out.println("ItemController.getScList");
		
		System.out.println(no);
		
		List<ProductVo> scList = Itemservice.getScList(no);
		
		return JsonResult.success(scList);
	}
	
	//소분류별 아이템 리스트 받기
	@GetMapping("/api/iListByscNo")
	public JsonResult getIList(@RequestParam(value="i")int no) {
		System.out.println("ItemController.getIList");
		
		List<ProductVo> iList = Itemservice.getIList(no);
		System.out.println("여기야여기:"+ iList);
		
		return JsonResult.success(iList);
	}
	
	
}
