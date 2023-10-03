package com.api.msds.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.api.msds.domain.MemberVo;
import com.api.msds.security.TokenProvider;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

	private final TokenProvider tokenProvider;
	
	@Override
	public List<MemberVo> findMember(String name) {
		List<MemberVo> list = new ArrayList<>();
		
		String token = tokenProvider.createToken(name);

		MemberVo vo = new MemberVo();
		vo.setUserName(name);
		vo.setToken(token);

		list.add(vo);
		
		return list;
	}

}
