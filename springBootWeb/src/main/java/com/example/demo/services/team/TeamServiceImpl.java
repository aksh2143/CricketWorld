package com.example.demo.services.team;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.Team;

@Service
public class TeamServiceImpl implements TeamService {

	@Autowired TeamRepository teamRepository;
	
	@Override
	public Team addNewTeam(String teamName) {
		
		Team team = teamRepository.findByTeamName(teamName);
		
		if(team == null) {
			Team newteam = new Team();
			newteam.setTeamName(teamName);
			teamRepository.save(newteam);
		}
		
		return team;
	}

	@Override
	public Team getTeamByName(String teamName) {
		
		Team team = teamRepository.findByTeamName(teamName);
		
		return team;
	}

	@Override
	public Team getTeamDetails(String teamName) {
		return null;
	}

	@Override
	public List<Team> getAllTeams() {
		return teamRepository.findAll();
	}

}
