package com.api.msds.service;

import java.util.List;

import com.api.msds.domain.BoardVo;

public interface BoardService {

	int insertBoard(BoardVo boardVO);
	List<BoardVo> findBoard();
}
