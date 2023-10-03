package com.api.msds.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.msds.domain.MemberVo;
import com.api.msds.service.MemberService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@Tag(name="사용자용 API", description = "사용자용 API")
@RequestMapping("/api")
public class MemberController {
	
	private final MemberService memberService;
	
	@GetMapping("/msds/login")
	public List<MemberVo> login(@RequestParam("name") String name) {
		return memberService.findMember(name);
		
	}
	
	@PostMapping("/msds/step0")
	public List<MemberVo> step1(@RequestParam("name") String name) {
		return memberService.findMember(name);
		
	}
}
