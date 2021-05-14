package com.example.demo.beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Tournament {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int tournamentId;

	public int getTournamentId() {
		return tournamentId;
	}

	public void setTournamentId(int tournamentId) {
		this.tournamentId = tournamentId;
	}

	public String getTournamentName() {
		return tournamentName;
	}

	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}

	public List<Team> getParticipantTeams() {
		return participantTeams;
	}

	public void setParticipantTeams(List<Team> participantTeams) {
		this.participantTeams = participantTeams;
	}

	@Column
	String tournamentName;
	
	@OneToMany(targetEntity = Team.class)
	private List<Team> participantTeams;
}
