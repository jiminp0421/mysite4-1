package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.RboardDao;
import com.javaex.vo.RboardVo;


@Service
public class RboardService {
	
	@Autowired
	private RboardDao rboardDao;
	
	public List<RboardVo> list() {
		System.out.println("Service list");
		

		List<RboardVo> rboardVo  = rboardDao.getSelectLists();
		
		return rboardVo;
	}
	
	public RboardVo read(int no) {
		System.out.println("글 읽기 서비스");
		
		RboardVo rboardVo = rboardDao.getSelectOne(no);
		
		
		return rboardVo;
		
	}
	
	public int count(int no) {
		System.out.println("글 조회수 찾기");
		
		int hit = rboardDao.getupdate(no);
		
		return hit;
	}
	
	public int write(RboardVo rboardVo) {
		System.out.println("글쓰기 서비스");
		
		int result = rboardDao.insert(rboardVo);
		
		return result;
	}
	
	 

}
