package com.api.msds.controller;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.msds.domain.ApiResponse;
import com.api.msds.domain.BoardVo;
import com.api.msds.domain.ErrorCode;
import com.api.msds.security.TokenProvider;
import com.api.msds.service.BoardService;
import com.api.msds.util.ExceptionCtrlAdvice;
import com.api.msds.util.RestApiException;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@Tag(name="관리자용 API", description = "관리자용 API")
@RequestMapping("/api")
public class BoardController {

	private final BoardService boardService;
	private final TokenProvider tokenProvider;
	private final ExceptionCtrlAdvice ex;
	
	@GetMapping("/admin/get")
    public ApiResponse<BoardVo> findAllBoard1(Locale locale, HttpServletRequest request) {
		ApiResponse<BoardVo> rv =new ApiResponse<>();
		
		Map<String, String> map = new HashMap<>();
		request.getHeaderNames().asIterator()
								.forEachRemaining(headerName -> map.put(headerName, request.getHeader(headerName)));
		
		rv.setCode(200);
		rv.setMessage("SUCCESS");
		rv.setList(boardService.findBoard());
		return rv;
	}
	
	@GetMapping("/admin/get1")
    public ResponseEntity<?> findAllBoard2(Locale locale, HttpServletRequest request)  {
		throw new RestApiException(HttpStatus.BAD_REQUEST.hashCode());
	}
	
	@PostMapping("/admin/post")
	public ApiResponse<BoardVo> addBoard(@RequestBody BoardVo vo) {
		System.out.println("vo1:" + vo.getTitle());
		System.out.println("vo2:" + vo.getContent());
		
		String token = tokenProvider.createToken("hoin");
		System.out.println("token:" + token);
		//int result = boardMapper.insertBoard(vo);
		int result = boardService.insertBoard(vo);
		
		if(result > 0) {
			return new ApiResponse(0, "success");
		}else {
			return new ApiResponse(100, "fail");
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
