package com.tproject.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tproject.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
