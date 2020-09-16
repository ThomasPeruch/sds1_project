package com.tproject.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tproject.dspesquisa.entities.Game;
import com.tproject.dspesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
