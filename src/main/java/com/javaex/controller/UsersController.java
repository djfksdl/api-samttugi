package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.UsersService;
import com.javaex.util.JsonResult;
import com.javaex.util.JwtUtil;
import com.javaex.vo.UsersVo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class UsersController {

	@Autowired
	private UsersService usersService;

	// 로그인
	@PostMapping("/api/user/login")
	public JsonResult login(@RequestBody UsersVo usersVo, HttpServletResponse response) {
		System.out.println("UsersController.login()");

		UsersVo authUser = usersService.exeLogin(usersVo);
		System.out.println(authUser);

		if (authUser != null) {
			// 토큰 발급 헤더에 실어 보낸다
			JwtUtil.createTokenAndSetHeader(response, "" + authUser.getUserNo());
			return JsonResult.success(authUser);
		} else {
			return JsonResult.fail("로그인 실패");
		}

	}

	// 로그인 후 로그인 성공한 멤버 페이지(1명 데이터 가져오기)
	@GetMapping(value = "/api/user/loginsuccess")
	public JsonResult afterlogin(HttpServletRequest request) {
		System.out.println("UsersController.afterlogin()");

		// JWT 토큰에서 no 값을 추출
		int no = JwtUtil.getNoFromHeader(request);
		System.out.println(no);

		// 토큰 추출
		// String token = JwtUtil.getTokenByHeader(request);
		// System.out.println("token=" + token);

		// 토큰을 사용하여 사용자 인증 및 회원 정보 가져오기
		if (no != -1) {
			UsersVo userInfo = usersService.exeUserName(no);
			System.out.println(userInfo);
			return JsonResult.success(userInfo);
		} else {
			// 토큰이 없거나(로그인상태 아님) 변조된 경우
			return JsonResult.fail("fail");
		}
	}

	// 회원가입/test
	@PostMapping("/api/user/join")
	public int join(@RequestBody UsersVo usersVo) {
		System.out.println("UsersController.join()");
		int count = usersService.exeJoin(usersVo);
		return count;
	}

}