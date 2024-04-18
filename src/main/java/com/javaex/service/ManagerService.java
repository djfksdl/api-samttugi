package com.javaex.service;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.ManagerDao;
import com.javaex.vo.ProductVo;

@Service
public class ManagerService {

	@Autowired
	private ManagerDao managerDao;

	// 카테고리 가져오기
	public List<ProductVo> getCategory() {
		System.out.println("ManagerDao.getCategory");

		List<ProductVo> categoryList = managerDao.selectCategory();

		return categoryList;
	}
	


	// 리스트 가져오기
	public List<ProductVo> exeProductList() {
		System.out.println("ManagerDao.exeGuestList()");

		List<ProductVo> productList = managerDao.prodcutSelectList();
		System.out.println(productList);
		return productList;
	}

	// 카테고리 - 대분류
	public List<ProductVo> exeBigCategory() {
		System.out.println("ManagerDao.exeBigCategory()");

		List<ProductVo> bigCategoryList = managerDao.bigCategoryList();

		return bigCategoryList;
	}

	// 카테고리 - 소분류
	public List<ProductVo> exeMiniCategory(int no) {
		System.out.println("ManagerDao.exeMiniCategory()");

		List<ProductVo> miniCategoryList = managerDao.miniCategoryList(no);

		return miniCategoryList;
	}
	
	
	//카테고리별 리스트 받기 
	public List<ProductVo> getIList(int no) {
		System.out.println("ItemService.getIList");
		
		List<ProductVo> nList = managerDao.selectIList(no);
		
		return nList;
	}
	
	// 등록
		public String exeUpload(ProductVo productVo) {
			System.out.println("AttachService.exeUpload()");

			// 파일저장디렉토리
			String saveDir = "C:\\javaStudy\\upload";

			// (1)파일관련 정보 추출///////////////////////////////////////////////////

			// 오리지널 파일명
			String orgName = productVo.getFile().getOriginalFilename();
			System.out.println(orgName);

			// 확장자
			String exName = orgName.substring(orgName.lastIndexOf("."));
			System.out.println(exName);

			// 저장파일명(겹치지 않아야 된다)
			String saveName = System.currentTimeMillis() + UUID.randomUUID().toString() + exName;
			System.out.println(saveName);

			// 파일사이즈
			long fileSize = productVo.getFile().getSize();
			System.out.println(fileSize);

			// 파일전체경로
			String filePath = saveDir + "\\" + saveName;
			System.out.println(filePath);

			// vo로묶기
			productVo.setSaveName(saveName);

			// Dao만들기 --> DB저장 과제

			// (2)파일저장(서버쪽 하드디스크에 저장)///////////////////////////////////////////////////
			try {
				byte[] fileData;
				fileData = productVo.getFile().getBytes();

				OutputStream os = new FileOutputStream(filePath);
				BufferedOutputStream bos = new BufferedOutputStream(os);

				bos.write(fileData);
				bos.close();

			} catch (IOException e) {
				e.printStackTrace();
			}

			// (3)DB저장 /////////////////////////////////////////////////////
			managerDao.saveFile(productVo);

			return saveName;
		}

}
