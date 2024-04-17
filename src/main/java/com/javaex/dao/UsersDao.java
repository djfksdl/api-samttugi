package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.UsersVo;

@Repository
public class UsersDao {

   @Autowired
   private SqlSession sqlSession;

   // 로그인
   public UsersVo usersSelectByIdPw(UsersVo usersVo) {
      System.out.println("UsersDao.usersSelectByIdPw()");
      UsersVo authUser = sqlSession.selectOne("users.selectByIdPw", usersVo);
      
      
      System.out.println(authUser);
      return authUser;
      

   }
   // 로그인 후 로그인 성공한 멤버 페이지 + 수정폼
      public UsersVo userSelectOneByNo(int userNo) {

         System.out.println("UsersDao.userSelectOneByNo()");
         System.out.println(userNo);
         UsersVo usersVo = sqlSession.selectOne("users.selectUserInfo", userNo);
         System.out.println(usersVo);
         return usersVo;
      }
   

   // 회원가입
   public int join(UsersVo usersVo) {
      System.out.println("UsersDao.join()");
      int count = sqlSession.insert("users.join", usersVo);
      System.out.println(count);
      return count;
   }
}