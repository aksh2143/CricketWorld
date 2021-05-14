package com.example.demo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.beans.Team;
import com.example.demo.beans.Tournament;

@Controller
public class TournamentController extends BaseController{

	@GetMapping("/createTournament")
	public void createTournament() {
		
		List<Team> allTeams = teamService.getAllTeams();
		
		Tournament tr = new Tournament();
		tr.setTournamentName("IPL");
		tr.setParticipantTeams(allTeams);
		
		tournamentService.generateTournament(tr);
	}
	
}
