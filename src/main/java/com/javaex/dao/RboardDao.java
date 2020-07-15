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
	
	public RboardVo getSelectOne(int no) {
		
		RboardVo rboardVo = sqlSession.selectOne("rboard.read", no);
		
		return rboardVo;
	}
	
	public int getupdate(int no) {
		
		int hit = sqlSession.update("rboard.updateHit", no);
		
		return hit;
	}
	
	
	
	public int insert(RboardVo rboardVo) {
		System.out.println("dao/insert");
		int result = sqlSession.update("rboardInsert", rboardVo);
		
		return result;
	}

}
