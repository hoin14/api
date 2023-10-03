package com.api.msds;

import org.junit.jupiter.api.Test;

import com.api.msds.domain.ResultVo;

public class LombokTest {
	
	@Test
	public void ResultTest() {
		ResultVo vo = new ResultVo(0, "hong");
		System.out.println(vo);
	}
}
