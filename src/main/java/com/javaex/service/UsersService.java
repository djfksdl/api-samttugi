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

   // 로그인 후 로그인 성공한 멤버 페이지(getName)
   public UsersVo exeUserName(int userNo) {
      System.out.println("UsersService.exeUserName()");

      UsersVo usersVo = usersDao.userSelectOneByNo(userNo);
      return usersVo;
   }

   // 회원가입
   public int exeJoin(UsersVo usersVo) {
      System.out.println("UsersService.exeJoin()");
      int count = usersDao.join(usersVo);
      return count;
   }

}