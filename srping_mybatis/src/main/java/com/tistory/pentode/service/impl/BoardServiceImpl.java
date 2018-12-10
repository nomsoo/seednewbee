package com.tistory.pentode.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tistory.pentode.service.BoardService;
import com.tistory.pentode.service.dao.BoardDAO;
import com.tistory.pentode.vo.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAO boardMapper;

	@Override
	@Transactional
	public List<BoardVO> selectBoardList() throws Exception {
		return boardMapper.selectBoardList();
	}

	@Override
	public void insertBoard(BoardVO boardVO) {
		boardMapper.insertBoard(boardVO);
	}
}
