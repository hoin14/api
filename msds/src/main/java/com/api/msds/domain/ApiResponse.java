package com.api.msds.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse<T> {
	
	private int code;
	private String message;
	private List<T> list;
	
	public ApiResponse(String message) {
		this.message = message;
	}
	
	public ApiResponse(int code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public ApiResponse(List<T> list) {
		this.list = list;
	}
}