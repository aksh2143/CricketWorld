package com.example.demo.services.team;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer>{

	public Team findByTeamName(String teamName);
	
}
