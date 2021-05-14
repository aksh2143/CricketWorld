package com.example.demo.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Team {

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE) 
	private int teamId;
	
	@Column(unique = true)
	private String teamName;
	
	@OneToMany(mappedBy = "team", cascade = CascadeType.PERSIST)
	private List<Player> players;
	
	/*
	 * @ManyToOne(targetEntity = Tournament.class) private int tournamentId;
	 */
	
	
}
