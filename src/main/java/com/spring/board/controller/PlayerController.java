package com.spring.board.controller;

import java.util.List; 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.board.dto.PlayerDto;
import com.spring.board.service.PlayerService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@Controller
@RequestMapping(value = "/board")
public class PlayerController {
	
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    
	@Autowired
	private PlayerService playerService;
	
    @RequestMapping( value = "/playerList")
    public String getBoardList(HttpServletRequest request, HttpServletResponse response) throws Exception{
        
        return "board/playerList";
    }
    
    @RequestMapping(value="/getPlayerList")
    @ResponseBody
    public List<PlayerDto> getPlayerList(HttpServletRequest request, HttpServletResponse response, PlayerDto playerDto) throws Exception{
    	List<PlayerDto> playerList = playerService.getBoardList(playerDto);
    	 
        return playerList;
    }
 
}