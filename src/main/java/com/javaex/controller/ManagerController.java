package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.ManagerService;
import com.javaex.util.JsonResult;
import com.javaex.vo.ProductVo;

@RestController
public class ManagerController {

	@Autowired
	private ManagerService managerService;
	
	// 카테고리 - 대분류 
	@GetMapping("/api/bigCategory")
	public JsonResult getBigCategory() {
		System.out.println("ManagerController.getBigCategory");
		
		List<ProductVo> bigCategoryList =managerService.exeBigCategory();
		
		return JsonResult.success(bigCategoryList);
	}
	
	// 카테고리 - 소분류 
		@GetMapping("/api/miniCategory")
		public JsonResult getMiniCategory() {
			System.out.println("ManagerController.getMiniCategory");
			
			List<ProductVo> miniCategoryList =managerService.exeMiniCategory();
			
			return JsonResult.success(miniCategoryList);
		}
}
