package com.tproject.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tproject.dspesquisa.entities.Game;
import com.tproject.dspesquisa.entities.Genre;
import com.tproject.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
