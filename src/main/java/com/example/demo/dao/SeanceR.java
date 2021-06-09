package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.universite.Seance;

@RepositoryRestResource //exposer une api pour l'application
public interface SeanceR extends JpaRepository<Seance, Long >{

}