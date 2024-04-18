package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.MainService;
import com.javaex.util.JsonResult;
import com.javaex.vo.ProductVo;

@RestController
public class MainController {

	@Autowired
	private MainService mainService;

	// 오뚜기몰에서 만나요
	@GetMapping("/api/samttugiList")
	public JsonResult getsamttugiList() {
		System.out.println("MainController.getsamttugiList");

		List<ProductVo> productList = mainService.exeProductList();

		System.out.println(productList);
		return JsonResult.success(productList);
	}

	// 오뚜기몰에서 만나요
	@GetMapping("/api/samttugiList2")
	public JsonResult getsamttugiList2() {
		System.out.println("MainController.getsamttugiList2");

		List<ProductVo> productList2 = mainService.exeProductList2();

		System.out.println(productList2);
		return JsonResult.success(productList2);
	}

	// 오뚜기몰에서 만나요
	@GetMapping("/api/samttugiList3")
	public JsonResult getsamttugiList3() {
		System.out.println("MainController.getsamttugiList3");

		List<ProductVo> productList3 = mainService.exeProductList3();

		System.out.println(productList3);
		return JsonResult.success(productList3);
	}

}
