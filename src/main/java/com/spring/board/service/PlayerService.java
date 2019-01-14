package com.spring.board.service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.spring.board.dao.PlayerDao;
import com.spring.board.dto.PlayerDto;
import com.spring.board.form.BoardForm;

@Service
public class PlayerService {
	
	@Autowired
	private PlayerDao playerDao;
	
	public List<PlayerDto> getBoardList(PlayerDto playerDto) throws Exception {
		 
        return playerDao.getPlayerList(playerDto);
    }
}