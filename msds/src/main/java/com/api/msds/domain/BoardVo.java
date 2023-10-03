package com.api.msds.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@JsonInclude
@Data
public class BoardVo {
	private Integer id;
	private String title;
	private String content;
	private String created;
	private String updated;
	
}
