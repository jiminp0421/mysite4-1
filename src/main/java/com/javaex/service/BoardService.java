package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.BoardDao;
import com.javaex.vo.BoardVo;


@Service
public class BoardService {
	
	@Autowired
	private BoardDao boardDao;
	
	//게시판 리스트
	
	public List<BoardVo> showBoardList () {
		
		System.out.println("1 service.boardList");
		
		List<BoardVo> bList = boardDao.boardList();
		
		
		return bList;
	}
	
	public BoardVo read (int no) {
		System.out.println("2 service.read");
		
		
		return boardDao.read(no);
	}
	
	public int insert(BoardVo boardVo) {
		
		System.out.println("3 service.insert");
		
		return boardDao.insert(boardVo);
	}
	
	//게시판 삭제하기
	public int delete (int no) {
		System.out.println("4 service.delete");
		
		return boardDao.delete(no);
	}
	
	

}
