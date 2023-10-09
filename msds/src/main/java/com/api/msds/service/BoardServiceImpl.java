package com.api.msds.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.msds.domain.BoardVo;
import com.api.msds.mapper.BoardMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
	private final BoardMapper boardMapper;
	
	@Override
	public int insertBoard(BoardVo boardVO) {
		return boardMapper.insertBoard(boardVO);
	}

	@Override
	public List<BoardVo> findBoard() {
		return boardMapper.findBoard();
	}

}
