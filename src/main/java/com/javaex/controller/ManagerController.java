package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.javaex.service.ManagerService;
import com.javaex.util.JsonResult;
import com.javaex.vo.ProductVo;

@RestController
public class ManagerController {

	@Autowired
	private ManagerService managerService;

	// 관리자헤더 메뉴부분
	@GetMapping("/api/managerCategory")
	public JsonResult getCategory() {
		System.out.println("ManagerController.getCategory");

		List<ProductVo> categoryList = managerService.getCategory();

		return JsonResult.success(categoryList);
	}

	// 관리자
	@GetMapping("/api/manager")
	public JsonResult getsamttugiList() {
		System.out.println("ManagerController.getsamttugiList");

		List<ProductVo> productList = managerService.exeProductList();

		System.out.println(productList);
		return JsonResult.success(productList);
	}

	// 카테고리 - 대분류
	@GetMapping("/api/bigCategory")
	public JsonResult getBigCategory() {
		System.out.println("ManagerController.getBigCategory");

		List<ProductVo> bigCategoryList = managerService.exeBigCategory();

		return JsonResult.success(bigCategoryList);
	}

	// 카테고리 - 소분류
	@GetMapping("/api/miniCategory")
	public JsonResult getMiniCategory(@RequestParam(value = "mcNo") int no) {
		System.out.println("ManagerController.getMiniCategory");

		List<ProductVo> miniCategoryList = managerService.exeMiniCategory(no);

		return JsonResult.success(miniCategoryList);
	}

	// 카테고리별 리스트 받기
	@GetMapping("/api/getCategoryList")
	public JsonResult getIList(@RequestParam(value = "mcNo") int no) {
		System.out.println("ManagerController.getIList");

		System.out.println(no);

		List<ProductVo> nList = managerService.getIList(no);

		return JsonResult.success(nList);
	}

	// 등록
	@PostMapping("/api/insert")
	public JsonResult upload(@ModelAttribute ProductVo productVo) {
		System.out.println("ManagerController.upload");

		System.out.println(productVo);
		System.out.println(productVo.getFile().getOriginalFilename());

		String savaName = managerService.exeUpload(productVo);

		return JsonResult.success(savaName);
	}

}
