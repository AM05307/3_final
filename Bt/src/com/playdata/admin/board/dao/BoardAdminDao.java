package com.playdata.admin.board.dao;

import java.util.List;

import com.playdata.admin.board.model.BoardListDto;
//dao�� db�� crud ȣ�� 
public interface BoardAdminDao {
	List<BoardListDto> boardMenu();
	
}
