package com.tproject.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tproject.dspesquisa.entities.Game;
import com.tproject.dspesquisa.entities.Genre;
import com.tproject.dspesquisa.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {

}
