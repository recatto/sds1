package com.dev.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.dspesquisa.entities.Record;


public interface RecordRepository extends JpaRepository<Record, Long>{

}
