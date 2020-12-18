package com.dev.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
