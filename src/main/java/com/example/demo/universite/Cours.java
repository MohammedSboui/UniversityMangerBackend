package com.example.demo.universite;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Collection;

@Entity
public class Cours implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codeCours;
	private String libelleCours;
	private String salleCours;

	@OneToMany(mappedBy = "cours")
	@JsonIgnore
	private List<Seance> seance;

	public Long getCodeCours() {
		return codeCours;
	}

	public void setCodeCours(Long codeCours) {
		this.codeCours = codeCours;
	}

	public String getLibelleCours() {
		return libelleCours;
	}

	public void setLibelleCours(String libelleCours) {
		this.libelleCours = libelleCours;
	}

	public String getSalleCours() {
		return salleCours;
	}

	public void setSalleCours(String salleCours) {
		this.salleCours = salleCours;
	}

	public List<Seance> getSeance() {
		return seance;
	}

	public void setSeance(List<Seance> seance) {
		this.seance = seance;
	}

}