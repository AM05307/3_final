package com.playdata.admin.board.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.playdata.admin.board.dao.BoardAdminDao;
import com.playdata.admin.board.model.BoardListDto;

@Service ////service�� dao�� �θ� 
public class BoardAdminServiceImpl implements BoardAdminService {

	
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<BoardListDto> boardMenu() {
	System.out.println("[BoardAdminServiceImpl] dao�� boardMenu���� ");
		BoardAdminDao boardAdminDao = sqlSession.getMapper(BoardAdminDao.class);
		return boardAdminDao.boardMenu();
	
	}

}









