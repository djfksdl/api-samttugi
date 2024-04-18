package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	// 회원가입
	@PostMapping("/api/user/join")
	public int join(@RequestBody UsersVo usersVo) {
		System.out.println("UsersController.join()");
		int count = usersService.exeJoin(usersVo);
		return count;
	}

	// 아이디 중복체크
	@PostMapping("/api/user/idcheck")
	public int idCheck(@RequestBody UsersVo usersVo) {
		System.out.println("UsersController.idCheck()");
		System.out.println(usersVo);

		String id = usersVo.getId();
		System.out.println(id);
		int count = usersService.exeCheck(id);
		return count;
	}

	// 수정폼(1명 데이터 가져오기)
	@GetMapping(value = "/api/user/modify")
	public JsonResult modifyform(HttpServletRequest request) {
		System.out.println("UsersController.modifyform()");

		// JWT 토큰에서 no 값을 추출
		int no = JwtUtil.getNoFromHeader(request);
		System.out.println(no);

		// 토큰 추출
		// String token = JwtUtil.getTokenByHeader(request);
		// System.out.println("token=" + token);

		// 토큰을 사용하여 사용자 인증 및 회원 정보 가져오기
		UsersVo usersVo = usersService.exeModifyForm(no);

		return JsonResult.success(usersVo);

	}

	// 회원정보 수정
	@PutMapping("/api/user/modify")
	public JsonResult modifyMember(@RequestBody UsersVo usersVo, HttpServletRequest request) {
		System.out.println("UsersController.modifyMember()");

		// JWT 토큰에서 no 값을 추출
		int no = JwtUtil.getNoFromHeader(request);
		// int no = memberVo.getNo();
		System.out.println(no);
		if (no != -1) { // 정상
			usersService.exeModify(usersVo);
			return JsonResult.success(usersVo);
		} else {
			// 토큰이 없거나(로그인상태 아님) 변조된 경우
			return JsonResult.fail("fail");
		}
	}

}
