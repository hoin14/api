package com.api.msds.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.msds.domain.BoardVo;
import com.api.msds.domain.ResultVo;
import com.api.msds.persistence.BoardMapper;
import com.api.msds.security.TokenProvider;
import com.api.msds.service.BoardService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@Tag(name="관리자용 API", description = "관리자용 API")
@RequestMapping("/api")
public class BoardController {

	private final BoardMapper boardMapper;
	private final BoardService boardService;
	private final TokenProvider tokenProvider;
	
	@GetMapping("/admin/get")
    public List<BoardVo> findAllBoard() {
        //return boardMapper.findBoard();
        return boardService.findBoard();
    }
	    
	@PostMapping("/admin/post")
	public ResultVo addBoard(@RequestBody BoardVo vo) {
		System.out.println("vo1:" + vo.getTitle());
		System.out.println("vo2:" + vo.getContent());
		
		String token = tokenProvider.createToken("hoin");
		System.out.println("token:" + token);
		//int result = boardMapper.insertBoard(vo);
		int result = boardService.insertBoard(vo);
		if(result > 0) {
			return new ResultVo(0, "success");
		}else {
			return new ResultVo(100, "fail");
		}
	}
	
	@PutMapping("/admin/put")
	public String putBoard() {
		return "OK";
	}
	
	@DeleteMapping("/admin/delete")
	public String deleteBoard() {
		return "OK";
	}
}
