package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.HeaderDao;
import com.javaex.vo.HeaderVo;

@Service
public class HeaderService {
	
	@Autowired
	private HeaderDao headerDao;
	
	//카테고리 가져오기
	public List<HeaderVo> getCategory() {
		System.out.println("HeaderService.getCategory");
		
		List<HeaderVo> categoryList= headerDao.selectCategory();
		
		return categoryList;
	}
	
}
