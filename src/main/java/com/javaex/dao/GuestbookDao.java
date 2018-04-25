package com.javaex.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.GuestVo;

@Repository
public class GuestbookDao {

	@Autowired
	private SqlSession sqlSession;
	
	public void insert(GuestVo vo) {
		sqlSession.insert("guestbook.insert", vo);
	}
	
	public List<GuestVo> getList() {
		return sqlSession.selectList("guestbook.list");
	}

	public int delete(HashMap<String, Object> map) {
		return sqlSession.delete("guestbook.delete", map);
	}
	

}
