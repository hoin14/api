package com.api.msds.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultVo<T> {
	
	private int code;
	private String message;
	private List<T> list;
	
	public ResultVo(String message) {
		this.message = message;
	}
	
	public ResultVo(int code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public ResultVo(List<T> list) {
		this.list = list;
	}
}
