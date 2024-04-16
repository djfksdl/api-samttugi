package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.HeaderService;
import com.javaex.util.JsonResult;
import com.javaex.vo.HeaderVo;

@RestController
public class HeaderController {
	
	@Autowired
	private HeaderService headerService;
	
	//헤더 메뉴부분
	@GetMapping("/api/navcategory")
	public JsonResult getCategory() {
		System.out.println("HeaderController.getCategory");
		
		List<HeaderVo> categoryList =headerService.getCategory();
		
		return JsonResult.success(categoryList);
	}
}
