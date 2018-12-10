package com.tistory.pentode.service;

import java.util.List;

import com.tistory.pentode.vo.BoardVO;

public interface BoardService {
	List<BoardVO> selectBoardList() throws Exception;
	void insertBoard(BoardVO boardVO);
}
