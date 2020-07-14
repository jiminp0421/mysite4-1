package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.RboardVo;

@Repository
public class RboardDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<RboardVo> getSelectLists() {
		System.out.println("DaoList");
		
		List<RboardVo> rboardVo  = sqlSession.selectList("rboard.selectList");
		
		
		return rboardVo;
	}

}
