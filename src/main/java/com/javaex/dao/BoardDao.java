package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.BoardVo;

@Repository
public class BoardDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	//보드 리스트
	
	public List<BoardVo> getBoardList() {
		List<BoardVo> boardBookList = sqlSession.selectList("board.getBoardList");
		System.out.println("BoardDaoList");
		
		return boardBookList;
	}
	
	

}
