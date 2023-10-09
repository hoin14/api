package com.api.msds.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.api.msds.domain.BoardVo;

@Mapper
public interface BoardMapper {
	
	int insertBoard(BoardVo boardVO);
	List<BoardVo> findBoard();
	
}
