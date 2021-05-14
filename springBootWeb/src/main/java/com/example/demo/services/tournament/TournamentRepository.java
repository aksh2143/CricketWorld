package com.example.demo.services.tournament;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.Tournament;

@Repository
public interface TournamentRepository extends JpaRepository<Tournament, Integer>{

}
