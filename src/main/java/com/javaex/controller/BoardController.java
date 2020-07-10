package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.javaex.service.BoardService;
import com.javaex.vo.BoardVo;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	
	//게시판 리스트
	@RequestMapping("/boardList")
	public String boardList(Model model) {
		
		System.out.println("C.boardlist");
		
		List<BoardVo> bList = boardService.showBoardList();
		
		model.addAttribute("bList", bList);
		
		return "/board/list";
	}
	
	//게시판 읽어오기
	
	@RequestMapping("/boardRead")
	public String boardRead(Model model, @RequestParam ("no") int no) {
		
		System.out.println("C.boardRead");
		
		
		model.addAttribute("rNo", boardService.read(no));
		System.out.println(model.toString());
		System.out.println(no);
		
		return "/board/read";
	}
	
	//게시판 글쓰기폼
	@RequestMapping("/writeForm")
	public String writeForm() {
	
		return "/board/writeForm";
	}
	
	//게시판 글쓰기
	@RequestMapping("/write")
	public String write(@ModelAttribute BoardVo boardVo) {
		
		System.out.println("C.boardWrite");
		

		boardService.insert(boardVo);
		System.out.println(boardVo);
		return "redirect:/board/boardList";
	}
	
	
	//게시판 삭제하기
	@RequestMapping("/delete")
	public String delete(@RequestParam("user_no") int no) {
		
		System.out.println("C.delete");
		System.out.println(no);
		
		boardService.delete(no);
		
		return "redirect:/board/boardList";
	}
	

}
