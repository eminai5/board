package com.spring.board.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.board.dto.PlayerDto;

@Repository
public class PlayerDao {
	
	@Resource(name="sqlSession")
	private SqlSession sqlSession;
	
	private static final String NAMESPACE = "com.spring.board.playerMapper";
	 
	public List<PlayerDto> getPlayerList(PlayerDto playerDto) throws Exception {
		return sqlSession.selectList(NAMESPACE + ".getPlayerList"); 
	}
}
