package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaex.service.RboardService;
import com.javaex.vo.RboardVo;



@Controller
@RequestMapping("/rboard")
public class RboardController {
	
	
	@Autowired
	private RboardService rboardService;
	
	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("1.rboard");
		List<RboardVo> rboardVo = rboardService.list();
		System.out.println(rboardVo.toString());
		
		model.addAttribute("bList", rboardVo);
		
		return "/rboard/list";
	}

}
