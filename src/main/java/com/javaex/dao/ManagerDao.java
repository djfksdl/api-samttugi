package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.ProductVo;

@Repository
public class ManagerDao {

	@Autowired
	private SqlSession sqlSession;

	// 카테고리 가져오기
	public List<ProductVo> selectCategory() {
		System.out.println("ManagerDao.selectCategory");

		List<ProductVo> categoryList = sqlSession.selectList("manager.selectCategory");

		return categoryList;

	}

	// 전체리스트
	public List<ProductVo> prodcutSelectList() {
		System.out.println("ManagerDao.prodcutSelectList()");

		List<ProductVo> productList = sqlSession.selectList("manager.prodcutSelectList");
		System.out.println(productList);

		return productList;
	}

	// 카테고리 - 대분류
	public List<ProductVo> bigCategoryList() {
		System.out.println("ManagerDao.bigCategoryList()");

		List<ProductVo> bigCategoryList = sqlSession.selectList("manager.bigCategoryList");

		return bigCategoryList;
	}

	// 카테고리 - 소분류
	public List<ProductVo> miniCategoryList(int no) {
		System.out.println("ManagerDao.miniCategoryList()");

		List<ProductVo> miniCategoryList = sqlSession.selectList("manager.miniCategoryList", no);

		return miniCategoryList;
	}

	// 소분류별 아이템 리스트 불러오기
	public List<ProductVo> selectIList(int no) {
		System.out.println("ManagerDao.selectIList");

		List<ProductVo> nList = sqlSession.selectList("manager.getIList", no);

		return nList;
	}

	// 파일 업로드
	public void saveFile(ProductVo productVo) {
		System.out.println("ManagerDao.saveFile");

		sqlSession.insert("manager.insertUpload", productVo);
	}
}
