package com.api.msds.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.msds.domain.ResultVo;

@RestController
public class HelloController {
	
	/*
	@RequestMapping("/hello")
	public String hello() {
		return "hello test";
	}
	
	@GetMapping("/hello2")
	public String hello2() {
		return "hello GET test";
	}
	
	@GetMapping("/hello3")
	public String hello3(@RequestParam("name") String name) {
		return "hello" + name;
	}
	
	@GetMapping("/hello4/{name}")
	public String hello4(@PathVariable String name) {
		return "hello" + name;
	}
	
	@PostMapping("/hello5")
	public ResultVo hello5(@RequestParam("name") String name) {
		ResultVo vo = new ResultVo(0, name);
		return vo;
	}
	
	@PostMapping("/hello6")
	public ResultVo hello6(@RequestBody ResultVo result) {
		return result;
	}
	*/
	
}
