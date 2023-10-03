package com.api.msds.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.msds.domain.BoardVo;

@Service
public interface BoardService {

	int insertBoard(BoardVo boardVO);
	List<BoardVo> findBoard();
}
