package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.universite.Groupe;

@RepositoryRestResource //exposer une api pour l'application
public interface GroupeR extends JpaRepository<Groupe, Long >{

}