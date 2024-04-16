package com.javaex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeaderController {
	
	
	//헤더 메뉴부분
	@GetMapping("/api/navcategory")
	public void getCategory() {
		System.out.println("HeaderController.getCategory");
	}
}
