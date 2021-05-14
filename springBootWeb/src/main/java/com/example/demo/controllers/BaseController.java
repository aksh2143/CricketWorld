package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.services.player.PlayerService;
import com.example.demo.services.team.TeamService;
import com.example.demo.services.tournament.TournamentService;

public abstract class BaseController {

	@Autowired
	TeamService teamService;
	
	@Autowired
	PlayerService playerService;
	
	@Autowired
	TournamentService tournamentService;
	
}
