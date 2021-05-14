package com.example.demo.services.tournament;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.Tournament;

@Service
public class TournamentServiceImpl implements TournamentService{

	@Autowired
	TournamentRepository TournamentRepository;
	
	@Override
	public Tournament generateTournament(Tournament tournament) {
		return TournamentRepository.save(tournament);
	}

}
