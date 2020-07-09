package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.GuestVo;

@Repository
public class BookDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	
	//방명록 리스트
	
	public List<GuestVo> getGuestBookList() {
		List<GuestVo> guestBookList = sqlSession.selectList("guest.getGuestBookList");
		System.out.println("guestBookList");
		
		
		return guestBookList;
	}
	
	
	public int guestBookinsert(GuestVo guestVo) {
		System.out.println("bookDao.insert");
		
		int count = sqlSession.insert("guest.insert", guestVo);
		
		return count;
	}
	
	public int guestBookdelete(GuestVo guestVo) {
		System.out.println("bookDao.delete");
		
		int count = sqlSession.delete("guest.delete", guestVo);
		return count;
	}

}
