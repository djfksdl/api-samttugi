package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.ItemService;
import com.javaex.util.JsonResult;
import com.javaex.vo.CartVo;
import com.javaex.vo.ProductVo;

@RestController
public class ItemController {
	
	@Autowired
	private ItemService Itemservice;
	
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
	public JsonResult getIList(@ModelAttribute ProductVo cNoVo) {
		System.out.println("ItemController.getIList");
		
		System.out.println(cNoVo);
		
		List<ProductVo> iList = Itemservice.getIList(cNoVo);
		
		return JsonResult.success(iList);
	}
	
	//전체 눌렀을때 아이템 리스트 받기
	@GetMapping("/api/iListAll")
	public JsonResult getAllIList(@RequestParam(value="no") int no) {
		System.out.println("ItemController.getAllIList");

		List<ProductVo> iList = Itemservice.getAllIList(no);
		
		return JsonResult.success(iList);
	}
	
	//한 아이템 선택해서 아이템 정보 받기
	@GetMapping("/api/itemInfoBypNo")
	public JsonResult itemInfoBypNo(@RequestParam(value="no") int no) {
		System.out.println("ItemController.itemInfoBypNo");

		ProductVo pVo = Itemservice.getItemInfo(no);
		
		return JsonResult.success(pVo);
	}
	
	//장바구니로 보내기
	@PostMapping("/api/goCart")
	public JsonResult goCart(@RequestBody CartVo cartVo) {
		System.out.println("ItemController.goCart");

		Itemservice.exeGoCart(cartVo);
		
		return JsonResult.success("얏호");
	}
	
	
}
