package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.BookDao;
import com.javaex.vo.GuestVo;

@Service
public class BookService {
	
	@Autowired
	private BookDao bookDao;
	
	//방명록 리스트
	public List<GuestVo> list(GuestVo guestVo) {
		System.out.println("bookService.list");
		
		List<GuestVo> gList = bookDao.getGuestBookList();
		
		System.out.println(gList.toString());
		
		
		return gList;
	}
	
	
	public int write(GuestVo guestVo) {
		System.out.println("bookService.insert");
		
		int count = bookDao.guestBookinsert(guestVo);
		
		return count;
	}
	
	public int delete(GuestVo guestVo) {
		System.out.println("service/delete");
		
		int count = bookDao.guestBookdelete(guestVo);
		
		return count;
	}

}
