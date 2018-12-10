package com.tistory.pentode.service.dao;

import java.util.List;

import com.tistory.pentode.vo.BoardVO;

public interface BoardDAO {
	List<BoardVO> selectBoardList() throws Exception;
	void insertBoard(BoardVO boardVO);
}
