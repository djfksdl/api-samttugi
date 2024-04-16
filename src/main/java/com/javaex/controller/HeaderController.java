package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.HeaderService;

@RestController
public class HeaderController {
	
	@Autowired
	private HeaderService headerService;
	
	//헤더 메뉴부분
	@GetMapping("/api/navcategory")
	public void getCategory() {
		System.out.println("HeaderController.getCategory");
		
		headerService.getCategory();
	}
}
