package com.api.msds.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.api.msds.domain.BoardVo;

@Mapper
public interface BoardMapper {
	/*	
	@Insert({"<script>",
         "INSERT INTO board(title, content)",
         "VALUES(#{title}, #{content})",
         "</script>"})
	 int insertBoard(BoardVo boardVO);
	 
	 @Select({"<script>",
         "SELECT * from board",
         "</script>"})
	 List<BoardVo> findBoard();
 	*/
	
	int insertBoard(BoardVo boardVO);
	List<BoardVo> findBoard();
	
}
