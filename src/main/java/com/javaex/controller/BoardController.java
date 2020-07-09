package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaex.service.BoardService;
import com.javaex.vo.BoardVo;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	
	//게시판 리스트
	@RequestMapping("/boardList")
	public String boardList(BoardVo boardVo) {
		
		System.out.println("boardlist");
		
		List<BoardVo> bList = boardService.boardList(boardVo);
		
		return "/board/list";
	}
	

}
