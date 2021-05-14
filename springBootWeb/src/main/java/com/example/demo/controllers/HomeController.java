package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.beans.Player;
import com.example.demo.beans.Team;

@Controller
public class HomeController extends BaseController{

	
	@GetMapping("/getTeam")
	public Team getTeamDetails(@RequestParam(name = "teamName")String teamName){
		try {
			return teamService.getTeamByName(teamName);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@GetMapping("/createTeam")
	public void createTeam(@RequestParam(name = "newTeamName")String newTeamName){
		try {
			teamService.addNewTeam(newTeamName);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@GetMapping("/createNewPlayer")
	public void addPlayerToTeam(@RequestParam(name = "firstName") String firstName,
			@RequestParam(name = "lastName") String lastName,
			@RequestParam(name = "teamName") String teamName
			) {
		
		try {
			
		Team team = teamService.getTeamByName(teamName);
		
		if(team != null) {
			Player pl = new Player(firstName, lastName);
			pl.setTeam(team);
			
			playerService.addNewPlayerToTeam(pl);
		}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
