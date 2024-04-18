package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.UsersDao;
import com.javaex.vo.UsersVo;

@Service
public class UsersService {

	@Autowired
	private UsersDao usersDao;

	// 로그인
	public UsersVo exeLogin(UsersVo usersVo) {
		System.out.println("UsersService.exeLogin()");
		UsersVo authUser = usersDao.usersSelectByIdPw(usersVo);
		return authUser;
	}

	// 회원가입
	public int exeJoin(UsersVo usersVo) {
		System.out.println("UsersService.exeJoin()");
		int count = usersDao.join(usersVo);
		return count;
	}

	// id 중복체크용
	public int exeCheck(String id) {
		System.out.println("UsersService.exeCheck()");
		int count = usersDao.check(id);
		return count;
	}

	// 회원정보 수정폼
	public UsersVo exeModifyForm(int userNo) {
		System.out.println("UsersService.exeModifyForm()");
		System.out.println(userNo);
		UsersVo usersVo = usersDao.userSelectOneByNo(userNo);
		return usersVo;
	}

	// 회원정보 수정
	public int exeModify(UsersVo usersVo) {
		System.out.println("UsersService.exeModify()");

		int count = usersDao.memberUpdate(usersVo);
		System.out.println(usersVo);
		return count;
	}

}