package com.example.demo.services.team;

import java.util.List;

import com.example.demo.beans.Team;

public interface TeamService {

	public Team addNewTeam(String teamName);
	
	public Team getTeamByName(String teamName);
	
	public Team getTeamDetails(String teamName);
	
	public List<Team> getAllTeams();
}
