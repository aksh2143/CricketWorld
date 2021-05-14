package com.example.demo.services.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.Player;

@Service
public class PlayerServiceImpl implements PlayerService{

	@Autowired PlayerRepository playerRepository;
	
	@Override
	public Player addNewPlayerToTeam(Player player) {
		
	Player p =	playerRepository.save(player);
		
		return p;
	}

}
