package com.example.demo.universite;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Collection;

@Entity
public class Salle implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numSalle;
	private String nomSalle;
	private Long CpctSalle;
	@JsonIgnore
	@OneToMany(mappedBy = "salle")
	private List<Seance> seance;

	public Long getNumSalle() {
		return numSalle;
	}

	public void setNumSalle(Long numSalle) {
		this.numSalle = numSalle;
	}

	public String getNomSalle() {
		return nomSalle;
	}

	public void setNomSalle(String nomSalle) {
		this.nomSalle = nomSalle;
	}

	public Long getCpctSalle() {
		return CpctSalle;
	}

	public void setCpctSalle(Long cpctSalle) {
		CpctSalle = cpctSalle;
	}

	public List<Seance> getSeance() {
		return seance;
	}

	public void setSeance(List<Seance> seance) {
		this.seance = seance;
	}

}