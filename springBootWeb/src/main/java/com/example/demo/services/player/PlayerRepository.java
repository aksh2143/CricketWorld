package com.example.demo.services.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer>{

}
