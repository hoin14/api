package com.api.msds.service;

import java.util.List;

import com.api.msds.domain.MemberVo;

public interface MemberService {
	List<MemberVo> findMember(String name);
	
}
